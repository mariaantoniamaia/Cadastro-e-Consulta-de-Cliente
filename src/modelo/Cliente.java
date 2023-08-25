package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String cpf;
	private String nome;
	private String endereco;
	private String profissao;

	public Cliente(String cpf, String nome, String endereco, String profissao) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.profissao = profissao;
	}

	public Cliente() {

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public List<String> validaCampos() {
		ArrayList<String> listaCampos= new ArrayList<String>();
		
		if(cpf.equals(""))
			listaCampos.add("CPF");
		if(nome.equals(""))
			listaCampos.add("Nome");
		
		return listaCampos;
	}
	
	public String toString()
	{
		return cpf+"#"+nome+"#"+endereco+"#"+profissao;
	}

	

}
