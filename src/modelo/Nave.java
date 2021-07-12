package modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Nave extends ObjetosEspaciais {
	
	public Nave(){
		super("Figura/nave.gif");
		super.vida = 3;
		super.dimensaoX = 50;
		super.dimensaoY = 63;
		super.posicaoX = 350;
		super.posicaoY = 480;
	}
	public void Direita(){
		if(super.posicaoX < 645){
			super.posicaoX++;
		}
	}
	public void Esquerda(){
		if(super.posicaoX > 0){
			super.posicaoX-- ;
		}
	}
}
