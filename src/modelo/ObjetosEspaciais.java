package modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ObjetosEspaciais {
	
	protected int vida;
	protected Image figura;
	protected int dimensaoX;
	protected int dimensaoY;
	protected int posicaoX;
	protected int posicaoY;
	
	public ObjetosEspaciais(String caminho) {
		figura = new ImageIcon(caminho).getImage();
	}
	
	public void setVidas(int vida) {
		this.vida = vida;
	}
	public int getVidas(){
		return vida;
	}
	public int getDimensaoX(){
		return dimensaoX;
	}
	public void setDimensaoX(int dimensaoX) {
		this.dimensaoX = dimensaoX;
	}
	public int getDimensaoY(){
		return dimensaoY;
	}
	public void setDimensaoY(int dimensaoY) {
		this.dimensaoY = dimensaoY;
	}
	public int getPosicaoX(){
		return posicaoX;
	}
	public int getPosicaoY(){
		return posicaoY;
	}
	public void setPosicaoX(int posicaoX){
		this.posicaoX = posicaoX;
	}
	public  void setPosicaoY(int posicaoY){
		this.posicaoY = posicaoY;
	}	
	public Image getImagem(){
		return figura;
	}

}
