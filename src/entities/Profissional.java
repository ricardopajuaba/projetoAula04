package entities;

import enums.TipoContratacao;

public class Profissional {

	private Integer id;
	private String nome;
	private String cpf;
	private String telefone;
	private TipoContratacao tipoContratacao;

	public Profissional() {
		// TODO Auto-generated constructor stub
	}

	public Profissional(Integer id, String nome, String cpf, String telefone, TipoContratacao tipoContratacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.tipoContratacao = tipoContratacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public TipoContratacao getTipoContratacao() {
		return tipoContratacao;
	}

	public void setTipoContratacao(TipoContratacao tipoContratacao) {
		this.tipoContratacao = tipoContratacao;
	}

}
