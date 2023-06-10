public class Noh {

    private Object info;
    private Noh proximo;
    private Noh anterior;

    public Noh(Object info) {
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Noh getProximo() {
        return proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }

    public Noh getAnterior() {
        return anterior;
    }

    public void setAnterior(Noh anterior) {
        this.anterior = anterior;
    }

}