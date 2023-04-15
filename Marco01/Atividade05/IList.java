public interface IList {
    
    public void addBegin(int info) throws Exception;
    public void addEnd(int info) throws Exception;
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