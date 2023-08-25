package visao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class JanelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JButton buttonCadastrar;
	private JButton buttonLimpar;
	private JTextField fieldEndereco;
	private JComboBox<String> comboProfissao;
	private JButton buttonConsulta;


	/**
	 * Create the frame.
	 */
	public JanelaCadastro() {
		setTitle("Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel painel1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) painel1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(painel1);
		
		JLabel labelCPF = new JLabel("CPF");
		labelCPF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel1.add(labelCPF);
		
		fieldCPF = new JTextField();
		fieldCPF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel1.add(fieldCPF);
		fieldCPF.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel1.add(labelNome);
		
		fieldNome = new JTextField();
		fieldNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel1.add(fieldNome);
		fieldNome.setColumns(32);
		
		JPanel painel2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) painel2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(painel2);
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		labelEndereco.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel2.add(labelEndereco);
		
		fieldEndereco = new JTextField();
		fieldEndereco.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel2.add(fieldEndereco);
		fieldEndereco.setColumns(22);
		
		JLabel labelProfissao = new JLabel("Profiss\u00E3o");
		labelProfissao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel2.add(labelProfissao);
		
		comboProfissao = new JComboBox<String>();
		comboProfissao.setPreferredSize(new Dimension(122, 24));
		comboProfissao.addItem("");
		comboProfissao.addItem("Professor");
		comboProfissao.addItem("Médico");
		comboProfissao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel2.add(comboProfissao);
		
		JPanel painel3 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) painel3.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		contentPane.add(painel3);
		
		buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel3.add(buttonCadastrar);
		
		buttonConsulta = new JButton("Consultar");
		painel3.add(buttonConsulta);
		
		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		painel3.add(buttonLimpar);
	}

	public JTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JButton getButtonCadastrar() {
		return buttonCadastrar;
	}

	public void setButtonCadastrar(JButton buttonCadastrar) {
		this.buttonCadastrar = buttonCadastrar;
	}

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public void setButtonLimpar(JButton buttonLimpar) {
		this.buttonLimpar = buttonLimpar;
	}
	

	public JTextField getFieldEndereco() {
		return fieldEndereco;
	}

	public void setFieldEndereco(JTextField fieldEndereco) {
		this.fieldEndereco = fieldEndereco;
	}

	public JComboBox<String> getComboProfissao() {
		return comboProfissao;
	}

	public void setComboProfissao(JComboBox<String> comboProfissao) {
		this.comboProfissao = comboProfissao;
	}
	
	public void limpaTela()
	{
		fieldCPF.setText("");
		fieldNome.setText("");	
		fieldEndereco.setText("");
		comboProfissao.setSelectedIndex(0);
	}

	public JButton getButtonConsulta() {
		return buttonConsulta;
	}

	public void setButtonConsulta(JButton buttonConsulta) {
		this.buttonConsulta = buttonConsulta;
	}
	
	
	
}
