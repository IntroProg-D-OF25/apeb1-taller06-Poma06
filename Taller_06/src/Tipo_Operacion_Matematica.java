
import java.util.Scanner;

/***
 * Determinar el tipo de operación matemática. Dado un número del 1 al 4 que representa una operación matemática básica (suma, resta, multiplicación, división),
 * muestra el nombre de la operación correspondiente. Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente.
 * @author PATO PC
 */
public class Tipo_Operacion_Matematica {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero del 1 al 4");
        numero = teclado.nextInt();
        switch (numero)
        {
            case 1 : 
                System.out.println("Suma");
                break;
            case 2 : 
                System.out.println("Resta");
                break;
            case 3 :
                System.out.println("Multiplicación");
                break;
            case 4 : 
                System.out.println("División");
                break;
            default : System.out.println("ERROR");
        }
    }
}
