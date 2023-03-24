/*
RESUMO      : Exercicio 0, método principal
PROGRAMADORA: Luiza Felix
DATA        : 09/03/2023
 */

package view;

import controller.TV;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = new int[100];
		
		for(int i = 0; i<100; i++) {
			int random = (int)(Math.random()*100) + 1; 
			 vetor[i]= random;
		}
		/*
		 	Math.random() (sozinha) retorna números aleatórios de 0 até 0.99999999999999999
		 	*100 determina que o valor chega a 99 (número máximo formado dentro da sequência)
		 	+1 determina que se sair 0, meu limite vai ser 1 de qualquer forma
		 */
		Thread impar = new TV(1, vetor);
		impar.start();
		
		Thread par = new TV(2, vetor);
		par.start();
		
		
		
		
	}

}
