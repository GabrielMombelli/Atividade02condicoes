import java.util.Scanner;

public class SistemaDeCalculoDeSalario {
    public static void main(String[] args) {

        Double salarioBruto = 0.0;
        int anosTrabalhados = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o salário bruto: ");
        salarioBruto = Double.parseDouble(scanner.nextLine());
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Escreva o ano de trabalho: ");
        anosTrabalhados = Integer.parseInt(scanner2.nextLine());

        double bonus = 0.0;

        if (anosTrabalhados > 10) {
            bonus = salarioBruto * 0.10;
        } else if (anosTrabalhados >= 5) {
            bonus = salarioBruto * 0.05;
        }

        double imposto = 0.0;

        if (salarioBruto > 5000) {
            imposto = salarioBruto * 0.27;
        } else if (salarioBruto >= 3000) {
            imposto = salarioBruto * 0.18;
        } else {
            imposto = salarioBruto * 0.10;
        }

        double salarioLiquido = salarioBruto + bonus - imposto;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Bônus Recebido: R$ " + bonus);
        System.out.println("Imposto Descontado: R$ " + imposto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}


