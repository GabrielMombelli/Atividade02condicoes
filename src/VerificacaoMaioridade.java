import java.util.Scanner;

public class VerificacaoMaioridade {
    public static void main(String[] args) {

        Integer idade = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Maior do idade");
        } else if (idade < 18) {
            System.out.println("Menor do idade");}

    }
}
