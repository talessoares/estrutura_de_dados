public class Main {
	public static void main(String[] args) {
		LSE lista = new LSE();

		lista.addEnd(1);
		lista.addEnd(2);
		lista.addEnd(3);
		lista.addEnd(4);
		
		System.out.println("This is the list: ");
		lista.imprime_rec();

	}

}