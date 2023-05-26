# Exercícios Práticos
## Questão 10

### Implemente um método que ordene uma lista simplesmente encadeada de inteiros utilizando o algoritmo bubbleSort.

Resposta:

Entrada: [3, 7, 1, 4, 9, 2], <br>

### Bubble Sort:<br>
3 7 1 4 9 2 (Entrada)<br>
3 <span style="color:red">1 7</span> 4 9 2<br>
3 1 <span style="color:red">4 7</span> 9 2<br>
3 1 4 7 <span style="color:red">2 9</span><br>
<span style="color:red">1 3</span> 4 7 2 9<br>
1 3 4 <span style="color:red">2 7</span> 9<br>
1 3 <span style="color:red">2 4</span> 7 9<br>
1 <span style="color:red">2 3 </span> 4 7 9 (Saida)<br>
___
	
<br>    

### Selection Sort:<br>
3 7 1 4 9 2 (Entrada)<br>
<span style="color:red">1</span> 7 <span style="color:red">3</span> 4 9 2<br>
1 <span style="color:red">2</span> 3 4 9 <span style="color:red">7</span><br>
1 2 3 4 <span style="color:red">7 9</span> (Saida)<br>

___ 

<br> 

### Insertion Sort:<br>
3 7 1 4 9 2 (Entrada) <br>
3 <span style="color:red">7 7</span> 4 9 2<br>
3 <span style="color:red">3 7</span> 4 9 2<br>
<span style="color:red">1 3</span> 7 4 9 2<br>
1 3 <span style="color:red">7 7</span> 9 2<br>
1 3 <span style="color:red">4 7</span> 9 2<br>
1 3 4 7 <span style="color:red">9 9</span><br>
1 3 4 <span style="color:red">7 7</span> 9<br>
1 3 <span style="color:red">4 4</span> 7 9<br>
1 <span style="color:red">3 3</span> 4 7 9<br>
1 <span style="color:red">2 3</span> 4 7 9 (Saida) <br>
