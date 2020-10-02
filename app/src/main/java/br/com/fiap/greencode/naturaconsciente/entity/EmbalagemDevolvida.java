package br.com.fiap.greencode.naturaconsciente.entity;

import java.util.Calendar;

/**
 * Created by logonrm on 19/08/2017.
 */

public class EmbalagemDevolvida {

    private String codigo;

    private Calendar dataDevolucao;

    private String cpfCliente;

    private String consultor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getConsultor() {
        return consultor;
    }

    public void setConsultor(String consultor) {
        this.consultor = consultor;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
