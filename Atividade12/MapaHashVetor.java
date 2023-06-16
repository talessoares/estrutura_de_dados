public class MapaHashVetor {
  private Aluno[] vetor;

  public MapaHashVetor() {
    this.vetor = new Aluno[20];
  }

  private int hash(int chave) {
    return chave % this.vetor.length;
  }

  public Aluno get(int chave) {
    int hash = hash(chave);
    return this.vetor[hash];
  }

  public void put(int chave, Aluno valor) {
    int hash = hash(chave);

    if (this.vetor[hash] != null) {
      System.out.println("Colisão no índice " + hash + " (" + this.vetor[hash].getNome() + " -> " + valor.getNome()
          + ")");
    }
    this.vetor[hash] = valor;
  }

  public Aluno remove(int chave) {
    int hash = hash(chave);
    Aluno aluno = this.vetor[hash];
    this.vetor[hash] = null;
    return aluno;
  }

  public boolean containsKey(int chave) {
    int hash = hash(chave);
    return this.vetor[hash] != null;
  }

  public Aluno resize(int novoTamanho) {
    Aluno[] vetorTemporario = new Aluno[novoTamanho];

    for (int i = 0; i < this.vetor.length; i++) {
      if (this.vetor[i] != null) {
        int hash = hash(this.vetor[i].getMatricula());
        vetorTemporario[hash] = this.vetor[i];
      }
    }

    this.vetor = vetorTemporario;
    return null;
  }

  public void reHash() {
    int novoTamanho = this.vetor.length * 2;
    resize(novoTamanho);
  }
}