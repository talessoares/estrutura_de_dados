public class FilaVet implements IFila {

    private int nElemFila;
    private int inicio;
    private Object[] vetFila;

    public FilaVet(int tam) {
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tam];
    }

    public boolean isEmpty() {
        return (nElemFila == 0);
    }

    public boolean remove() {
        if (this.isEmpty()) {
            System.out.println("Fila estah vazia");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    public boolean add(Object info) { // método que insere na fila
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    public int size() {
        return this.nElemFila;
    }

    public int print() {
        if (this.isEmpty()) {
            System.out.println("Fila estah vazia");
            return 0;
        }
        int indice = this.inicio;
        for (int i = 0; i < this.nElemFila; i++) {
            System.out.println(this.vetFila[indice]);
            indice = (indice + 1) % this.vetFila.length;
        }
        return 1;
    }

}
