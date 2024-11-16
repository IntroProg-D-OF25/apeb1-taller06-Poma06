/***
 * Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de Sistemas Informáticos para programar su sistema de compras online, el cual calcule
 * el precio total de la compra para un cliente. Para ello, se necesita utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas), 
 * sin aplicar ciclos repetitivos.
 * @author PATO PC
 */
import java.util.Scanner;
public class Facturacion_de_2_productos {
    public static void main(String[] args) {
        double producto_1, producto_2, precio_total; 
        double gastos, descuento = 0, impuesto, subtotal, total_impuesto; 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer producto: ");
        producto_1 = teclado.nextDouble();
        System.out.println("Ingrese el valor del segundo producto: ");
        producto_2 = teclado.nextDouble();
        System.out.println("Ingrese el valor de los gastos: ");
        gastos = teclado.nextDouble();
        //CALCULAR SUBTOTAL, IMPUESTO Y TOTAL
        subtotal = producto_1 + producto_2;
        impuesto = subtotal * 0.10;
        total_impuesto = subtotal + impuesto;
        //CONDICIONES 
        if (subtotal > 5000){ 
            System.out.println("El envio será gratuito");
            gastos = 0;
        }
        else 
            if (subtotal > 1000){
                System.out.println("Su descuento será del 20%");
                descuento = total_impuesto * 0.20;
            }
            else 
                if (subtotal == 1000)
                {
                    System.out.println("Su descuento será del 5%");
                    descuento = total_impuesto * 0.05;
                }
        precio_total = total_impuesto - descuento + gastos;
        System.out.println("El costo fuera de impuesto es de: " + subtotal);
        System.out.println("El costo de impuestos es de: " + impuesto);
        System.out.println("El costo por envio es de: " + gastos);
        System.out.println("El costo total a pagar será de: " + precio_total);
    }
}

/***
 * Ingrese el valor del primer producto: 
 * 600
 * Ingrese el valor del segundo producto: 
 * 600
 * Ingrese el valor de los gastos: 
 * 40
 * Su descuento será del 20%
 * El costo fuera de impuesto es de: 1200.0
 * El costo de impuestos es de: 120.0
 * El costo por envio es de: 40.0
 * El costo total a pagar será de: 1096.0
 */
