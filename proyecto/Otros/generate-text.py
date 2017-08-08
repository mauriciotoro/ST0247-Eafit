# -*- coding: utf-8 -*-
#Sistema de transformación de mapas en formato OSM XML a formato txt
#Autor: Mauricio

import codecs
import xml.etree.ElementTree
import math
arbol = xml.etree.ElementTree.parse('medellin_colombia-grande.osm').getroot()
archivo = codecs.open('medellin_colombia-grande.txt', mode="w", encoding="iso-8859-1")

latTable = dict()
lonTable = dict()

archivo.write( "Vertices. Formato: ID coordenadaY coordenadaX nombre" + "\n")
for vertice in arbol.findall('node'):
    name = ""
    for tag in vertice.findall('tag'):
        if tag.get('k') == "name":
            name = tag.get('v')
    latTable[vertice.get('id')] = vertice.get('lat')
    lonTable[vertice.get('id')] = vertice.get('lon')
    try: # por si hay problemas con utf=8
        archivo.write(vertice.get('id') + " " + vertice.get('lat') + " " + vertice.get('lon') + " " + name.decode('utf-8') + "\n")
    except:
        archivo.write(vertice.get('id') + " " + vertice.get('lat') + " " + vertice.get('lon') + " " +  "\n")

archivo.write( "\nArcos. Formato: ID ID distancia nombre " + "\n")
for calle in arbol.findall('way'):
    esCalle = False
    for tag in calle.findall('tag'):
        if tag.get('k') == "highway":
            esCalle = True
    oneway = False
    for tag in calle.findall('tag'):
        if tag.get('k') == "oneway":
            oneway = True
    if esCalle:
        name = "desconocido"
        for tag in calle.findall('tag'):
            if tag.get('k') == "name":
                name = tag.get('v')
        listaPuntos = []
        for nodito in calle.findall('nd'):
           listaPuntos += [nodito.get('ref')]
        for x in range(0, len(listaPuntos)-1):
            if latTable.has_key(listaPuntos[x]) and latTable.has_key(listaPuntos[x]) and lonTable.has_key(listaPuntos[x]) and lonTable.has_key(listaPuntos[x+1]):
                distancia = math.sqrt(pow(float(latTable[listaPuntos[x]]) - float(latTable[listaPuntos[x+1]]),2) + pow(float(lonTable[listaPuntos[x]]) - float(lonTable[listaPuntos[x+1]]),2))*100000
                try: # por si hay problemas con utf-8
                    archivo.write((listaPuntos[x] + " " + listaPuntos[x+1] + " " + str(distancia) + " " + name + "\n"))
                except:
                    archivo.write((listaPuntos[x] + " " + listaPuntos[x+1] + " " + str(distancia) +  "\n"))
                if not oneway:
                    try: # por si hay problemas con utf-8
                        archivo.write((listaPuntos[x+1] + " " + listaPuntos[x] + " " + str(distancia) + " "  + name.decode('utf-8') + "\n") )
                    except:
                        archivo.write((listaPuntos[x+1] + " " + listaPuntos[x] + " " + str(distancia) + " "  +  "\n") )

print("fin")
archivo.close()
