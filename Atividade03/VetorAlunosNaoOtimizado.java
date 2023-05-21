public class VetorAlunosNaoOtimizado implements IVetorAluno{
	
	private Aluno alunos[] = new Aluno[5];
	
	public void adiciona(Aluno aluno) {
		for(int i=0; i < this.alunos.length; i++) {
			if(this.alunos[i] != null) {
				this.alunos[i].equals(aluno);
				break;
			}
		}
	}
	
	public int tamanho() {
		int tamanho = 0;
		for(int i=0; i < this.alunos.length; i++) {
 			if(this.alunos[i] == null ) {
				break;
			}
			tamanho++;
		}
		return tamanho;
	}
	
	public boolean contem(Aluno aluno) {
		for(int i=0; i < this.alunos.length; i++) {
			if(this.alunos[i].equals(aluno)) {
				return true;
			}
		}
		return false;
	}

	public boolean remove(Aluno aluno) {
		int indice = -1;
		int numElementos = 0;
		Aluno[] temp = new Aluno[alunos.length];
	
		for (int i = 0; i < alunos.length; i++) // faz a busca
			if (aluno == (this.alunos[i])) {
				indice = i;
				break;
			}

		if (indice != -1) { // encontrou o elemento
			for (int i = 0; i < numElementos; i++) {
				alunos[i] = temp[i];
			}
			alunos[numElementos] = null; // Marca o último elemento como nulo
			return true;
		}
		return false;
	}

}
