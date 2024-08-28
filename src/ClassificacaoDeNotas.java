import java.util.Scanner;

public class ClassificacaoDeNotas {
    public static void main(String[] args) {

        Double nota = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a nota do aluno: ");
        nota = sc.nextDouble();

        if (nota >= 9) {
            System.out.println("Exelente");
        } else if (nota >= 7) {
            System.out.println("Bom");}
        else if (nota >= 5) {
            System.out.println("Satisfatório");
        } else if (nota < 5) {
            System.out.println("Insuficiente");}

    }
}
