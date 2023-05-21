public class Main {

	public static void main(String[] args) {
		IVetorAluno vetAlunoOt = new VetorAlunosOtimizado();
		IVetorAluno vetAlunoNOt= new VetorAlunosNaoOtimizado();


		Aluno aluno1 = new Aluno("Joao", 20, 7.5);
		Aluno aluno2 = new Aluno("Maria", 21, 8.5);
		Aluno aluno3 = new Aluno("Jose", 22, 9.5);
		Aluno aluno4 = new Aluno("Pedro", 23, 10.0);
		

		vetAlunoOt.adiciona(aluno1);
		vetAlunoOt.adiciona(aluno2);

		// vetAlunoNOt.adiciona(aluno3);
		// vetAlunoNOt.adiciona(aluno4);

		System.out.println("Vetor otimizado: ");
		System.out.println("Tamanho: " + vetAlunoOt.tamanho());
		System.out.println("Contem aluno1: " + vetAlunoOt.contem(aluno1));
		System.out.println("Contem aluno2: " + vetAlunoOt.contem(aluno2));
		

		vetAlunoOt.remove(aluno1);
		System.out.println("Contem aluno1: " + vetAlunoOt.contem(aluno1));
		System.out.println("Tamanho: " + vetAlunoOt.tamanho());

	
		

		// System.out.println("Vetor nao otimizado: ");
		// System.out.println("Tamanho: " + vetAlunoNOt.tamanho());
		// System.out.println("Contem aluno3: " + vetAlunoNOt.contem(aluno3));
		// System.out.println("Contem aluno4: " + vetAlunoNOt.contem(aluno4));


	}

}
