
public class Main {
    public static void main(String[] args) {

        ABB arvore = new ABB();

        arvore.recursiveAdd(20);
        arvore.recursiveAdd(10);
        arvore.recursiveAdd(30);
        arvore.recursiveAdd(5);
        arvore.recursiveAdd(15);
        arvore.recursiveAdd(25);
        arvore.recursiveAdd(35);
        

        arvore.buscar(arvore.getRaiz(), 20);

        System.out.println("Imprimindo a arvore: ");
        arvore.printTodaArvore(arvore.getRaiz());

        System.out.println("A raiz da arvore é: " + arvore.getRaiz().valor);

    }

}