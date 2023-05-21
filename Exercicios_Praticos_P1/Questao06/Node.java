public class Node {
    private int info;
    private Node next;
    private Node previous;
    
    public Node (int info){
        this.info = info;
        this.next = null;
        this.previous = null;
    }
    
    public int getInfo() {
        return this.info;
    }
    
    public Node getNext() {
        return this.next;
    }

    public Node getPrevious(){
        return this.previous;
    }

    public Node getLast(){
        Node aux = this;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
        return aux;
    }

    public Node setNext(Node n) { return this.next = n; }

    public Node setPrevious(Node n) { return this.previous = n; }
}