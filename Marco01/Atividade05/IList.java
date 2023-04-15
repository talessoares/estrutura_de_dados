public interface IList {
    
    public void addBegin(int info);
    public void addEnd(int info);
    public boolean isEmpty();
    public boolean remove(int info);
    public int size();
    public void printFromBegin();
    public void printFromEnd();
    public Object getFirst();
    public Object getLast();
    public void setNext();
    public void setPrevious();
    public boolean contains(int info);
    
}