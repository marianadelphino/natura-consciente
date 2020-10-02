package br.com.fiap.greencode.naturaconsciente.entity;

import java.util.Calendar;


public class DevolucaoEmbalagem {
	
	private int codigo;
	private Status status;
	private Calendar dataRecebimento;
	private Calendar dataDevolucao;
	private Cliente cliente;
	private Consultor consultor;
	private Embalagem embalagem;

	/**
	 * 
	 */
	public DevolucaoEmbalagem() {
		super();
	}

	/**
	 * @param status
	 * @param dataRecebimento
	 * @param dataDevolucao
	 * @param cliente
	 * @param consultor
	 * @param embalagem
	 */
	public DevolucaoEmbalagem(Status status, Calendar dataRecebimento, Calendar dataDevolucao, Cliente cliente,
			Consultor consultor, Embalagem embalagem) {
		super();
		this.status = status;
		this.dataRecebimento = dataRecebimento;
		this.dataDevolucao = dataDevolucao;
		this.cliente = cliente;
		this.consultor = consultor;
		this.embalagem = embalagem;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Calendar getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Calendar dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Consultor getConsultor() {
		return consultor;
	}

	public void setConsultor(Consultor consultor) {
		this.consultor = consultor;
	}

	public Embalagem getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(Embalagem embalagem) {
		this.embalagem = embalagem;
	}

}
