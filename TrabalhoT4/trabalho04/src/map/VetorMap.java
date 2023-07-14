package map;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import java.util.AbstractMap;
import java.util.Arrays;

import entities.Veiculo;

public class VetorMap implements Map<Integer, Veiculo> {

    private static final int DEFAULT_CAPACITY = 100000;
    private int size;
    private Veiculo[] elements;

    public VetorMap() {
        size = 0;
        elements = new Veiculo[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        if (key == null) {
            throw new NullPointerException("A chave é nula!");
        }

        if (!(key instanceof Integer)) {
            throw new ClassCastException("A chave não é um Integer!");
        }

        Integer k = (Integer) key;
        return get(k) != null;
    }

    @Override
    public boolean containsValue(Object value) {
        if (value == null) {
            throw new NullPointerException("O valor é nulo!");
        }

        if (!(value instanceof Veiculo)) {
            throw new ClassCastException("O valor não é um Veiculo!");
        }

        Veiculo v = (Veiculo) value;

        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(v)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Veiculo get(Object key) {
        if (key == null) {
            throw new NullPointerException("A chave é nula!");
        }

        if (!(key instanceof Integer)) {
            throw new ClassCastException("A chave não é um Integer!");
        }

        Integer k = (Integer) key;

        for (int i = 0; i < size(); i++) {
            if (elements[i].getChassi() == k) {
                return elements[i];
            }
        }

        return null;
    }

    @Override
    public Veiculo put(Integer key, Veiculo value) {
        if (key == null) {
            throw new NullPointerException("A chave é nula!");
        }

        if (!(key instanceof Integer)) {
            throw new ClassCastException("A chave não é um Integer!");
        }

        if (value == null) {
            throw new NullPointerException("O valor é nulo!");
        }

        if (!(value instanceof Veiculo)) {
            throw new ClassCastException("O valor não é um Veiculo!");
        }

        if (containsKey(key)) {
            Veiculo v = get(key);
            v = value;
            return v;
        }

        if (size() == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        int insertIndex = 0;
        while (insertIndex < size() && elements[insertIndex].getChassi() < key) {
            insertIndex++;
        }

        for (int i = size(); i > insertIndex; i--) {
            elements[i] = elements[i - 1];
        }

        elements[insertIndex] = value;
        size++;
        return null;
    }

    @Override
    public Veiculo remove(Object key) {
        if (key == null) {
            throw new NullPointerException("A chave é nula!");
        }

        if (!(key instanceof Integer)) {
            throw new ClassCastException("A chave não é um Integer!");
        }

        Integer k = (Integer) key;
        if (!containsKey(k)) {
            return null;
        }

        Veiculo v = get(k);

        int removeIndex = 0;
        while (removeIndex < size() && elements[removeIndex].getChassi() != k) {
            removeIndex++;
        }

        for (int i = removeIndex; i < size() - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size() - 1] = null;
        size--;
        return v;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Veiculo> m) {
        for (Entry<? extends Integer, ? extends Veiculo> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < size(); i++) {
            elements[i] = null;
        }

        size = 0;
    }

    @Override
    public Set<Integer> keySet() {
        Set<Integer> keySet = new HashSet<Integer>();

        for (int i = 0; i < size; i++) {
            keySet.add(elements[i].getChassi());
        }

        return keySet;
    }

    @Override
    public Collection<Veiculo> values() {
        return Arrays.asList(Arrays.copyOf(elements, size));
    }

    @Override
    public Set<Entry<Integer, Veiculo>> entrySet() {
        Set<Entry<Integer, Veiculo>> entrySet = new HashSet<Entry<Integer, Veiculo>>();

        for (int i = 0; i < size; i++) {
            int chassi = elements[i].getChassi();
            Veiculo veiculo = elements[i];
            Entry<Integer, Veiculo> entry = new AbstractMap.SimpleEntry<Integer, Veiculo>(chassi, veiculo);
            entrySet.add(entry);
        }

        return entrySet;
    }

    public int countMarcaFord() {
        int quantidade = 0;

        for (int i = 0; i < size(); i++) {
            if (elements[i].isMarcaFord()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size(); i++) {
            sb.append(elements[i].toString());
            if (i < size() - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public void excluirChassiMenorIgualQue202050000() {
        for(Veiculo v : values()){
            if(v.getChassi() <= 202050000){
                remove(v.getChassi());
            }
        }
    }

}
