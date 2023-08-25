package controle;

import modelo.Cliente;
import visao.JanelaCadastro;

public class App {
	
	public static void main(String[] args) {
		
		JanelaCadastro j= new JanelaCadastro();
		j.setVisible(true);
		Cliente p= new Cliente();
		
		ClienteControle pcon= new ClienteControle(j, p);
	}

}
