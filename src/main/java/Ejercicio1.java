import java.util.Scanner;

public class Ejercicio1 {
    public Ejercicio1(){
        System.out.println("El resultado de la suma es: " + suma());
    }
    public static int suma(){
        int numero1;
        int numero2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Primer número: ");
        numero1 = scan.nextInt();
        System.out.println("Segundo número: ");
        numero2 = scan.nextInt();

        return numero1 + numero2;
    }
}
