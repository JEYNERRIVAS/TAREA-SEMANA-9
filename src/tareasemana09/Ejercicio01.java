
package tareasemana09;

/*1.- Crear un programa en Java que permita registrar el peso de las n personas
en un arreglo de datos. Visualizar el peso promedio de las personas. 
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio01 {
public static void main(String[] args) {
    //declaracion de variables
    int n;
    double peso,acumpeso=0.0,pesopromedio;
   Scanner lectura=new Scanner(System.in);
   DecimalFormat formato=new DecimalFormat("##.##");
    System.out.print("Ingrese la cantidad de personas : ");
    n=lectura.nextInt();
    double[]arreglopeso=new double[n];
    //entrada de datos
    for (int i = 0; i < n; i++) {
        System.out.print("Ingrese el peso de la persona "+(i+1)+" : ");
        peso=lectura.nextDouble();
        arreglopeso[i]=peso;  
    }
    //proceso de datos
      for (int i = 0; i < n; i++) {
        acumpeso+=arreglopeso[i];  
      }   
    pesopromedio=acumpeso/n;
    System.out.println("El peso promedio es : "+formato.format(pesopromedio));
    }
    
}
