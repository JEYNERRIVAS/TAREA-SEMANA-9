
package tareasemana09;

/*3.- Crear un programa en Java que permita registrar las compras de los n 
personas en un arreglo de datos. Visualizar el total, promedio y compra mayor 
y menor.
por ejemplo: 
Ingrese la cantidad de personas : 5
Ingrese las compras 1 : 2500
Ingrese las compras 2 : 2600
Ingrese las compras 3 : 2700
Ingrese las compras 4 : 3545
Ingrese las compras 5 : 2140
El total de las compras es  : 13485.0
El promedio de compras es : 2697.0
La compra mayor es : 3545.0
La compra menor es : 2140.0
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio03 {

    public static void main(String[] args) {
        // Declarar las variables
        int n;
        double comp, totalcomp, promediocomp = 0.0, compmayor = 0.0, compmenor = Double.MAX_VALUE, acumcomp = 0.0;
        Scanner lectura = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("##.##");
        
        System.out.print("Ingrese la cantidad de personas : ");
        n = lectura.nextInt();
        double[] arregcomp = new double[n];
        
        // Entrada de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese las compras " + (i + 1) + " : ");
            comp = lectura.nextDouble();
            arregcomp[i] = comp;

            // Calcular compra mayor y menor
            if (comp > compmayor) {
                compmayor = comp;
            }
            if (comp < compmenor) {
                compmenor = comp;
            }
        }

        // Proceso de datos
        for (int i = 0; i < n; i++) {
            acumcomp += arregcomp[i];
        }
        totalcomp = acumcomp;
        promediocomp = totalcomp / n;

        System.out.println("El total de las compras es  : " + totalcomp);
        System.out.println("El promedio de compras es : " + formato.format(promediocomp));
        System.out.println("La compra mayor es : " + compmayor);
        System.out.println("La compra menor es : " + compmenor);
    }
}