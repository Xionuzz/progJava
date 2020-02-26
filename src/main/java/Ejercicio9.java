import java.util.Scanner;

public class Ejercicio9 {
    public Ejercicio9(){
        Scanner scan = new Scanner(System.in);
        int sumatorio = 0;
        int numero;

        System.out.println("Introduce un número: ");
        numero = scan.nextInt();

        devolver(numero, sumatorio);
    }
    public static void devolver(int numero, int sumatorio){
        for (int i = numero; i >= 0; i--) {
            sumatorio+=i;
            System.out.println(sumatorio);
        }
    }
}
