/*
RESUMO      : Exercicio 0, thread padrão para perccorer vetor
PROGRAMADORA: Luiza Felix
DATA        : 09/03/2023
 */

package controller;

public class ThreadVetor extends Thread{

	private int[] v;
	private int n;
//	por serem privados,os valores são atribuidos usando o "this."
	
	public ThreadVetor(int numero, int[] vetor) {
//		parâmetros de thread sempre são passados/recebidos pelo método construtor
		this.v = vetor;
		this.n = numero;
	}
	
	@Override
	public void run() {
		
		if (n%2==0) {
			System.out.println( "#TID "+ getId()+": \n	NuMERO: "+ n + "\n	TEMPO: " + par() + "s. ");
		} else {
			System.out.println( "#TID "+ getId()+": \n	NuMERO: "+ n + "\n	TEMPO: " + impar() + "s. ");
		}
			
	}

	private double impar() {
		double inicial = System.nanoTime();
		int tamanho = v.length;
		for(int i =0; i < tamanho; i++ ) {
//			não tenho nenhuma ação específica para executar aqui dentro
		}
		double finale = System.nanoTime();
		
		return ((finale - inicial) /Math.pow(10, 9));
	}

	private double par() {
		double inicial = System.nanoTime();
		for(int i : v) {
//			para cada i pertencente a uma posição do vetor, faça (nada)
		}
		double finale = System.nanoTime();
		
		return ((finale - inicial) /Math.pow(10, 9));
	}
}