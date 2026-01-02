// importando a classe scanner
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro Número: ");
        int num1 = scanner.nextInt();

        // segundo input
        System.out.print("Digite o Segundo Número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma de " + num1 + " com " + num2 + " é igual á: " + soma);

        scanner.close();
    }
}
