package visao;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;

import modelo.Tiro;

public class Teclado extends Thread implements KeyListener {

	Painel painel;

	boolean esquerda;
	boolean teco;
	boolean direita;

	Tiro tiro;

	int velocidadeTiro = 0;

	public Teclado(Painel painel) {
		super();
		this.painel = painel;
		this.start();
		

	}

	public void keyPressed(KeyEvent event) {
		int keyCode = event.getKeyCode();

		if (keyCode == KeyEvent.VK_RIGHT) {
			this.direita = true;
		}

		if (keyCode == KeyEvent.VK_LEFT) {
			this.esquerda = true;
		}
		if (keyCode == KeyEvent.VK_SPACE) {
			this.teco = true;
		}

	}

	public void keyReleased(KeyEvent event) {
		int keyCode = event.getKeyCode();

		if (keyCode == KeyEvent.VK_RIGHT) {
			this.direita = false;
		}

		else if (keyCode == KeyEvent.VK_LEFT) {
			this.esquerda = false;
		}
		if (keyCode == KeyEvent.VK_SPACE) {
			this.teco = false;
			velocidadeTiro=40;
		}

	}

	public void keyTyped(KeyEvent event) {
		
	}

	public void run() {
		while(true){
			if(direita == true) {
				painel.nave.Direita();
			}
			if(esquerda == true) {
				painel.nave.Esquerda();
			}
			if(teco == true) {
				if(velocidadeTiro == 40) {
					painel.tiro.add(tiro = new Tiro(painel.nave));
					velocidadeTiro=0;
				}
				velocidadeTiro++;
			}
			for(Tiro e: painel.tiro){
				e.Sobe();
			}
			Iterator<Tiro> it = painel.tiro.iterator();
			while(it.hasNext()){
				Tiro tiro = it.next();
				if(tiro.getPosicaoY() < 0-tiro.getDimensaoY()){
					it.remove();
					System.out.println("remove");
				}
			}

			try {
				Teclado.sleep(1000 / 300);
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}

			
		}

	}

}
