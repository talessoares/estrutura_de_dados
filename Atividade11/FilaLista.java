public class FilaLista implements IFila {

    private Noh inicio;
    private Noh fim;

    public FilaLista() { // construtor
        this.inicio = null;
        this.fim = null;
    }

    public boolean isEmpty() {
        return (inicio == null);
    }

    public boolean add(Object info) { // insere
        Noh novo = new Noh(info);
        if (this.isEmpty()) {
            inicio = novo;
        } else
            fim.setProx(novo);
        fim = novo;
        return true;
    }

    public boolean remove() { // remove
        if (!isEmpty()) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else
                inicio = inicio.getProx();
            return true;
        }
        return false;
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

    @Override
    public int size() {
        int cont = 0;
        if (!isEmpty()) {
            Noh aux = inicio;
            while (aux != null) {
                cont++;
                aux = aux.getProx();
            }
        }
        return cont;
    }

}