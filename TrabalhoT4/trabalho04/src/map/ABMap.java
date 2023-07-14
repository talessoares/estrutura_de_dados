package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import entities.Veiculo;
import map.ab.NohAB;

public class ABMap implements Map<Integer, Veiculo> {

    private NohAB raiz;

    public ABMap() {
        raiz = null;
    }

    @Override
    public int size() {
        return size(raiz);
    }

    private int size(NohAB noh) {
        if (noh == null) {
            return 0;
        }

        return 1 + size(noh.getEsquerda()) + size(noh.getDireita());
    }

    @Override
    public boolean isEmpty() {
        return raiz == null;
    }

    @Override
    public boolean containsKey(Object key) {
        return containsKey(raiz, (Integer) key);
    }

    private boolean containsKey(NohAB noh, Integer key) {
        if (noh == null) {
            return false;
        }

        if (noh.getKey().equals(key)) {
            return true;
        }

        if (key < noh.getKey()) {
            return containsKey(noh.getEsquerda(), key);
        }

        return containsKey(noh.getDireita(), key);
    }

    @Override
    public boolean containsValue(Object value) {
        return containsValue(raiz, (Veiculo) value);
    }

    private boolean containsValue(NohAB noh, Veiculo value) {
        if (noh == null) {
            return false;
        }

        if (noh.getValue().equals(value)) {
            return true;
        }

        return containsValue(noh.getEsquerda(), value) || containsValue(noh.getDireita(), value);
    }

    @Override
    public Veiculo get(Object key) {
        return get(raiz, (Integer) key);
    }

    private Veiculo get(NohAB noh, Integer key) {
        if (noh == null) {
            return null;
        }

        if (noh.getKey().equals(key)) {
            return noh.getValue();
        }

        if (key < noh.getKey()) {
            return get(noh.getEsquerda(), key);
        }

        return get(noh.getDireita(), key);
    }

    @Override
    public Veiculo put(Integer key, Veiculo value) {
        raiz = put(raiz, key, value);
        return value;
    }

    private NohAB put(NohAB noh, Integer key, Veiculo value) {
        if (noh == null) {
            return new NohAB(key, value);
        }

        if (key < noh.getKey()) {
            noh.setEsquerda(put(noh.getEsquerda(), key, value));
        } else if (key > noh.getKey()) {
            noh.setDireita(put(noh.getDireita(), key, value));
        } else {
            noh.setValue(value);
        }

        return noh;
    }

    @Override
    public Veiculo remove(Object key) {
        Veiculo value = get(key);
        raiz = remove(raiz, (Integer) key);
        return value;
    }

    private NohAB remove(NohAB noh, Integer key) {
        if (noh == null) {
            return null;
        }

        if (key < noh.getKey()) {
            noh.setEsquerda(remove(noh.getEsquerda(), key));
        } else if (key > noh.getKey()) {
            noh.setDireita(remove(noh.getDireita(), key));
        } else {
            if (noh.getDireita() == null) {
                return noh.getEsquerda();
            }

            if (noh.getEsquerda() == null) {
                return noh.getDireita();
            }

            NohAB t = noh;
            noh = min(t.getDireita());
            noh.setDireita(removeMin(t.getDireita()));
            noh.setEsquerda(t.getEsquerda());
        }

        return noh;
    }

    private NohAB min(NohAB noh) {
        if (noh.getEsquerda() == null) {
            return noh;
        }

        return min(noh.getEsquerda());
    }

    private NohAB removeMin(NohAB noh) {
        if (noh.getEsquerda() == null) {
            return noh.getDireita();
        }

        noh.setEsquerda(removeMin(noh.getEsquerda()));
        return noh;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Veiculo> m) {
        for (Entry<? extends Integer, ? extends Veiculo> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        raiz = null;
    }

    @Override
    public Set<Integer> keySet() {
        Set<Integer> keys = new HashSet<Integer>();
        keySet(raiz, keys);
        return keys;
    }

    private void keySet(NohAB noh, Set<Integer> keys) {
        if (noh == null) {
            return;
        }

        keys.add(noh.getKey());
        keySet(noh.getEsquerda(), keys);
        keySet(noh.getDireita(), keys);
    }

    @Override
    public Collection<Veiculo> values() {
        ArrayList<Veiculo> values = new ArrayList<Veiculo>();

        values(raiz, values);

        return values;
    }

    private void values(NohAB noh, ArrayList<Veiculo> values) {
        if (noh == null) {
            return;
        }

        values.add(noh.getValue());
        values(noh.getEsquerda(), values);
        values(noh.getDireita(), values);
    }

    @Override
    public Set<Entry<Integer, Veiculo>> entrySet() {
        Set<Entry<Integer, Veiculo>> entrySet = new HashSet<Entry<Integer, Veiculo>>();

        entrySet(raiz, entrySet);

        return entrySet;
    }

    private void entrySet(NohAB noh, Set<Entry<Integer, Veiculo>> entrySet) {
        if (noh == null) {
            return;
        }

        entrySet.add(noh);
        entrySet(noh.getEsquerda(), entrySet);
        entrySet(noh.getDireita(), entrySet);
    }

    @Override
    public String toString() {
        return toString(raiz);
    }

    private String toString(NohAB noh) {
        if (noh == null) {
            return "";
        }

        StringBuilder resultado = new StringBuilder();

        resultado.append(toString(noh.getEsquerda()));
        resultado.append("\n");
        resultado.append(noh.toString());
        resultado.append(toString(noh.getDireita()));

        return resultado.toString();
    }

    public int countMarcaFord() {
        int count = 0;

        count += countMarcaFord(raiz);

        return count;
    }

    private int countMarcaFord(NohAB noh) {
        if (noh == null) {
            return 0;
        }

        if (noh.getValue().isMarcaFord()) {
            return 1 + countMarcaFord(noh.getEsquerda()) + countMarcaFord(noh.getDireita());
        }

        return countMarcaFord(noh.getEsquerda()) + countMarcaFord(noh.getDireita());
    }
    
    public void excluirChassiMenorIgualQue202050000() {
        raiz = excluirChassiMenorIgualQue202050000(raiz);
    }
    
    private NohAB excluirChassiMenorIgualQue202050000(NohAB noh) {
        if (noh == null) {
            return null;
        }
        
        if (noh.getKey() <= 202050000) {
            return excluirChassiMenorIgualQue202050000(noh.getDireita());
        }
        
        noh.setEsquerda(excluirChassiMenorIgualQue202050000(noh.getEsquerda()));
        noh.setDireita(excluirChassiMenorIgualQue202050000(noh.getDireita()));
        
        return noh;
    }

}
