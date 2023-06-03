public class LseAluno {
    
    private Aluno[] alunos;
    private int totalAlunos = 0;


    public LseAluno(){
        alunos = new Aluno[4];
    }

    public void adiciona(Object object){
        if (totalAlunos == alunos.length){
            return;
        }

        this.alunos[this.totalAlunos] = (Aluno) object;
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

    public void imprimeAlunos() {
        for (int i = 0; i < this.totalAlunos; i++) {
            System.out.println(this.alunos[i]);
        }
    }

    public void inverteOrdem() {
        if (totalAlunos <= 1) {
            // Caso a lista esteja vazia ou tenha apenas um aluno, não é necessário inverter
            return;
        }
    
        Aluno[] alunosInvertidos = new Aluno[totalAlunos];
        int index = totalAlunos - 1;
    
        // Percorre a lista original e insere os alunos no array invertido na ordem inversa
        for (int i = 0; i < totalAlunos; i++) {
            alunosInvertidos[index] = alunos[i];
            index--;
        }
    
        // Atualiza a lista original com os alunos invertidos
        alunos = alunosInvertidos;
    }
    


    
}
