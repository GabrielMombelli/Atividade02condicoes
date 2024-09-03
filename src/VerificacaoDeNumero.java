import java.util.Scanner;

public class VerificacaoDeNumero {
    public static void main(String[] args) {


        Double numero = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o numero que deseja verificar: ");
        numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        }else{
            System.out.println("Zero");
        }

    }
}


