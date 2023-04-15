public class Main {
	public static void main(String[] args) {
		IList lista = new LDE();
		
		lista.addBegin(10);
		lista.addBegin(2);
		lista.addBegin(3);
		//lista.addBegin(4);
		//lista.addBegin(5);
		//lista.addBegin(6);
		lista.addEnd(99);

		System.out.println("The list size is: " + lista.size());
		lista.printFromBegin();
		System.out.println("------------------------");
		lista.printFromEnd();

		System.out.println("The first element is: " + lista.getFirst());
		System.out.println("The last element is: " + lista.getLast());
		

	}

}