import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetorTeste[] = new int[1000];

        Vetor vetor = new Vetor();
        vetor.geraVetorSequencial();

        for(int i = 0; i < vetorTeste.length; i++) {
                vetorTeste[i] = i + 1;
                System.out.println(vetorTeste[i]);
        }

        System.out.println("Busca iterativa: ");
        System.out.println("Digite o número que deseja buscar: ");
        int number = input.nextInt();

        long startTime = System.nanoTime();
        boolean encontrado = vetor.itBinarySearch(number);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        if (encontrado == true) {
                System.out.println("Elemento encontrado");
        }
        else {
                System.out.println("Elemento não encontrado");
        }
        System.out.println("Tempo de execução: " + duration + " nanosegundos");
      



        System.out.println("Busca recursiva: ");
        System.out.println("Digite o número que deseja buscar: ");
        int number2 = input.nextInt();

        long startTime2 = System.nanoTime();
        boolean encontrado2 = vetor.recursiveBinarySearch(vetorTeste, number2, 0, vetorTeste.length - 1);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);

        if (encontrado2 == true) {
                System.out.println("Elemento encontrado");
        }
        else {
                System.out.println("Elemento não encontrado");
        }
        System.out.println("Tempo de execução: " + duration2 + " nanosegundos");

        input.close();

	}
}