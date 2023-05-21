public class Main {
	public static void main(String[] args) {
		LDE lista = new LDE();
		
		lista.addEnd(1);
		lista.addEnd(3);
		lista.add_ordenado(2);
		
		
		System.out.println("List in order: ");
		lista.printFromBegin();
		
	}

}