package modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Inimigo extends ObjetosEspaciais {
	int vidas = 0;
	Image inimigo;
	int dimensaoX;
	int dimensaoY;
	int num = 10;
		
	public Inimigo(){
		inimigo = new ImageIcon("Imagem/inimigo.gif").getImage();
	}
}
