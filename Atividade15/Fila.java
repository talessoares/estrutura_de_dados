public class Fila {

    private Noh inicio;
    private Noh fim;

    public Fila() { // construtor
        this.inicio = null;
        this.fim = null;
    }

    public boolean isEmpty() {
        return (inicio == null);
    }

    public boolean insere(Noh raiz) { // insere
        Noh novo = new Noh(raiz);
        if (this.isEmpty()) {
            inicio = novo;
        } else
            fim.setProx(novo);
        fim = novo;
        return true;
    }

    public Noh remove() { // remove
        if (!isEmpty()) {
            Noh nohRemovido = inicio; // Armazena o nó a ser removido
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else {
                inicio = inicio.getProx();
            }
            return nohRemovido; // Retorna o nó removido
        }
        return null; // Retorna null se a fila estiver vazia
    }

    public void print() { // imprime
        if (!isEmpty()) {
            Noh aux = inicio;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public int size() {
        int count = 0;
        Noh current = inicio;
        while (current != null) {
            count++;
            current = current.getProx();
        }
        return count;
    }

}