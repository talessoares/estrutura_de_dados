import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual será o tamanho dos vetores?");
        int size = input.nextInt();

        int[] vetor = new int[size];
        int[] vetor2 = new int[size];
        int[] vetor3 = new int[size];

        System.out.println("Vetor 1:");
        for (int i = 0; i < size; i++) {
            System.out.println("Digite o número " + (i+1) + ":");
            vetor[i] = input.nextInt();
        }

        System.out.println("Vetor 2:");
        for (int i = 0; i < size; i++) {
            System.out.println("Digite o número " + (i+1) + ":");
            vetor2[i] = input.nextInt();
        }

        int aux = 0;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                if (vetor[i] == vetor2[j]){
                    vetor3[aux] = vetor[i];
                    aux++;
                }
            }
        }
        
        System.out.print("Os números que estão na intersecção dos dois vetores são:");
        for (int i = 0; i < aux; i++) {
            System.out.println(vetor3[i]);
        }

        input.close();

    }

}