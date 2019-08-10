package br.com.countingsort.sortingmethod;

import br.com.countingsort.application.Program;

/**
 *
 * @author Thales Lima de Assis (thales-assis - https://github.com/thales-assis)
 */
public class CountingSort {

	public static void sortVector(int[] vector) {

		// Find the largest element of the vector.
		// Encontra o maior elemento do vetor.
		int largestElement = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > largestElement) {
				largestElement = vector[i];
			}	
		}

		// Creates an auxiliary vector that will count the values of the original vector.
		// Cria um vetor auxiliar que irá fazer a contagem dos valores do vetor original.
		int[] auxiliaryVector = new int[largestElement + 1];
		
		// Counting of occurrences in the original vector for the auxiliary vector.
		// Contagem das ocorrencias no vetor original para o vetor auxiliar.
		for (int i = 0; i < vector.length; i++) {
			auxiliaryVector[vector[i]]++;
		}
		
		System.out.println("Vector with the counted positions:");
		Program.printVector(auxiliaryVector);
		
		// Auxiliary that will save the position that has already been inserted in the original vector.
		// Auxiliar que irá guardar a posição que já foi inserida no vetor original.
		int index = 0;
		
		// It traverses the auxiliary vector by checking the indices that are with elements greater than zero.
		// Percorre o vetor auxiliar verificando os índices que estão com elementos maior do que zero.
		for (int i = 0; i < auxiliaryVector.length; i++) {
			
			// While the value is greater than zero, it uses the index value as an element in the original vector.
			// Enquanto o valor seja maior do que zero, utiliza o valor do índice como elemento no vetor original.
			while (auxiliaryVector[i] > 0) {

				// It plays in the original vector the value of the position of the auxiliary vector.
				// Joga no vetor original o valor da posição do vetor auxiliar.
				vector[index] = i;

				// After receiving the value of the index, add the variable index in +1 to record the already pre-filled positions in the original vector.
				// Após receber o valor do indice, soma a variavel index em +1 para gravar as posições já preeenchidas no vetor original.
				index++;
				
				// Decrements the value of the auxiliary vector's current position by -1.
				// Decrementa em -1 o valor da atual posição do vetor auxiliar.
				auxiliaryVector[i]--;
			}
		}
	}

}
