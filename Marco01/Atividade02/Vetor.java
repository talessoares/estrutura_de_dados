public class Vetor {
    private Aluno[] alunos;
    private int totalAlunos = 0;

    public Vetor(){
        alunos = new Aluno[4];
    }


    public void adiciona(Aluno aluno){
        if (totalAlunos == alunos.length){
            return;
        }

        this.alunos[this.totalAlunos] = aluno;
        this.totalAlunos++;
    }   

    public int tamanho(){
        return this.totalAlunos;
    }

    public boolean contem(Aluno aluno){
        for(int i = 0; i < this.totalAlunos; i++){
            if(this.alunos[i].equals(aluno)){
                return true;
            }
        }
        return false;
    }
}
