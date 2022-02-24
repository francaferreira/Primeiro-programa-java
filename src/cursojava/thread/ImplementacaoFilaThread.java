package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		
		
		while(true) {
			
		//Bloquear o acesso a esta lista por outro processo
		synchronized (pilha_fila) {
			
			Iterator iteracao = pilha_fila.iterator();
			while (iteracao.hasNext()) { //Enquanto conter dados na lista irá processar
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
				
			   /* Processar 10 mil notas fiscal
				  Gerar uma lista enorme de PDF
				  Gerar um envio em massa de email */
				
				System.out.println("=========================");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();
			
		}		
				
		
			
			try {
				Thread.sleep(1000); //Dar um tempo pra descarga de memória
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	
		try {
			Thread.sleep(10000); //Processou toda a lista dá um tempo pra limpeza de memória 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}

