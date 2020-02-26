import java.util.Scanner;

public class Ejercicio6 {
    public Ejercicio6(){

        Scanner scan = new Scanner(System.in);

        char letra;
        int veces;
        int lineas;

        System.out.println("Introduce el caracter que deseas imprimir: ");
        letra = scan.nextLine().charAt(0);
        System.out.println("Introduce el número de veces que deseas impromirlo: ");
        veces = scan.nextInt();
        System.out.println("Introduce las filas: ");
        lineas = scan.nextInt();

        imprimir(letra, veces, lineas);
    }
    public static void imprimir(char letra, int veces, int lineas){
        for (int i = 0; i < lineas; i++) {
            for (int j = 0; j < veces; j++) {
                System.out.printf("%s", letra);
            }
            System.out.println("");
        }
    }
}
