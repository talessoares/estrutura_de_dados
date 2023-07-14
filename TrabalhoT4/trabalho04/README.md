# Trabalho 4 – Fábrica de Veículos

## Objetivo

Desenvolver uma aplicação para manipular veículos armazenados em um Mapa, em 
que o número do chassi é usado como chave. O TAD mapa é representado pela interface Map 
disponível em https://docs.oracle.com/javase/7/docs/api/java/util/Map.html. Essa interface 
deve ser implementada pelo time utilizando três estruturas de dados: Vetor (ordenado), Lista 
duplamente encadeada (ordenada) e Árvore Binária. Estas estruturas de dados devem ser
implementadas pela equipe, isto é, não é permitido o uso de classes de estruturasjá existentes 
na linguagem Java.

Para cada estrutura de dados deve ser medido o tempo total gasto para cada uma das 
seguintes operações (usar o método System.nanoTime() para ser mais preciso):

- Inserir 100.000 (cem mil) veículos;
- Apresentar todos os veículos em ordem crescente de número de chassi;
- Verificar quantos veículos são da marca Ford;
- Remover todos os veículos com número de chassi igual ou inferior à 202050000.

Os veículos devem ser gerados por meio da classe Veiculo.java que está disponível no 
Moodle e não pode ser modificada. Essa classe funciona como uma fábrica que gera veículos 
aleatórios de diferentes marcas.