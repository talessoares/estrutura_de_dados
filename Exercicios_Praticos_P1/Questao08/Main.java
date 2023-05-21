public class Main {
	public static void main(String[] args) {
		LDE lista = new LDE();
		LDE lista2 = new LDE();
		
		lista.addEnd(1);
		lista.addEnd(2);
		lista.addEnd(3);
		lista.addEnd(4);
		System.out.println("List 1: ");
		lista.printFromBegin();

		lista2.addEnd(5);
		lista2.addEnd(6);
		lista2.addEnd(7);
		lista2.addEnd(8);
		System.out.println("List 2: ");
		lista2.printFromBegin();
		
		lista.concat(lista2);

		System.out.println("List concatenated: ");
		lista.printFromBegin();
		
	}

}