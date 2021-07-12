package controle;

import visao.Teclado;
import visao.Tela;

public class Master {
	Tela tela;
	Controle controle;
	
	public Master(){
		controle = new Controle();
		tela = new Tela(controle.painel);
		tela.setVisible(true);
		tela.addKeyListener(new Teclado(controle.painel));
		Repinta repinta = new Repinta(tela);
	}
	

}
