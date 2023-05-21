public class Node {
    private Object info;
    private Node next;
    
    public Node (Object info){
    this.info = info;
    this.next = null;
    }
    
    public Object getInfo() {
        return this.info;
    }
    
    public Node getNext() {
        return this.next;
    }
    
    public Node setNext(Node n) { return this.next = n; }
}