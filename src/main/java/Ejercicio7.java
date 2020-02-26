import java.util.Scanner;

public class Ejercicio7 {
    public Ejercicio7(){
        Scanner scan = new Scanner(System.in);
        int factorial = 1;
        int numero;

        System.out.println("Introduce el número para calcular su factorial: ");
        numero = scan.nextInt();

        calculo(numero, factorial);
    }
    public static void calculo(int numero, int factorial){
        while (numero!= 0){
            factorial = factorial * numero;
            numero--;

            System.out.println(factorial);
        }
        System.out.println("El resultado es: " + factorial);
    }
}
