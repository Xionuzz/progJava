import java.util.Scanner;

public class Ejercicio4 {
    public Ejercicio4(){

        Scanner scan = new Scanner(System.in);

        double numero1;
        double numero2;
        double numero3;
        double numero4;

        System.out.println("Primer número: ");
        numero1 = scan.nextDouble();
        System.out.println("Segundo número: ");
        numero2 = scan.nextDouble();
        System.out.println("Tercer número: ");
        numero3 = scan.nextDouble();
        System.out.println("Cuarto número: ");
        numero4 = scan.nextDouble();

        System.out.printf("El mayor de los cuatro números es: " + "%.2f\n", mayorNumero4(numero1, numero2, numero3, numero4));
    }

    public static double mayorNumero4(double numero1, double numero2, double numero3, double numero4){

        double mayor1 = Math.max(numero1, numero2);
        double mayor2 = Math.max(numero3, numero4);
        double mayorMayor = Math.max(mayor1, mayor2);

        return mayorMayor;
    }
}
