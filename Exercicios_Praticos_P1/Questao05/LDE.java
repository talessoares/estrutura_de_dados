public class LDE implements IList {
    private Node begin;
    private Node end;
    
    public LDE (){
        this.begin = null;
        this.end = null;
    }
    
    public void addBegin(int info) {
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
    }
    
    public void addEnd(int info) {
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

    public int nroPares() {
        int even = 0;
        Node aux = begin;
        while (aux != null) {
            if (aux.getInfo() % 2 == 0) {
                even++;
            }
            aux = aux.getNext();
        }
        return even;
    }

}