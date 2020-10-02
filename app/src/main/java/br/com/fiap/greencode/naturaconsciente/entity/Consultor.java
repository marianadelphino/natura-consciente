package br.com.fiap.greencode.naturaconsciente.entity;

import java.io.Serializable;


public class Consultor implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigo;

	private String nome;

	private String cpf;

	private String senha;

	private String rg;

	private String email;

	private int pontos;

	private Endereco endereco;

	private Telefone telefone;

	private Genero genero;

	/**
	 * 
	 */
	public Consultor() {
		
	}

	/**
	 * @param nome
	 * @param cpf
	 * @param senha
	 * @param rg
	 * @param email
	 * @param pontos
	 * @param endereco
	 * @param telefone
	 * @param genero
	 */
	public Consultor(String nome, String cpf, String senha, String rg, String email, int pontos, Endereco endereco,
			Telefone telefone, Genero genero) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.rg = rg;
		this.email = email;
		this.pontos = pontos;
		this.endereco = endereco;
		this.telefone = telefone;
		this.genero = genero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
