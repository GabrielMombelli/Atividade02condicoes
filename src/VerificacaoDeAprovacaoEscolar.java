import java.util.Scanner;

public class VerificacaoDeAprovacaoEscolar {
    public static void main(String[] args) {

        Double mediaFinal = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva sua média final: ");
        mediaFinal = sc.nextDouble();

        if (mediaFinal >= 7) {
            System.out.println("Aprovado");
        }else if (mediaFinal >= 5 && mediaFinal < 7) {
                System.out.println("Recuperação");
            } else if (mediaFinal < 5) {
                System.out.println("Reprovado");
            }

        }
    }

