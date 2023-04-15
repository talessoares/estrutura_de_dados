public class LDE implements IList {
    private Node begin;
    private Node end;
    
    public LDE (){
        this.begin = null;
        this.end = null;
    }
    
    public void addBegin(int info) throws Exception {
        Node newNode = new Node(info);
        
        if (begin == null){
            begin = newNode;
            end = newNode;
        }
        else {
            newNode.setNext(begin);
            begin.setPrevious(newNode);
            begin = newNode;
        }
        System.out.println("inicio" + begin.getInfo() + "   Fim"+end.getInfo());
    }
    
    public void addEnd(int info) throws Exception{
        Node newNode = new Node(info);
       
        
        if (begin == null){
            begin = newNode;
            end = newNode;
        }
        else {
           newNode.setPrevious(end);
           end.setNext(newNode);
           end = newNode;
        }
        System.out.println("inicio" + begin.getInfo() + "   Fim"+end.getInfo());
    }
    
    public boolean isEmpty() {
        if(begin == null | end == null)
            return true;
        else
            return false;
    }
    
    public boolean remove(int info) {
        if (contains(info)==false)
            return false;
        else {
            Node aux = begin;
            while (aux.getNext().getInfo() != info)
                aux = aux.getNext();
            aux.setNext(aux.getNext().getNext());
            return true;
        }
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
        return end.getInfo();
    }

    public void setNext() {
        Node aux = begin;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
        aux.setNext(begin);
    }

    public void setPrevious() {
        Node aux = begin;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
        aux.setNext(begin);
    }

    public boolean contains(int info) {
        Node aux = begin;
        while (aux != null) {
            if (aux.getInfo() == info) {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    public void printFromBegin() {
        Node aux = begin;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
    }

    public void printFromEnd() {
        Node aux = end;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getPrevious();
        }
    }
}