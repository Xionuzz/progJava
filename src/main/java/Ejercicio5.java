import java.util.Scanner;

public class Ejercicio5 {
    public Ejercicio5(){

        Scanner scan = new Scanner(System.in);

        String x;
        int veces;

        System.out.println("Introduce el caracter que desea imprimir: ");
        x = scan.nextLine();
        System.out.println("Introduce el número de veces que quieres que se imprima ese caracter: ");
        veces = scan.nextInt();
        imprimir(x, veces);
    }
    public static void imprimir(String x, int veces){

        for (int i = 0; i < veces; i++) {
            System.out.println(x);
        }

    }
}
