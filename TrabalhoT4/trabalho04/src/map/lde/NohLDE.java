package map.lde;

import java.util.Map.Entry;

import entities.Veiculo;

public class NohLDE implements Entry<Integer, Veiculo> {

    private Integer chave;
    private Veiculo valor;

    private NohLDE proximo;
    private NohLDE anterior;

    public NohLDE(Integer chave, Veiculo valor) {
        this.chave = chave;
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }

    public void setChave(Integer chave) {
        this.chave = chave;
    }

    public NohLDE getProximo() {
        return proximo;
    }

    public void setProximo(NohLDE proximo) {
        this.proximo = proximo;
    }

    public NohLDE getAnterior() {
        return anterior;
    }

    public void setAnterior(NohLDE anterior) {
        this.anterior = anterior;
    }

    @Override
    public Integer getKey() {
        return chave;
    }

    @Override
    public Veiculo getValue() {
        return valor;
    }

    @Override
    public Veiculo setValue(Veiculo value) {
        Veiculo old = valor;
        valor = value;
        return old;
    }

    @Override
    public String toString() {
        return valor.toString();
    }
    
}
