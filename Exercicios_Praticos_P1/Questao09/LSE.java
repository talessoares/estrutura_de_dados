public class LSE {
    private Node begin;
    
    public LSE (){
        this.begin = null;
    }
    
    public void addBegin(Object info) {
        Node newNode = new Node(info);
        
        if (begin == null)
            begin = newNode;
        else {
        newNode.setNext(begin);
        begin = newNode;
        }
    }
    
    public void addEnd(Object info) {
        Node newNode = new Node(info);
        Node aux = begin;
        
        if (begin == null)
            begin = newNode;
        else {
            while (aux.getNext() != null)
                aux = aux.getNext();
            aux.setNext(newNode);
        }
    }
    
    public boolean isEmpty() {
        return begin == null;
    }
    
    public boolean remove(Object info) {
        Node actual;
        Node previous = null;
        actual = begin;
        

        while (actual!=null && actual.getInfo() != info){
            previous = actual;
            actual = actual.getNext();
        }

        if (actual==null)
            return false;
        if (previous==null)
            begin = actual.getNext();
        else
        previous.setNext(actual.getNext());

        return true;
    }
    
    public int size() {
        int size = 0;
        Node aux = begin;

        while (aux != null) {
            size++;
            aux = aux.getNext();
        }
        return size;
    }

    public Object getFirst() {
        return begin.getInfo();
    }

    public Object getLast() {
        Node aux = begin;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
        return aux.getInfo();
    }

    public void print() {
        Node aux = begin;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
    }


    public void bubbleSort() {

        for(Node i = begin; i != null; i = i.getNext()) {
            for(Node j = begin; j != null; j = j.getNext()) {
                if((int) i.getInfo() < (int) j.getInfo()) {
                    Object aux = i.getInfo();
                    i.setInfo(j.getInfo());
                    j.setInfo(aux);
                }
            }
        }
        

    }
    
    
    
    
    public void printInOrder() {
        Node aux = begin;

        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
    }
    
}