package map.ab;

import java.util.Map.Entry;

import entities.Veiculo;

public class NohAB implements Entry<Integer, Veiculo> {

    private Integer chave;
    private Veiculo valor;

    private NohAB esquerda;
    private NohAB direita;
    private NohAB pai;

    public NohAB(Integer chave, Veiculo valor) {
        this.chave = chave;
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
        this.pai = null;
    }

    public NohAB getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NohAB esquerda) {
        this.esquerda = esquerda;
    }

    public NohAB getDireita() {
        return direita;
    }

    public void setDireita(NohAB direita) {
        this.direita = direita;
    }

    public NohAB getPai() {
        return pai;
    }

    public void setPai(NohAB pai) {
        this.pai = pai;
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
        Veiculo antigo = valor;
        valor = value;
        return antigo;
    }

    public Integer setKey(Integer key) {
        Integer antiga = chave;
        chave = key;
        return antiga;
    }

    @Override
    public String toString() {
        return valor.toString();
    }

}
