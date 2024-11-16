/***
 * Clasificación de un triángulo Dado tres valores que representan las longitudes de los lados de un triángulo, determinar su tipo. Las reglas son:

 * Si todos los lados son iguales, mostrar "Triángulo equilátero".
 * Si dos lados son iguales, mostrar "Triángulo isósceles".
 * Si todos los lados son diferentes, mostrar "Triángulo escaleno".
 * Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".
 * @author PATO PC
 */
import java.util.Scanner;
public class Clasificacion_de_un_triangulo {
    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la longitud del lado 1");
        lado1 = teclado.nextDouble();
        System.out.println("Ingrese la longitud del lado 2");
        lado2 = teclado.nextDouble();
        System.out.println("Ingrese la longitud del lado 3");
        lado3 = teclado.nextDouble();
        if ((lado1 == lado2) && (lado2 == lado3))
        {
            System.out.println("Es un triángulo equilátero");
        }
        else 
            if (lado1 == lado2)
            {
                System.out.println("Es un triángulo isóseles");
            }
            else 
                if ((lado1 != lado2) && (lado2 != lado3))
                {
                    System.out.println("Es un triángulo escaleno");
                }
                else 
                    if (lado1 + lado2 < lado3)
                    {
                        System.out.println("No es un triángulo");
                    }
        
    }
}

/***
 * Ingrese la longitud del lado 1
 * 10
 * Ingrese la longitud del lado 2
 * 10
 * Ingrese la longitud del lado 3
 * 20
 * Es un triángulo isóseles
 */