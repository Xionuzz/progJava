import java.util.Scanner;

public class Ejercicio8 {
    public Ejercicio8(){
        Scanner scan = new Scanner(System.in);


        int numero1;
        int numero2;
        int numero3;
        int numero4;

        System.out.println("Introduce primer número: ");
        numero1 = scan.nextInt();
        System.out.println("Introduce segundo número: ");
        numero2 = scan.nextInt();
        System.out.println("Introduce tercer número: ");
        numero3 = scan.nextInt();
        System.out.println("Introduce cuarto número: ");
        numero4 = scan.nextInt();

        secuencia(numero1, numero2, numero3, numero4);


    }
    public static void secuencia(int numero1, int numero2, int numero3, int numero4){
        if(numero1 >= 0 && numero1 <= 9 == numero2 >= 0 && numero2 <= 9){
            System.out.println("Capicua");
        } else {
            System.out.println("No es");
        }
    }
}