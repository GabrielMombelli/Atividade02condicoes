import java.util.Scanner;

public class ClassificacaoDeTemperatura {
    public static void main(String[] args) {


        Double temperatura = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos graus celcios está? ");
        temperatura = sc.nextDouble();

        if (temperatura > 30) {
            System.out.println("Quente");
        }else if (temperatura >= 15) {
            System.out.println("Agradável");
        } else if (temperatura < 15) {
            System.out.println("Frio");
        }

    }
}


