package controle;

import visao.Teclado;
import visao.Tela;

public class Repinta extends Thread {
	Tela tela;
	
	public Repinta(Tela tela){
		this.tela = tela;
		this.start();
	}
	public void run(){
		while(true){
			
			tela.repaint();
			try {
				Teclado.sleep(1000/900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
