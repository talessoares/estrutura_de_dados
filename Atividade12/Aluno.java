public class Aluno {

    private String nome;
    private int idade;
    private double nota;
    private int matricula;
    private double [] notas = new double [4];

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    
    @Override
    public String toString() {
        return "Aluno: " + nome + "Matricula: " + matricula + ", Idade: " + idade + ", Nota: " + nota;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
   
}
