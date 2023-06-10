public class Main {
    public static void main(String[] args) {

        MapaHashLSE mapa = new MapaHashLSE();

        Aluno a1 = new Aluno(1, "João", 8.0, 20);
        Aluno a2 = new Aluno(2, "Maria", 9.0, 21);
        Aluno a3 = new Aluno(3, "José", 7.0, 19);

        mapa.put(a1.getMatricula(), a1);
        mapa.put(a2.getMatricula(), a2);
        mapa.put(a3.getMatricula(), a3);

        System.out.println(mapa.get(1));
        System.out.println(mapa.get(2));
        System.out.println(mapa.get(3));

        mapa.put(1, new Aluno(1, "João da Silva", 8.0, 20));
        System.out.println(mapa.get(1));
        
    }

}