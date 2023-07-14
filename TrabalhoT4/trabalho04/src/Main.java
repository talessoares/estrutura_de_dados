import java.util.Map;

import map.ABMap;
import map.LDEMap;
import map.VetorMap;

import entities.Veiculo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando o programa");

        long startTime = 0;
        long endTime = 0;

        /* Vetor */
        System.out.println("Iniciando o Vetor");
        VetorMap vetor = new VetorMap();

        long tempoAdicionarVetor = adicionarVeiculos(vetor);

        System.out.println("Vetor veículos cadastrados:");
        long tempoImprimirVetor = imprimirMap(vetor);

        startTime = System.nanoTime();
        int quantidadeVetor = vetor.countMarcaFord();
        endTime = System.nanoTime();

        long tempoContarMarcaFord = endTime - startTime;

        startTime = System.nanoTime();
        vetor.excluirChassiMenorIgualQue202050000();
        endTime = System.nanoTime();

        long tempoExcluirChassiMenorIgualQue202050000Vetor = endTime - startTime;

        System.out.println("Terminado o Vetor");


        /*Lista Duplamente Encadeada */
        System.out.println("Iniciando a Lista Duplamente Encadeada");
        LDEMap lde = new LDEMap();

        long tempoAdicionarLde = adicionarVeiculos(lde);

        System.out.println("Lista Duplamente Encadeada veículos cadastrados:");
        long tempoImprimirLde = imprimirMap(lde);

        startTime = System.nanoTime();
        int quantidadeLde = lde.countMarcaFord();
        endTime = System.nanoTime();

        long tempoContarMarcaFordLde = endTime - startTime;

        startTime = System.nanoTime();
        lde.excluirChassiMenorIgualQue202050000();
        endTime = System.nanoTime();

        long tempoExcluirChassiMenorIgualQue202050000Lde = endTime - startTime;

        System.out.println("Terminado a Lista Duplamente Encadeada");


        /*Árvore Binaria */
        System.out.println("Iniciando a Árvore Binária");
        ABMap ab = new ABMap();

        long tempoAdicionarVeiculos = adicionarVeiculos(ab);

        System.out.println("Árvore Binária veículos cadastrados:");
        long tempoImprimirVeiculos = imprimirMap(ab);

        startTime = System.nanoTime();
        int quantidadeAb = ab.countMarcaFord();
        endTime = System.nanoTime();

        long tempoContarMarcaFordAb = endTime - startTime;

        startTime = System.nanoTime();
        ab.excluirChassiMenorIgualQue202050000();
        endTime = System.nanoTime();

        long tempoExcluirChassiMenorIgualQue202050000Ab = endTime - startTime;

        System.out.println("Terminado a Árvore Binária");

        /* Resultados */

        System.out.println("Vetor");
        System.out.println("Tempo para adicionar veículos: " + tempoAdicionarVetor + " nanosegundos");
        System.out.println("Tempo para imprimir veículos: " + tempoImprimirVetor + " nanosegundos");
        System.out.println("Tempo para contar veículos da marca Ford: " + tempoContarMarcaFord + " nanosegundos");
        System.out.println("Quantidade de veículos da marca Ford: " + quantidadeVetor);
        System.out.println("Tempo para excluir veículos com chassi menor que 202050000: " + tempoExcluirChassiMenorIgualQue202050000Vetor + " nanosegundos");
        System.out.println();

        System.out.println("Lista Duplamente Encadeada");
        System.out.println("Tempo para adicionar veículos: " + tempoAdicionarLde + " nanosegundos");
        System.out.println("Tempo para imprimir veículos: " + tempoImprimirLde + " nanosegundos");
        System.out.println("Tempo para contar veículos da marca Ford: " + tempoContarMarcaFordLde + " nanosegundos");
        System.out.println("Quantidade de veículos da marca Ford: " + quantidadeLde);
        System.out.println("Tempo para excluir veículos com chassi menor que 202050000: " + tempoExcluirChassiMenorIgualQue202050000Lde + " nanosegundos");
        System.out.println();

        System.out.println("Árvore Binária");
        System.out.println("Tempo para adicionar veículos: " + tempoAdicionarVeiculos + " nanosegundos");
        System.out.println("Tempo para imprimir veículos: " + tempoImprimirVeiculos + " nanosegundos");
        System.out.println("Tempo para contar veículos da marca Ford: " + tempoContarMarcaFordAb + " nanosegundos");
        System.out.println("Quantidade de veículos da marca Ford: " + quantidadeAb);
        System.out.println("Tempo para excluir veículos com chassi menor que 202050000: " + tempoExcluirChassiMenorIgualQue202050000Ab + " nanosegundos");
        System.out.println();

    }

    public static long adicionarVeiculos(Map<Integer, Veiculo> map) {
        long startTime = System.nanoTime();

        final int NUMERO_VEICULOS = 100000;

        for(int i = 0; i < NUMERO_VEICULOS; i++) {
            Veiculo veiculo = new Veiculo();
            map.put(veiculo.getChassi(), veiculo);
        }
    
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        return duration;
    }

    public static long imprimirMap(Map<Integer, Veiculo> map) {
        long startTime = System.nanoTime();

        System.out.println(map);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        return duration;
    }
    

}
