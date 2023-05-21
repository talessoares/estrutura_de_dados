public class VetorAlunosOtimizado implements IVetorAluno{
	private Aluno alunos[] = new Aluno[5];
	private int totalAlunos = 0;
	
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		if (totalAlunos == alunos.length){
            return;
        }

        this.alunos[this.totalAlunos] = aluno;
        this.totalAlunos++;
	}
	
	public int tamanho() {
		return this.totalAlunos;
	}
	
	public boolean contem(Aluno aluno) {
		for(int i=0; i < this.totalAlunos; i++) {
			if(this.alunos[i].equals(aluno)) {
				return true;
			}
		}
		return false;
	}

	public boolean cheio(){
		if (totalAlunos == this.alunos.length)
			return true;
		return false;
	}
	
	private void garanteEspaco() {
		if (this.cheio()) {
			Aluno[] novoAlunos = new Aluno[this.alunos.length * 2];
			for (int i = 0; i < this.alunos.length; i++)
				novoAlunos[i] = this.alunos[i];
			this.alunos = novoAlunos;
		}
	}

	public boolean remove(Aluno aluno) {
		int indice = -1;
		int numElementos = 0;
	
		for (int i = 0; i < totalAlunos; i++) // faz a busca
			if (aluno.equals(this.alunos[i])) {
				indice = i;
				break;
			}

		if (indice != -1) { // achou o elemento
			for (int i = indice; i < (numElementos - 1); i++)
				alunos[i] = alunos[i + 1];
			totalAlunos--;
			return true;
		}
		return false;
	}
	

}
