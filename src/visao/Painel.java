package visao;

import java.awt.Graphics;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JPanel;

import modelo.Nave;
import modelo.Tiro;

import java.awt.Color;

public class Painel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	 
	public Nave nave = new Nave();
	public HashSet<Tiro> tiro = new HashSet<Tiro>(); 
	public Iterator<Tiro> it = tiro.iterator();
	
	private boolean emJogo;
	 
	public void paint(Graphics g){
		if(this.isEmJogo()) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.drawImage(nave.getImagem(), nave.getPosicaoX(), nave.getPosicaoY(), null);
				
			for(Tiro e: tiro){
			   g.drawImage(e.getImage(),e.getPosicaoX()+nave.getDimensaoX()/2,e.getPosicaoY(),null);
			}
		}
		else {
			g.setColor(new Color(238,238,238));
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
	}

	public boolean isEmJogo() {
		return emJogo;
	}

	public void setEmJogo(boolean emJogo) {
		this.emJogo = emJogo;
	}
	
}
