import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int m, n;

        System.out.print("Digite o valor de m: ");
        m = input.nextInt();

        System.out.print("Digite o valor de n: ");
        n = input.nextInt();

        if (m > n) {
            System.out.println("O valor de m deve ser menor que o valor de n");
            input.close();
            return;
        }

        int resultado = somatorio(m, n);

        System.out.println("O resultado do somatório é: " + resultado);

        input.close();
    }

    public static int somatorio(int m, int n) {
        if (n == m) {
            return m;
        } else {
            return m + somatorio(m + 1, n);
        }
    }

}
