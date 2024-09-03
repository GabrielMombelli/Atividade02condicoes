import java.util.Scanner;

public class CalculoDeDescontoProgressivo {
    public static void main(String[] args) {


        Double valor = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor da compra? ");
        valor = sc.nextDouble();

        if (valor > 500) {
            System.out.println("O valor do produto com desconto é: " + (valor * 0.8));
        }else if (valor >= 200 && valor <= 500) {
            System.out.println("O valor do produto com desconto é: " + (valor * 0.9));
        } else if (valor >= 100 && valor <= 199) {
            System.out.println("O valor do produto com desconto é: " + (valor * 0.95));
        }else
            {System.out.println("O valor da compra não é elegivel a desconto, seu valor é: " + valor);
        }

    }
}


