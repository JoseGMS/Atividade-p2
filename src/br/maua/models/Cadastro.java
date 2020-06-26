package br.maua.models;

import br.maua.enumerates.Estado;
import br.maua.enumerates.FormaPagamento;

public class Cadastro {
    private String id;
    private String descricao;
    private int valor;
    private FormaPagamento formaPagamento;
    private Estado estado;

    public Cadastro(String id, String descricao, int valor, FormaPagamento formaPagamento, Estado estado) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.estado = estado;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getValor() {
        return valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public Estado getEstado() {
        return estado;
    }
}
