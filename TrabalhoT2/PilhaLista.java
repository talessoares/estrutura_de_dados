public class PilhaLista implements IPilha {

    private Noh topo;
    public int numElem;

    public PilhaLista() {
        this.topo = null;
    }

    public boolean push(Object info) { // empilha
        Noh novo = new Noh(info);
        if (this.isEmpty())
            topo = novo;
        else {
            novo.setProx(topo);
            topo = novo;
        }
        return true;
    }

    public Object pop() { // desempilha
        Object info = null;
        if (!this.isEmpty()) {
            info = topo.getInfo();
            topo = topo.getProx();
        }
        return info;
    }

    public Object top() {
        if (!this.isEmpty())
            return topo.getInfo();
        return null;
    }

    public boolean isEmpty() {
        return (topo == null);
    }

    public int size() {
        int cont = 0;
        Noh aux = topo;
        while (aux != null) {
            cont++;
            aux = aux.getProx();
        }
        return cont;
    }

    public PilhaLista inverteOrdem() {
        PilhaLista pilhaCopia = new PilhaLista();
        PilhaLista pilhaTemp = new PilhaLista();
        
        while (!isEmpty()) {
            Object elemento = pop();
            pilhaTemp.push(elemento);
            estadoPilha();
        }
        
        while (!pilhaTemp.isEmpty()) {
            Object elemento = pilhaTemp.pop();
            pilhaCopia.push(elemento);
        }
        
        return pilhaCopia;
    }

    public void estadoPilha() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return;
        }
    
        // System.out.println("Estado da pilha:");
        Noh aux = topo;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

    

}
