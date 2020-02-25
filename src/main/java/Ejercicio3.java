import java.util.Scanner;

public class Ejercicio3 {
    public Ejercicio3(){
    Scanner scan = new Scanner(System.in);

    int numero1;
    int numero2;

    System.out.println("Primer número: ");
    numero1 = scan.nextInt();
    System.out.println("Segundo número: ");

    numero2 = scan.nextInt();

        System.out.printf("El mayor número es: " + "%d\n", mayorNumero(numero1, numero2));
    }

    public static int mayorNumero(int numero1, int numero2){

       return Math.max(numero1, numero2);
    }
}
