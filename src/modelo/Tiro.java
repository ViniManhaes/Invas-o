package modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tiro extends ObjetosEspaciais {
	
	public Tiro(Nave nave){
		super("Figura/nave.gif");
		posicaoX = nave.posicaoX;
		super.posicaoY = 480;
		
	}
	public int getDimensaoX(){
		return super.figura.getWidth(null);
	}
	public int getDimensaoY(){
		return super.figura.getHeight(null);
	}
	public void Sobe(){
		posicaoY-=2;
	}
	
}
