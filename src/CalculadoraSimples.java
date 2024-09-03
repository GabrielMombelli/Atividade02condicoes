import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Double primeiro = 0.0;
        Double segundo = 0.0;
        char operacao;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        primeiro = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        segundo = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (primeiro + segundo));
                break;
            case '-':
                System.out.println("Resultado: " + (primeiro - segundo));
                break;
            case '*':
                System.out.println("Resultado: " + (primeiro * segundo));
                break;
            case '/':
                if (segundo != 0) {
                    System.out.println("Resultado: " + (primeiro / segundo));
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida. Por favor, insira uma operação válida (+, -, *, /).");
                break;
        }

        scanner.close();
    }
}