public class Aluno {

    private int matricula;
    private String nome;
    private double nota;
    private int idade;

    public Aluno(int matricula, String nome, double nota, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", nota=" + nota + ", idade=" + idade + '}';
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
