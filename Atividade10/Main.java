import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FilaVet fila = new FilaVet(3);

        System.out.println("Fila criada com sucesso!");

        fila.add(5);
        fila.add(10);
        fila.add(15);

        System.out.println("Imprimindo fila:");
        fila.print();

        System.out.println("Tamanho da fila: " + fila.size());

        System.out.println("Removendo elemento da fila:");
        fila.remove();
        fila.print();
        System.out.println("Tamanho da fila: " + fila.size());

    }

}