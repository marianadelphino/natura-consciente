package br.com.fiap.greencode.naturaconsciente.entity;


public class Telefone {

	private int codigo;

	private int ddd;

	private String numero;

	/**
	 * 
	 */
	public Telefone() {
		super();
	}

	/**
	 * @param ddd
	 * @param numero
	 */
	public Telefone(int ddd, String numero) {
		super();
		this.ddd = ddd;
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
