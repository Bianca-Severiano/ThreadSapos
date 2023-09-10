package view;

import java.util.Iterator;

import controller.ThreadSapos;

public class Principal {

	public static void main(String Args[]) {
		int percurso = 5;
		int vet[][] = new int[5][4];
		
		//posicaoatual
		//salto
		//novaposicao
		//colocacao

		System.out.println("Percurso: " + percurso + "m");
		for (int i = 0; i < 5; i++) {	
			Thread t = new ThreadSapos(percurso, vet[i], i);
			t.start();
			
		}
		

	}

}
