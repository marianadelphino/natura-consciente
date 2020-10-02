package br.com.fiap.greencode.naturaconsciente.entity;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class Embalagem{

	private int codigo;

	private byte[] qrCodeImage;

	private byte[] fotoEmbalagem;

	private String descricao;

	private int pontosPorEmbalagem;

	/**
	 * @throws IOException 
	 * 
	 */
	public Embalagem() {
		super();
	}

	/**
	 * @param descricao
	 * @param pontosPorEmbalagem
	 * @throws IOException
	 */
	public Embalagem(int codigo, String descricao, int pontosPorEmbalagem) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.pontosPorEmbalagem = pontosPorEmbalagem;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public byte[] getQrCodeImage() {
		return qrCodeImage;
	}

	public void setQrCodeImage(byte[] qrCodeImage) {
		this.qrCodeImage = qrCodeImage;
	}

	public byte[] getFotoEmbalagem() {
		return fotoEmbalagem;
	}

	public void setFotoEmbalagem(byte[] fotoEmbalagem) {
		this.fotoEmbalagem = fotoEmbalagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPontosPorEmbalagem() {
		return pontosPorEmbalagem;
	}

	public void setPontosPorEmbalagem(int pontosPorEmbalagem) {
		this.pontosPorEmbalagem = pontosPorEmbalagem;
	}
}
