/***
 * Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete. Si el peso es menor de 5 kg y la región es "local",
 * el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional". Para cualquier otro caso, el costo es de $15.
 * @author PATO PC
 */
import java.util.Scanner;
public class Costo_envio_paquetes {
    public static void main(String[] args) {
        String region;
        double kg;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu región: (Local/ Nacional/ Internacional) ");
        region = teclado.next();
        System.out.println("Ingresa tu peso en kilogramos: ");
        kg = teclado.nextDouble();
        if ((kg >= 5 && kg <=10) && (region.equals("Nacional")))
        {
            System.out.println("El costo de envío es de $10");
        }
        else 
            if ((kg < 5) && (region.equals("Local")))
            {
                System.out.println("El costo de envío es de $5");
            }
            else 
                System.out.println("El costo de envío es de 15$");
    } 
}

/***
 * Ingresa tu región: (Local/ Nacional/ Internacional) 
 * Nacional
 * Ingresa tu peso en kilogramos: 
 * 7
 * El costo de envío es de $10
 */
