import java.util.*;
/**
 * This class contains algorithms for graphs
 * @author Mauricio Toro
 * @version 1
 */
public class GraphAlgorithms
{
     private static boolean bipartito(Graph g, int source)
     {
         ...
     }
 public static void main(String[] args)
 {
     //Ejemplo de Grafo Bipartito
     GraphAL gal = new GraphAL(7);
     gal.addArc(0,3,0);
     gal.addArc(0,4,0);
     gal.addArc(0,5,0);
     gal.addArc(1,3,0);
     gal.addArc(1,4,0);
     gal.addArc(1,5,0);
     gal.addArc(2,3,0);
     gal.addArc(2,4,0);
     gal.addArc(2,5,0);
      
     System.out.println("--Primera Matriz--");
     System.out.println(bipartito(gal, 0));
     
     //Ejemplo de Grafo NO Bipartito
     GraphAM gam = new GraphAM(7);
     gam.addArc(0,3,0);
     gam.addArc(0,1,0);
     gam.addArc(0,2,0);
     gam.addArc(1,3,0);
     gam.addArc(1,2,0);
     gam.addArc(1,5,0);
     gam.addArc(2,3,0);
     gam.addArc(2,4,0);
     gam.addArc(2,5,0);
      
     System.out.println("--Segunda Matriz--");
     System.out.println(bipartito(gam, 0));
}
}
