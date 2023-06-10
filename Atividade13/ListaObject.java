public class ListaObject {

    private Noh inicio;
    private Noh fim;

    public ListaObject() {
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(Object obj) {
        Noh novo = new Noh(obj);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    public void insereFim(Object obj) {
        Noh novo = new Noh(obj);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }

    public Noh getInicio() {
        return inicio;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public boolean remove(Object ob) {
        Noh p = inicio;

        while (p != null && p.getInfo() != ob) {
            p = p.getProximo();
        }

        if (p == null)
            return false;
        if (p == inicio) {
            inicio = p.getProximo();
            if (inicio != null)
                inicio.setAnterior(null);
            else
                fim = null;
        } else if (p.getProximo() == null) {
            p.getAnterior().setProximo(null);
            fim = p.getAnterior();

        } else {
            p.getAnterior().setProximo(p.getProximo());
            p.getProximo().setAnterior(p.getAnterior());
        }

        return true;
    }
}
