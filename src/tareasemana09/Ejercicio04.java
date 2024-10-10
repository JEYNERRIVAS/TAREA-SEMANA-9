
package tareasemana09;

/*Crear un programa en Java que permita almacenar en un arreglo de datos cinco 
nombres de personas ingresadas y realizar una búsqueda mediante un nombre
ingresado. Visualizar un mensaje indicando si la persona existe o no existe y 
la posición del número en el arreglo de datos.
POR EJEMPLO:
Ingrese el nombre de la persona 1 : JESUS
Ingrese el nombre de la persona 2 : MATEO
Ingrese el nombre de la persona 3 : MARCOS
Ingrese el nombre de la persona 4 : JUAN
Ingrese el nombre de la persona 5 : LUCAS
Buscar el nombre : JUAN
Si existe la persona en la posicion : 4
 */
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[]args){
        int posicion=-1;
        String nombre, busNomb,mensaje="";
        Scanner lectura=new Scanner(System.in);
        String[]arreglonomb=new String[5];
        // entrada de datos
        for (int i = 0; i < arreglonomb.length; i++) {
         System.out.print("Ingrese el nombre de la persona "+(i+1)+" : ");
        nombre=lectura.next();  
        arreglonomb[i]=nombre;
        
        }
        System.out.print("Buscar el nombre : ");
        busNomb=lectura.next();
        //proceso de datos
          for (int i = 0; i < arreglonomb.length; i++) {
               if (arreglonomb[i].equals(busNomb)) {
                   mensaje="Si existe la persona";
                   posicion=i;
                   i=arreglonomb.length+1;
                   
                   
               }else{
                   mensaje="No existe la persona";  
              }
          }
          if (posicion!=-1) {
              System.out.println(mensaje +" en la posicion : " +(posicion+1));
            
        } else {
        
          System.out.println(mensaje);
    }
    
    }
}
