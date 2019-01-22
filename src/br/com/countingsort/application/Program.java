package br.com.countingsort.application;

import br.com.countingsort.sortingmethod.CountingSort;

/**
*
* @author Thales Lima de Assis (T-Assis - https://github.com/T-Assis)
*/
public class Program {

	public static void main(String[] args) {

		int[] vector = {9, 8, 6, 10, 4, 3, 7, 0, 3, 15, 13, 1, 2, 3, 0}; 
		System.out.println("Counting Sort:");
		System.out.println("Vector before:");
		printVector(vector);

		CountingSort.sortVector(vector);
		
		System.out.println("Vector after:");
		printVector(vector);
	} 
	
	public static void printVector(int[] vector) {
		System.out.print("[ ");
		for (int i = 0; i < vector.length; i++) {
			if(i == vector.length - 1 ) {
				System.out.print(vector[i] + " ]");
			}	
			else {
				System.out.print(vector[i] + ", ");
			}
		}
		System.out.println("\n");
	}

}
