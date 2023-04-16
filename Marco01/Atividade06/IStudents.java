public interface IStudents {
    
    public void addBegin(Object info);
    public void addEnd(Object info);
    public boolean isEmpty();
    public boolean remove(Object info);
    public int size();
    public void printFromBegin();
    public void printFromEnd();
    public Object getFirst();
    public Object getLast();
    public void setNext();
    public void setPrevious();
    public boolean contains(Object info);
 
}