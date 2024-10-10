
package tareasemana09;

/*Crear un programa en Java que permita almacenar cinco números en el arreglo  
a y b. Visualizar los valores del arreglo a y b en forma intercalada al arreglo c.

a[]=10 20 30 40 50
b[]=60 70 80 90 100
c[]=10 60 20 70 30 80……100

 */
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];  // El arreglo intercalado será del doble de tamaño (5 + 5)
        
        // Ingresar valores en el arreglo a
        System.out.println("Ingrese 5 números para el arreglo a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = lectura.nextInt();
        }
        
        // Ingresar valores en el arreglo b
        System.out.println("\nIngrese 5 números para el arreglo b:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = lectura.nextInt();
        }
        
        // Intercalar los valores de a y b en el arreglo c
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            c[j] = a[i];   // Poner el valor de a
            c[j + 1] = b[i];  // Poner el valor de b en la siguiente posición
            j += 2;  // Aumentamos en 2 para intercalar
        }
        
        // Visualizar los valores del arreglo c
        System.out.println("\nValores intercalados en el arreglo c:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
