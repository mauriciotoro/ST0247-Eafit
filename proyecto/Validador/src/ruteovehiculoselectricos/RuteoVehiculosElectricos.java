package ruteovehiculoselectricos;

/**
 *
 * @author ljpalaciom, Mauricio Toro
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class RuteoVehiculosElectricos {

    int n, m, u, breaks;
    double r, speed, Tmax, Smax, st_customer, Q;
    Digraph mapa;
    short tipoEstacion[];
    float pendienteFuncionCarga[];
    String filename;
    Pair<Float, Float>[] coordenadas;
    ArrayList<ArrayList<Pair<Integer, Float>>> rutas;
    float tiempoSolucion;

    public RuteoVehiculosElectricos(String filename) {
        this.filename = filename;
        BufferedReader lector;
        String linea;
        String lineaPartida[];
        try {
            lector = new BufferedReader(new FileReader("../DataSets/"+filename));
            double[] valores = new double[10];
            for (int i = 0; i < 10; i++) {
                linea = lector.readLine();
                lineaPartida = linea.split(" ");
                valores[i] = Float.parseFloat(lineaPartida[2]);
            }

            n = (int) valores[0];
            m = (int) valores[1];
            u = (int) valores[2];
            breaks = (int) valores[3];
            r = valores[4];
            speed = valores[5];
            Tmax = valores[6];
            Smax = valores[7];
            st_customer = valores[8];
            Q = valores[9];

            lector.readLine();
            lector.readLine();
            lector.readLine();

            coordenadas = new Pair[n];
            tipoEstacion = new short[n];
            mapa = new DigraphAM(n);
            for (int i = 0; i <= m; i++) {
                linea = lector.readLine();
                lineaPartida = linea.split(" ");
                coordenadas[Integer.parseInt(lineaPartida[0])] = new Pair(Float.parseFloat(lineaPartida[2]), Float.parseFloat(lineaPartida[3]));
                tipoEstacion[Integer.parseInt(lineaPartida[0])] = -1; //-1 significa cliente
            }

            for (int i = 0; i < u; i++) {
                linea = lector.readLine();
                lineaPartida = linea.split(" ");
                System.out.println(Integer.parseInt(lineaPartida[0]));
                coordenadas[Integer.parseInt(lineaPartida[0])] = new Pair(Float.parseFloat(lineaPartida[2]), Float.parseFloat(lineaPartida[3]));
                tipoEstacion[Integer.parseInt(lineaPartida[0])] = Short.parseShort(lineaPartida[5]);
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mapa.addArc(i, j, Math.sqrt(
                            Math.pow(coordenadas[i].first - coordenadas[j].first,
                                    2)
                            + Math.pow(coordenadas[i].second - coordenadas[j].second, 2)
                    )
                    );
                }
            }

            pendienteFuncionCarga = new float[3];
            lector.readLine();
            lector.readLine();
            lector.readLine();
            for (int i = 0; i < 3; ++i) {
                linea = lector.readLine();
                lineaPartida = linea.split(" ");
                pendienteFuncionCarga[i] = Float.parseFloat(lineaPartida[3]);
            }
            lector.readLine();
            lector.readLine();
            lector.readLine();
            for (int i = 0; i < 3; ++i) {
                linea = lector.readLine();
                lineaPartida = linea.split(" ");
                pendienteFuncionCarga[i] = Float.parseFloat(lineaPartida[3]) / pendienteFuncionCarga[i];
            }
            
            // Leer respuesta
            rutas = new  ArrayList();
            lector = new BufferedReader(new FileReader("../DataSets/respuesta-"+filename));
            String respuesta =  lector.lines().collect(Collectors.joining());
            respuesta = respuesta.substring(1,respuesta.length()-1);
            String[] rutasRespuesta = respuesta.split("],");
            for (String ruta : rutasRespuesta){
                ArrayList<Pair<Integer, Float>> rutaArrayList = new ArrayList();
                ruta = ruta.substring(1);
                String parejas[] = ruta.split("}, ");
                for (String pareja : parejas){                    
                  pareja = pareja.substring(1);
                  String[] elementos = pareja.split(",");
                  elementos[0] = elementos[0].replace("{","");
                  elementos[1] = elementos[1].replace("}","");
                  elementos[1] = elementos[1].replace("]","");
                  Pair<Integer, Float> parejaPair = new Pair(Integer.parseInt(elementos[0]), Float.parseFloat(elementos[1]) );
                  rutaArrayList.add(parejaPair);                  
                }
                rutas.add(rutaArrayList);                    
            }
                
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Override
    public String toString() {
        return "RuteoVehiculosElectricos{" + "r=" + r + ", speed=" + speed + ", Tmax=" + Tmax + ", Smax=" + Smax + ", st_customer=" + st_customer + ", Q=" + Q + ", tiempoSolucion=" + tiempoSolucion + '}';
    }

    public void validar(){
        
        int i = 0;
        for (ArrayList<Pair<Integer, Float>> ruta : rutas){                    
            float tiempo = 0;
            double carga = (double)Q;
            for (int j =0; j< ruta.size() - 1; j++){
                Pair<Integer, Float> parejaJ = ruta.get(j);
                Pair<Integer, Float> parejaJPlus1 = ruta.get(j+1);
                carga = carga - mapa.getWeight(parejaJ.first,parejaJPlus1.first)*r;
                if (tipoEstacion[parejaJ.first] >= 0)
                    carga = carga + pendienteFuncionCarga[tipoEstacion[parejaJ.first]]*parejaJ.second;
                tiempo += parejaJ.second;            
            }
            if (tiempo > Tmax)
               System.out.println("La ruta "+i+" supera el Tmax");
            ++i;
            System.out.println(i + " " + carga);
            if (carga < 0)
                System.out.println("La ruta "+i+" no respeta la restricción de carga");
        }
        
        
        
    }

    public static void main(String[] args) {
        RuteoVehiculosElectricos problema1 = new RuteoVehiculosElectricos("dummy.txt");     
        problema1.validar();


    }

}
