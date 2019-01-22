# CountingSort-Algorithm
## English:

Counting sort is an algorithm by counting created in 1954 by Harold H. Seward at MIT (Massachusetts
Institute of Technology).

In computer science, counting sort is an algorithm for sorting a collection of objects according to their keys which are nonnegative integers (these values are between 0 and n). It operates by counting the number of objects that have each distinct key value and using arithmetic in those counts to determine the positions of each key value in the output sequence. Its execution time is linear in the number of items and the difference between the maximum and minimum key values is therefore only suitable for direct use in situations where the change in keys is not significantly greater than the number of items. However, it is often used as a subroutine in another sort algorithm, radix sort, which can handle larger keys more efficiently.

Although the algorithm uses a while inserted with in a for, it is guaranteed that the code is executed only n times (We can verify that this code ensures that each vector is traversed a finite number of times). The initialization of the counting matrix and the second for loop that executes a prefix sum in the count matrix, each iterating at most k+1 times and therefore taking the time O(k). The other loops are, take O(n). Therefore, the time for the entire algorithm is the sum of the times for these steps, O(n+k)

A Counting Sort problem is your bad memory allocation, for example, a vector to be ordered with only 3 positions with the following values:
- Vector: [03, 69, 1540];

An auxiliary vector of 1541 positions is created to sort only the same three values, which makes it clear that Counting Sort is not very recommendable for use when memory space is small.

## Example:
Given the initial vector: [ 9, 8, 6, 10, 4, 3, 7, 0, 3, 15, 13, 1, 2, 3, 0 ], the following image demonstrates the step by step of Counting Sort (this image is based on the code of this project).

![image](https://user-images.githubusercontent.com/17066350/51559593-754eab00-1e69-11e9-9a43-0a8cb79ee7e5.png)

**Vector after passing through the Counting Sort algorithm:** [ 0, 0, 1, 2, 3, 3, 3, 4, 6, 7, 8, 9, 10, 13, 15 ]

## References:
 - https://en.wikipedia.org/wiki/Counting_sort
 - https://www.hackerearth.com/pt-br/practice/algorithms/sorting/counting-sort/tutorial/
 - https://www.geeksforgeeks.org/counting-sort/
 - https://pt.wikipedia.org/wiki/Counting_sort
 
## ====================================================

## Português:
Counting sort é um algoritmo por contagem criado em 1954 por Harold H. Seward no MIT (Massachusetts
Institute of Technology).

Na ciência da computação, counting sort é um algoritmo para classificação de uma coleção de objetos de acordo com as suas chaves que são números inteiros não negativos (esses valores estão entre 0 e n). Ele opera contando o número de objetos que possuem cada valor de chave distinto e usando a aritmética nessas contagens para determinar as posições de cada valor de chave na sequência de saída. Seu tempo de execução é linear no número de itens e a diferença entre os valores de chave máximo e mínimo, portanto, é adequado apenas para uso direto em situações em que a variação nas chaves não é significativamente maior que o número de itens. No entanto, é frequentemente usado como uma sub-rotina em outro algoritmo de classificação, o radix sort, que pode manipular chaves maiores com mais eficiência.

Apesar do algoritmo usar um while inserido dentro de um for, é garantido que o código é executado apenas n vezes (Podemos verificar que esse código garante que cada vetor seja percorrido um número finito de vezes). A inicialização da matriz de contagem e a segunda para loop que executa uma soma de prefixo na matriz de contagem, cada iterar no máximo k+1 vezes e, portanto, tomar o tempo O(k). O outro loops for, toma O(n). Portanto, o tempo para o algoritmo inteiro é a soma dos tempos para essas etapas, O(n+k)

Um problema do Count Sort é a sua péssima alocação de memória, por exemplo, um vetor a ser ordenado com apenas 3 posições com os seguintes valores:
- Vetor: [03, 69, 1540];

É criado um vetor auxiliar de 1541 posições para ordenar apenas os mesmos três valores, o que deixa claro que o Count Sort não é muito recomendável para se utilizar quando o espaço de memória é pequeno.

## Exemplo:

Dado o vetor inicial: [ 9, 8, 6, 10, 4, 3, 7, 0, 3, 15, 13, 1, 2, 3, 0 ], a imagem a seguir demonstra o passo a passo das etapas do Counting Sort(esta imagem é com base no código deste projeto).

![image](https://user-images.githubusercontent.com/17066350/51559593-754eab00-1e69-11e9-9a43-0a8cb79ee7e5.png)

**Vetor após ter passado pelo algoritmo Counting Sort:** [ 0, 0, 1, 2, 3, 3, 3, 4, 6, 7, 8, 9, 10, 13, 15 ]

## Referências:
 - https://en.wikipedia.org/wiki/Counting_sort
 - https://www.hackerearth.com/pt-br/practice/algorithms/sorting/counting-sort/tutorial/
 - https://www.geeksforgeeks.org/counting-sort/
 - https://pt.wikipedia.org/wiki/Counting_sort
