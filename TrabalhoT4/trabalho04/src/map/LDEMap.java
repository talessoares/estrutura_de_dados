package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import entities.Veiculo;
import map.lde.NohLDE;

public class LDEMap implements Map<Integer, Veiculo> {

    private NohLDE inicio;
    private NohLDE fim;

    public LDEMap() {
        inicio = null;
        fim = null;
    }

    @Override
    public int size() {
        int size = 0;
        NohLDE aux = inicio;

        while (aux != null) {
            size++;
            aux = aux.getProximo();
        }

        return size;
    }

    @Override
    public boolean isEmpty() {
        return inicio == null && fim == null;
    }

    @Override
    public boolean containsKey(Object key) {
        NohLDE aux = inicio;

        while (aux != null) {
            if (aux.getKey().equals(key)) {
                return true;
            }
            aux = aux.getProximo();
        }

        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        NohLDE aux = inicio;

        while (aux != null) {
            if (aux.getValue().equals(value)) {
                return true;
            }
            aux = aux.getProximo();
        }

        return false;
    }

    @Override
    public Veiculo get(Object key) {
        NohLDE aux = inicio;

        while (aux != null) {
            if (aux.getKey().equals(key)) {
                return aux.getValue();
            }
            aux = aux.getProximo();
        }

        return null;
    }

    @Override
    public Veiculo put(Integer key, Veiculo value) {
        NohLDE novo = new NohLDE(key, value);

        if (inicio == null || key.compareTo(inicio.getKey()) < 0) {
            if (inicio != null) {
                novo.setProximo(inicio);
                inicio.setAnterior(novo);
            }

            inicio = novo;

            if (fim == null) {
                fim = novo;
            }

        } else {
            NohLDE atual = inicio;

            while (atual != null && key.compareTo(atual.getKey()) >= 0) {
                atual = atual.getProximo();
            }

            if (atual == null) {
                fim.setProximo(novo);
                novo.setAnterior(fim);
                fim = novo;

            } else {
                NohLDE anterior = atual.getAnterior();

                novo.setAnterior(anterior);
                novo.setProximo(atual);
                anterior.setProximo(novo);
                atual.setAnterior(novo);
            }
        }

        return value;
    }

    @Override
    public Veiculo remove(Object key) {
        NohLDE aux = inicio;

        while (aux != null) {
            if (aux.getKey().equals(key)) {
                if (aux == inicio) {
                    inicio = aux.getProximo();
                    inicio.setAnterior(null);
                } else if (aux == fim) {
                    fim = aux.getAnterior();
                    fim.setProximo(null);
                } else {
                    aux.getAnterior().setProximo(aux.getProximo());
                    aux.getProximo().setAnterior(aux.getAnterior());
                }
                return aux.getValue();
            }
            aux = aux.getProximo();
        }

        return null;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Veiculo> m) {
        for (Entry<? extends Integer, ? extends Veiculo> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        inicio = null;
        fim = null;
    }

    @Override
    public Set<Integer> keySet() {
        Set<Integer> set = new HashMap<Integer, Veiculo>().keySet();
        NohLDE aux = inicio;

        while (aux != null) {
            set.add(aux.getKey());
            aux = aux.getProximo();
        }

        return set;
    }

    @Override
    public Collection<Veiculo> values() {
        ArrayList<Veiculo> collection = new ArrayList<>();
        NohLDE aux = inicio;

        while (aux != null) {
            collection.add(aux.getValue());
            aux = aux.getProximo();
        }

        return collection;
    }

    @Override
    public Set<Entry<Integer, Veiculo>> entrySet() {
        Set<Entry<Integer, Veiculo>> set = new HashMap<Integer, Veiculo>().entrySet();
        NohLDE aux = inicio;

        while (aux != null) {
            set.add(aux);
            aux = aux.getProximo();
        }

        return set;
    }

    public int countMarcaFord() {
        int cont = 0;
        NohLDE aux = inicio;

        while (aux != null) {
            if (aux.getValue().isMarcaFord()) {
                cont++;
            }
            aux = aux.getProximo();
        }

        return cont;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        NohLDE aux = inicio;

        while (aux != null) {
            str.append(aux.toString() + "\n");
            aux = aux.getProximo();
        }

        return str.toString();
    }

    public void excluirChassiMenorIgualQue202050000() {
        NohLDE aux = inicio;

        while (aux != null) {
            if (aux.getValue().getChassi() <= 202050000) {
                if (aux == inicio) {
                    inicio = aux.getProximo();
                    inicio.setAnterior(null);
                } else if (aux == fim) {
                    fim = aux.getAnterior();
                    fim.setProximo(null);
                } else {
                    aux.getAnterior().setProximo(aux.getProximo());
                    aux.getProximo().setAnterior(aux.getAnterior());
                }
            }
            aux = aux.getProximo();
        }
    }

}
