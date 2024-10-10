package tareasemana09;

/*2.- Crear un programa en Java que permita registrar el ingreso económico de 
las n personas en un arreglo de datos. Visualizar ingreso promedio, 
ingreso mayor de las personas.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio02 {
    public static void main(String[]args){
        //declarar las variables
        int n;
        double ingreso,ingresopromedio,ingresomayor=0.0,acumingreso=0.0;
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("##.##");
        System.out.print("Ingrese la cantidad de personas : ");
        n=lectura.nextInt();
        double[]arregloingreso=new double[n];
        
        //entrada de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingreso de la persona "+(i+1)+" : ");
            ingreso=lectura.nextDouble();
            arregloingreso[i]=ingreso;
            if (ingreso>ingresomayor) {
                ingresomayor=ingreso;
                
            }
        }
        //proceso de datos
        for (int i = 0; i < n; i++) {
            acumingreso+=arregloingreso[i]; 
        }
        ingresopromedio=acumingreso/n;
        
        System.out.println("El ingreso promedio es : "+formato.format(ingresopromedio));
        System.out.println("El ingreso mayor es : "+ingresomayor);
        
        
    }
    
}
