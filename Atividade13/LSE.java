public class LSE {

    private Noh inicio;

    public LSE() {
        this.inicio = null;
    }

    public void insereInicio(int info) {

        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            novo.setProximo(inicio);
            inicio = novo;
        }
    }

    public void insereFim(int info) {

        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            Noh ultimo = null;
            for (Noh i = inicio; i != null; i = i.getProximo())
                ultimo = i;
            ultimo.setProximo(novo);
        }
    }

    public boolean remove(int info) {
        Noh ant = null;
        Noh p = inicio;

        while (p != null && (int) p.getInfo() != info) {
            ant = p;
            p = p.getProximo();
        }

        if (p == null)
            return false;
        if (ant == null)
            inicio = p.getProximo();
        else
            ant.setProximo(p.getProximo());

        return true;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public int tamanho() {
        int cont = 0;
        for (Noh i = inicio; i != null; i = i.getProximo())
            cont++;
        return cont;
    }
}
