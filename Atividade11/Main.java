public class Main {
    public static void main(String[] args) {

        FilaLista fila = new FilaLista();

        System.out.println("Fila criada com sucesso!");

        fila.add("Jose");
        fila.add("Maria");
        fila.add("Pedro");

        System.out.println("Imprimindo fila:");
        fila.print();

        System.out.println("Tamanho da fila: " + fila.size());

        System.out.println("Removendo elemento da fila:");
        fila.remove();
        fila.print();

        System.out.println("Tamanho da fila: " + fila.size());

    }

}