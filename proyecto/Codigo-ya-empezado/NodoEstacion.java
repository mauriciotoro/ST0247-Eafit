/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruteovehiculoselectricos;

/**
 *
 * @author ljpalaciom
 */
public class NodoEstacion extends Nodo {

    int tipo;

    public NodoEstacion(int id, int tipo) {
        super(id);
        this.tipo = tipo;
    }
    
    public static int calcularTiempoRecarga(){
    //implementar
            return 0;
    }
}
