# Exercícios Práticos
## Questão 11

### Dado o vetor a seguir [7, 1, 1, 3, 2], explique com suas palavras o conceito de estabilidade em um algoritmo de ordenação. Além disso, demonstre, desenhando o estado do vetor a cada troca de elementos. 
<br>

## Resposta:

Entrada: [7, 1, 1, 3, 2], <br>

### Ordenação:<br>
7 1 1 3 2 (Entrada)<br> 
<span style="color:red">1</span> 7 1 3 2<br>
<span style="color:red">1 1</span> 7 3 2<br>
<span style="color:red">1 1 2</span> 3 7<br>
<span style="color:red">1 1 2 3 7</span> (Saida)<br>
___

<br>  

### Sobre estabilidade:
O conceito de estabilidade em um algoritmo de ordenação é que, quando dois elementos são iguais, o algoritmo de ordenação não altera a ordem relativa entre eles. <br>