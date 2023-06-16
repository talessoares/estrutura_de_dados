import java.util.NoSuchElementException;

public class ABB {
    private Noh raiz;

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            Noh aux = this.raiz;

            while (aux != null) {
                if (element < aux.valor) {
                    if (aux.esq == null) {
                        Noh newNode = new Noh(element);
                        aux.esq = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.esq;
                } else {
                    if (aux.dir == null) {
                        Noh newNode = new Noh(element);
                        aux.dir = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.dir;
                }
            }
        }
    }

    public void recursiveAdd(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            recursiveAdd(this.raiz, element);
        }
    }

    private void recursiveAdd(Noh node, int element) {
        if (element < node.valor) {
            if (node.esq == null) {
                Noh newNode = new Noh(element);
                node.esq = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.esq, element);
        } else {
            if (node.dir == null) {
                Noh newNode = new Noh(element);
                node.dir = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.dir, element);
        }
    }

    public void print(Noh raiz) {
        if (isEmpty()) {
            System.out.println("Empty tree");
        } else {
            print(this.raiz);
        }
    }

    public void printTodaArvore(Noh raiz) {
        printTodaArvoreRecursivo(raiz);
    }

    private void printTodaArvoreRecursivo(Noh noh) {
        if (noh != null) {
            System.out.println("(" + noh.valor + ")");

            printTodaArvoreRecursivo(noh.esq);
            printTodaArvoreRecursivo(noh.dir);
        }
    }

    public boolean buscar(Noh raiz, int element) {
        if (raiz == null) {
            System.out.println("Elemento " + element + " não encontrado na árvore.");
            return false; // Element not found
        }

        if (element == raiz.valor) {
            System.out.println("Elemento " + element + " encontrado na árvore.");
            return true; // Element found
        }

        if (element < raiz.valor) {
            return buscar(raiz.esq, element); // Search in the left subtree
        } else {
            return buscar(raiz.dir, element); // Search in the right subtree
        }
    }

    public Noh getRaiz() {
        return this.raiz;
    }

    public int getValorRaiz() {
        if (raiz != null) {
            return raiz.valor;
        } else {
            throw new NoSuchElementException("A árvore está vazia. Não há raiz.");
        }
    }
}
