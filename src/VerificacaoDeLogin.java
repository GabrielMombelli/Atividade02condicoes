import java.util.Scanner;

public class VerificacaoDeLogin {
    public static void main(String[] args) {

        String login = "Luis";
        String senha = "FernandoLF";

        String primeira;
        String segunda;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva seu login: ");
        primeira = sc.nextLine();
        System.out.println("Escreva seu password: ");
        segunda = sc.nextLine();

        if (primeira.equals(login) && segunda.equals(senha)) {
        System.out.println("Login efetuado com sucesso!");
        } else {
            System.out.println(
                    "Login incorreto"
            );
        }
    }
}
