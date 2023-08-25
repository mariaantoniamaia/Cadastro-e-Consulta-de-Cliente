package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class JanelaCadastroMig extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCPF;
	private JLabel labelNome;
	private JTextField fieldNome;
	private JLabel labelEndereco;
	private JTextField fieldEndereco;
	private JLabel labelProfissao;
	private JComboBox<String> comboProfissao;
	private JButton buttonCadastrar;
	private JButton buttonConsultar;
	private JButton buttonLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroMig frame = new JanelaCadastroMig();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaCadastroMig() {
		setTitle("Janela de Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[100px,grow][100px,grow][100px,grow][20px][20px][20px][]", "[][][30px][]"));
		
		JLabel labelCPF = new JLabel("CPF");
		contentPane.add(labelCPF, "cell 0 0,alignx left");
		
		fieldCPF = new JTextField();
		contentPane.add(fieldCPF, "cell 0 0,growx");
		fieldCPF.setColumns(10);
		
		labelNome = new JLabel("Nome");
		contentPane.add(labelNome, "cell 1 0 6 1,alignx left");
		
		fieldNome = new JTextField();
		contentPane.add(fieldNome, "cell 1 0 6 1,growx");
		fieldNome.setColumns(10);
		
		labelEndereco = new JLabel("Endereco");
		contentPane.add(labelEndereco, "cell 0 1 2 1,alignx left");
		
		fieldEndereco = new JTextField();
		contentPane.add(fieldEndereco, "cell 0 1,growx");
		fieldEndereco.setColumns(10);
		
		labelProfissao = new JLabel("Profissao");
		contentPane.add(labelProfissao, "cell 2 1 5 1,alignx left");
		
		comboProfissao = new JComboBox<String>();
		comboProfissao.addItem("");
		comboProfissao.addItem("Professor");
		comboProfissao.addItem("Médico");
		contentPane.add(comboProfissao, "cell 2 1 5 1,growx");
		
		buttonCadastrar = new JButton("Cadastrar");
		contentPane.add(buttonCadastrar, "cell 0 3,growx");
		
		buttonConsultar = new JButton("Consultar");
		contentPane.add(buttonConsultar, "cell 1 3,growx");
		
		buttonLimpar = new JButton("Limpar");
		contentPane.add(buttonLimpar, "cell 2 3,growx");
	}

}
