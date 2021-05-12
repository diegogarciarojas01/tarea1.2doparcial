
/**
 * Write a description of class serie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class serie{
   public void sucesion(int num){
       for(int i=1; i < num; i++){
           System.out.println(num + "+" + i + "=" + (num+i));
        }
    }
    
    public void seriePadovan(int n){
        int nro1 = 1;
        System.out.print(nro1 + " ");
        int nro2 = 1;
        System.out.print(nro2 + " ");
        int nro3 = 1;
        System.out.print(nro3 + " ");
        int nroActual = 0;
        
        for(int i = 3; i<= n; i++){
            nroActual = nro3 + nro2;
            System.out.print(nroActual + " ");
            nro3 = nro2;
            nro2 = nro1;
            nro1 = nroActual;
        }
    }
    
}
