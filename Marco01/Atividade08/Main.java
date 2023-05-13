import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Vetor vetor = new Vetor();
        int[] arraySequential = vetor.generateSequentialArray();
        
        System.out.println("Digite o número que deseja buscar: ");
        int number = input.nextInt();

        System.out.println("Busca iterativa: ");

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

        long startTime2 = System.nanoTime();
        boolean encontrado2 = vetor.recBinarySearch(arraySequential, number, 0, arraySequential.length - 1);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);

        if (encontrado2 == true) {
                System.out.println("Elemento encontrado");
        }
        else {
                System.out.println("Elemento não encontrado");
        }
        System.out.println("Tempo de execução: " + duration2 + " nanosegundos");

        System.out.println("A diferença entre os tempos de execução é de: " + (duration - duration2) + " nanosegundos");

        input.close();

        }
}