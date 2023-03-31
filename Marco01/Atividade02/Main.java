import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Vetor vetor = new Vetor();
        Aluno aluno = new Aluno("Joao",20,8);
        Aluno aluno2 = new Aluno("Maria",20,8);
        Aluno aluno3 = new Aluno("Jose",20,8);

        vetor.adiciona(aluno);
        vetor.adiciona(aluno2);
        vetor.adiciona(aluno3);

        System.out.println(vetor.tamanho());
        System.out.println(vetor.contem(aluno));
        System.out.println(vetor.contem(aluno2));
        System.out.println(vetor.contem(aluno3));


	}
}