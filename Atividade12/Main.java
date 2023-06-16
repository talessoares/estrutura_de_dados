public class Main {
    public static void main(String[] args) {

        MapaHashVetor mapa = new MapaHashVetor();

        Aluno a1 = new Aluno("João", 18, 9.5);
        Aluno a2 = new Aluno("Maria", 20, 8.5);
        Aluno a3 = new Aluno("Pedro", 19, 7.5);
        Aluno a4 = new Aluno("Ana", 21, 6.5);

        mapa.put(123, a1);
        mapa.put(456, a2);
        mapa.put(789, a3);
        mapa.put(987, a4);

        System.out.println(mapa.get(123));
        System.out.println(mapa.get(456));
        System.out.println(mapa.get(789));
        System.out.println(mapa.get(987));

        // mapa.remove(123);
        // mapa.remove(456);
        // mapa.remove(789);
        // mapa.remove(987);

        // System.out.println(mapa.get(123));
        // System.out.println(mapa.get(456));
        // System.out.println(mapa.get(789));
        // System.out.println(mapa.get(987));

    }

}