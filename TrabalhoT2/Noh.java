public class Noh {
    
    private Aluno aluno;
    private Noh prox;

    public Noh (Object info){
        this.aluno = aluno;
        this.prox = null;
    }

    public Object getInfo() {
        return this.aluno;
    }


    public Noh getProx() {
        return this.prox;
    }

    public void setProx(Noh n) { this.prox = n; }

}