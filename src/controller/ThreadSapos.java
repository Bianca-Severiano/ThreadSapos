package controller;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSapos extends Thread {

	private int percurso;
	private int vet[] = new int[4];
	private int id;

	private static AtomicInteger colocacao = new AtomicInteger(0);

	// posicaoatual
	// salto
	// novaposicao
	// colocacao

	public ThreadSapos(int percurso, int[] vet, int id) {
		this.percurso = percurso;
		this.vet = vet;
		this.id = id;
	}

	public void run() {
		corrida();
	}

	private void corrida() {

		if (vet[2] < percurso) {
			do {
				vet[1] = (int) (Math.random() * 4) + 1;
				vet[2] = vet[0] + vet[1];
				vet[0] = vet[2];

				if (percurso - vet[0] > 0) {
					System.out.println("Sapo " + id + " está em " + vet[2] + "m após salto de " + vet[1] + ". Restam: "
							+ (percurso - vet[0] + "m"));
				} else {
					System.out.println("Sapo " + id + " está em " + vet[2] + "m após salto de " + vet[1] + " Chegou!!");
				}

			} while (vet[2] < percurso);
			
		} 

		vet[3] = colocacao.incrementAndGet();
		try {
			sleep(5 * vet[3]);
			System.err.println("Sapo " + id + " chegou em " + vet[3] + "° lugar.");
		} catch (Exception e) {
			
		}
		

	}

}
