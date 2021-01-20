
/**
 * Write a description of class dsfdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dsfdf
{
  public static int subarregloMax(int[] a)
  {
      int maximo = 0;
      for (int i = 0; i < a.length; i++)
      {
         int actual = 0;
         for (int j = i; j < a.length; j++)
         {
            actual = actual + a[j];
            if (actual > maximo)
               maximo = actual;
         }
      }
      return maximo;
  }
    
  
}
