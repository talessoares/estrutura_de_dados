import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Vetor vetor = new Vetor();
        int[] numerosAleatorios = vetor.gerarVetorAleatorio();

        for (int i = 0; i < numerosAleatorios.length; i++) {
                vetor.add(numerosAleatorios[i]);
                System.out.println(numerosAleatorios[i]);
        }       


        long startTimeRec = System.currentTimeMillis();
        System.out.println("Maximo recursivo: " + vetor.maxRec(numerosAleatorios, 0, numerosAleatorios.length-1));
        long endTimeRec = System.currentTimeMillis();
        long durationRec = endTimeRec - startTimeRec;
        System.out.println("Tempo de execução recursividade: " + durationRec + "ms");
        
        
        
        long startTimeIt = System.currentTimeMillis();
        System.out.println("Maximo iterativo: " + vetor.maxIt(numerosAleatorios.length));
        long endTimeIt = System.currentTimeMillis();
        long durationIt = endTimeIt - startTimeIt;
        System.out.println("Tempo de execução iterativo: " + durationIt + "ms");

        input.close();

	}
}