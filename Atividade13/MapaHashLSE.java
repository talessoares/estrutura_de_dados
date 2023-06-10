public class MapaHashLSE {
    private ListaObject[] vetorLista;
    private int tamanho;

    public MapaHashLSE() {
        this.vetorLista = new ListaObject[10];
        this.tamanho = 0;
    }

    private int hash(int chave) {
        return chave % this.vetorLista.length;
    }

    public void put(int chave, Aluno valor) {
        int hash = hash(chave);
        ListaObject alunos_lista = this.vetorLista[hash];
        if (alunos_lista == null) {
            alunos_lista = new ListaObject();
            alunos_lista.insereInicio(valor);
            this.vetorLista[hash] = alunos_lista;
        } else {
            for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                if (((Aluno) n.getInfo()).getMatricula() == chave) {
                    n.setInfo(valor);
                    return;
                }
            }
            alunos_lista.insereInicio(valor);
        }
    }

    public Aluno get(int chave) {
        int hash = hash(chave);
        ListaObject alunos_lista = this.vetorLista[hash];
        if (alunos_lista != null) {
            for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                if (((Aluno) n.getInfo()).getMatricula() == chave) {
                    return (Aluno) n.getInfo();
                }
            }
        }
        return null;
    }

    public void resize() {
        ListaObject[] novo_vetor = new ListaObject[this.vetorLista.length * 2];
        for (int i = 0; i < this.vetorLista.length; i++) {
            ListaObject alunos_lista = this.vetorLista[i];
            if (alunos_lista != null) {
                for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                    int hash = hash(((Aluno) n.getInfo()).getMatricula());
                    ListaObject alunos_lista_novo = novo_vetor[hash];
                    if (alunos_lista_novo == null) {
                        alunos_lista_novo = new ListaObject();
                        alunos_lista_novo.insereInicio(n.getInfo());
                        novo_vetor[hash] = alunos_lista_novo;
                    } else {
                        alunos_lista_novo.insereInicio(n.getInfo());
                    }
                }
            }
        }
        this.vetorLista = novo_vetor;
    }

    public void rehash(){
        ListaObject[] novo_vetor = new ListaObject[this.vetorLista.length];
        for (int i = 0; i < this.vetorLista.length; i++) {
            ListaObject alunos_lista = this.vetorLista[i];
            if (alunos_lista != null) {
                for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                    int hash = hash(((Aluno) n.getInfo()).getMatricula());
                    ListaObject alunos_lista_novo = novo_vetor[hash];
                    if (alunos_lista_novo == null) {
                        alunos_lista_novo = new ListaObject();
                        alunos_lista_novo.insereInicio(n.getInfo());
                        novo_vetor[hash] = alunos_lista_novo;
                    } else {
                        alunos_lista_novo.insereInicio(n.getInfo());
                    }
                }
            }
        }
        this.vetorLista = novo_vetor;
    }

}