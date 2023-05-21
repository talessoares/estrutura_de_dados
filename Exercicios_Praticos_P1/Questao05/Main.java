public class Main {
	public static void main(String[] args) {
		IList lista = new LDE();
		
		System.out.println("This is the list: ");
		lista.addBegin(10);
		lista.addBegin(2);
		lista.addBegin(3);
		lista.addBegin(4);
		lista.addBegin(5);
		lista.addBegin(6);
		lista.addEnd(99);

		lista.printFromBegin();

		System.out.println("Even numbers: " + lista.nroPares());

	}

}