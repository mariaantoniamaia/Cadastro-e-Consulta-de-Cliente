package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.ClienteDAO;
import modelo.Cliente;
import visao.JanelaCadastro;

public class ClienteControle implements ActionListener {
	
	private JanelaCadastro janela;
	private Cliente cli;
	private ClienteDAO clidao;
	
	
	public ClienteControle(JanelaCadastro jan, Cliente cli)
	{
		this.janela=jan;
		this.cli=cli;
		clidao=new ClienteDAO();
		this.janela.getButtonCadastrar().addActionListener(this);
		this.janela.getButtonLimpar().addActionListener(this);
		this.janela.getButtonConsulta().addActionListener(this);
	}
	
	public void cadastraCliente() {
		
		String cpf=janela.getFieldCPF().getText();
		String nome=janela.getFieldNome().getText();
		String endereco=janela.getFieldEndereco().getText();
		String profissao=janela.getComboProfissao().getSelectedItem().toString();
		
		cli.setCpf(cpf);
		cli.setNome(nome);
		cli.setEndereco(endereco);
		cli.setProfissao(profissao);
		
		//cli= new Cliente(cpf, nome, endereco, profissao);
		
		if(cli.validaCampos().size()> 0)
		{
			System.out.println("Campos "+cli.validaCampos()+ " estão em branco!");
		}
		else
		{
			if(clidao.cadastraCliente(cli))
			{
				System.out.println("Cadastro realizado com sucesso");
				janela.limpaTela();
			}
				
			else
			{
				System.out.println("Erro ao cadastrar!");
				janela.limpaTela();
			}
				
		}
		
	}
	
	public void consultaCliente() {
		
		cli.setCpf(janela.getFieldCPF().getText());
		
		if(clidao.consultaCliente(cli))
		{
			janela.getFieldNome().setText(cli.getNome());
			janela.getFieldEndereco().setText(cli.getEndereco());
			janela.getComboProfissao().setSelectedItem(cli.getProfissao());
		}
		else
		{
			System.out.println("CPF não encontrado!");
		}
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("Limpar"))
		{
			janela.limpaTela();
		}
		else if(e.getActionCommand().equals("Cadastrar"))
		{
			cadastraCliente();
		}
		else if(e.getActionCommand().equals("Consultar"))
		{
			consultaCliente();
		}
		
		
	}

}
