public interface IVetorAluno {
    
    public void adiciona(Aluno aluno);

    public int tamanho();

    public boolean contem(Aluno aluno);

    private void garanteEspaco(){};

    public boolean remove(Aluno aluno);

}