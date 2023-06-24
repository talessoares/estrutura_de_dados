
public class Main {
    public static void main(String[] args) {

        // ABB arvore = new ABB();

        // arvore.add(0);
        // arvore.add(10);
        // arvore.add(20);
        // arvore.add(57);
        // arvore.add(30);
        // arvore.add(7);
        // arvore.add(40);
        // arvore.add(50);
        // arvore.add(98);
        // arvore.add(60);
        // arvore.add(70);
        // arvore.add(100);
        // arvore.add(90);
        // arvore.add(80);
        

        // arvore.buscar(arvore.getRaiz(), 20);
        // arvore.buscar(arvore.getRaiz(), 10);

        // System.out.println("Imprimindo a arvore: ");
        // arvore.printEmOrdem(arvore.getRaiz());

        // System.out.println("A raiz da arvore é: " + arvore.getRaiz().getValor());


        // System.out.println("Removendo o elemento 20 da arvore: ");
        // arvore.removeNoh(20);

        // arvore.printEmOrdem(arvore.getRaiz());


        AVL arvoreAVL = new AVL();


        arvoreAVL.add(51, arvoreAVL.getRaiz());
        arvoreAVL.add(57, arvoreAVL.getRaiz());
        arvoreAVL.add(98, arvoreAVL.getRaiz());
        arvoreAVL.add(19, arvoreAVL.getRaiz());
        arvoreAVL.add(11, arvoreAVL.getRaiz());
        arvoreAVL.add(45, arvoreAVL.getRaiz());
        arvoreAVL.add(79, arvoreAVL.getRaiz());


        System.out.println("Testando o balanceamento da arvore: ");
        arvoreAVL.isArvoreBalanceada(arvoreAVL.getRaiz());
       
        if (arvoreAVL.isArvoreBalanceada(arvoreAVL.getRaiz())) {
            System.out.println("A arvore está balanceada!");
        } else {
            System.out.println("A arvore não está balanceada!");
        }

    }

}