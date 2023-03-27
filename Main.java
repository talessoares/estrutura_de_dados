import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor de x1: ");
        double x1 = input.nextDouble();
        System.out.println("Insira o valor de y1: ");
        double y1 = input.nextDouble();

        System.out.println("Insira o valor de x2: ");
        double x2 = input.nextDouble();
        System.out.println("Insira o valor de y2: ");
        double y2 = input.nextDouble();

        cartesiano c = new cartesiano(x1,y1,x2,y2);

        System.out.println("A distancia entre os pontos é: " + c.pontocartesiano());
	}
}