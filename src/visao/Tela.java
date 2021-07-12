package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class Tela extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public static final int JOGO_LARGURA 	= 700;
	public static final int JOGO_ALTURA 	= 600;

	Painel painel;
	
	private JMenuBar BarraMenu = null;
	private JMenu menuArquivo = null;
	private JMenu menuAjuda = new JMenu();
	private JMenuItem instrucoes = new JMenuItem();
	private JMenuItem menuSair = null;
	private JMenuItem menuJogar = null;
	
	/*Variável para saber o tamanho da janela*/
//	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	/*Exibe Mensagens na Tela*/

	/*private JTextArea texto = new JTextArea();*/

	public void actionPerformed(ActionEvent evt){
		Object source = evt.getSource();

//		 A variavel color precisa ter um valor inicial
//		 pois os if's poderiam todos falhar, em teoria.

    	if (source == menuJogar) {
    		painel.setEmJogo(true);	
		}
		else if (source == menuSair){

			int saida = JOptionPane.showConfirmDialog(null,"Deseja Sair ?");
			if (saida == JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(null, "Saiuuu...");
				System.exit(0);
			}
			else if (saida == JOptionPane.NO_OPTION){
				JOptionPane.showMessageDialog(null, "Não vai sair...");
				JOptionPane.showInputDialog(null, "Digite seu nome");
			}
		}
	}

	public Tela(Painel p){
		this.painel = p;
		initialize();
	}

	private void initialize(){

		this.setTitle("Space Invanda-los bolado d+");
		this.setJMenuBar(getBarraMenu());
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(JOGO_LARGURA,JOGO_ALTURA);
		this.setResizable(false);
		this.add(painel);
		
	}

	private JMenuBar getBarraMenu() {
		if (BarraMenu == null){
			BarraMenu = new JMenuBar();
			BarraMenu.add(getMenuArquivo());
			BarraMenu.add(getMenuAjuda());
		}
		return BarraMenu;
	}

	private JMenu getMenuAjuda() {
				menuAjuda.setMnemonic('j');
				menuAjuda.setText("Ajuda");
				menuAjuda.add(getSubMenuInstrucoes());

			return menuAjuda;
	}

	private JMenuItem getSubMenuInstrucoes() {

				instrucoes.setMnemonic('I');
				instrucoes.setText("Instrucoes");
				instrucoes.addActionListener(this);
				return instrucoes;
	}

	private JMenu getMenuArquivo() {
		if (menuArquivo == null){
			menuArquivo = new JMenu();
			menuArquivo.setMnemonic('A');
			menuArquivo.setText("Opções");
			menuArquivo.add(getSubMenuJogar());
			menuArquivo.add(getSubMenuSair());
		}
		return menuArquivo;
	}

	private JMenuItem getSubMenuSair() {
		if (menuSair == null){
			menuSair = new JMenuItem();
			menuSair.setMnemonic('S');
			menuSair.setText("Sair");
			menuSair.addActionListener(this);
		}
		return menuSair;
	}

	private JMenuItem getSubMenuJogar() {
		if (menuJogar == null){
			menuJogar = new JMenuItem();
			menuJogar.setMnemonic('J');
			menuJogar.setText("Novo jogo");
			menuJogar.addActionListener(this);
		}
		return menuJogar;
	}
}
