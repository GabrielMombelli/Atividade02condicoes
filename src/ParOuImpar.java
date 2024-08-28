import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Integer numero = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva seu numero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        }else {
            System.out.println("Impar");
            }

    }
}
