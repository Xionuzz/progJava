import java.util.Scanner;


public class Ejercicio2 {
    public Ejercicio2(){
    Scanner scan = new Scanner(System.in);

    double radio;

    System.out.println("Introduce el radio que quieres calcular: ");
    radio = scan.nextDouble();

    System.out.printf("El área es: " + "%.2f\n", area(radio));
    System.out.printf("La longitud es: " + "%.2f\n", longitud(radio));

    }
    public static double area(double radio){

        return (radio * radio) * Math.PI;
    }

    public static double longitud(double radio){

        return radio * Math.PI * 2;

    }

}
