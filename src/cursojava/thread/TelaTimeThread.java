package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread  extends JDialog {
	
	//Executa o que tiver dentro no momento da abertura ou execu��o
	public TelaTimeThread() { 
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		//Primeira parte concluida
	    
		// Sempre ser� o ultimo comando
		setVisible(true);//Torna a tela visivel para o usu�rio
	}

}
