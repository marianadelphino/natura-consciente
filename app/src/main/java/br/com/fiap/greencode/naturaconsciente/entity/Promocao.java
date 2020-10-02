package br.com.fiap.greencode.naturaconsciente.entity;

public class Promocao {

	private int codigo;

	private String descricao;

	private int pontosNecessarios;

	/**
	 * 
	 */
	public Promocao() {
		super();
	}

	/**
	 * @param descricao
	 * @param pontosNecessarios
	 */
	public Promocao(String descricao, int pontosNecessarios) {
		super();
		this.descricao = descricao;
		this.pontosNecessarios = pontosNecessarios;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPontosNecessarios() {
		return pontosNecessarios;
	}

	public void setPontosNecessarios(int pontosNecessarios) {
		this.pontosNecessarios = pontosNecessarios;
	}

}
