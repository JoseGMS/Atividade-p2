package br.maua.models;

import br.maua.enumerates.Estado;
import br.maua.enumerates.FormaPagamento;

/** Classe responsavel por organizar novos pedidos cadastrados, é a base para a criação de uma lista de cadastro na classe de pedidos.
 * @author José Guilherme Martins dos Santos - josegms2000@gmail.com
 * @since 26/06/2020
 * @version 1.0
 */

public class Cadastro {
    private String id;
    private String descricao;
    private float valor;
    private FormaPagamento formaPagamento;
    private Estado estado;

    /**
     * @param id id do pedido, numero randomico gerado na classe pedido.
     * @param descricao descrição do pedido, é dada pelo proprio funcionario.
     * @param valor valor do pedido, escrito pelo proprio funcionario.
     * @param formaPagamento forma de pagamento, dada pelo proprio funcionario.
     * @param estado estado do pedido, dado pelo proprio funcionario.
     */
    public Cadastro(String id, String descricao, float valor, FormaPagamento formaPagamento, Estado estado) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.estado = estado;
    }

    /**
     * @return getter do id.
     */
    public String getId() {
        return id;
    }

    /**
     * @return getter da descrição.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return getter do valor.
     */
    public float getValor() {
        return valor;
    }

    /**
     * @return getter da forma de pagamento.
     */
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @return getter do estado do pedido.
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado setter do estado.
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
