/*
RESUMO      : Exercicio 0, método principal
PROGRAMADORA: Luiza Felix
DATA        : 09/03/2023
 */

package view;

import controller.ThreadVetor;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = new int[100];
		
		for(int i: vetor) {
			int random = (int)(Math.random()*100) + 1; 
		}
		/*
		 	Math.random() (sozinha) retorna números aleatórios de 0 até 0.99999999999999999
		 	*100 determina que o valor chega a 99 (número máximo formado dentro da sequência)
		 	+1 determina que se sair 0, meu limite vai ser 1 de qualquer forma
		 */
		Thread impar = new ThreadVetor(1, vetor);
		Thread par = new ThreadVetor(2, vetor);
		
		impar.start();
		par.start();
		
		
	}

}
