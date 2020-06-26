package br.maua;

import br.maua.enumerates.Estado;
import br.maua.enumerates.FormaPagamento;
import br.maua.models.Cadastro;
import br.maua.models.Pedido;

import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.novaVenda("2","oioi",200,FormaPagamento.CREDITO,Estado.DEVOLVIDO);
        pedido.novaVenda("3","oioi",200,FormaPagamento.CREDITO,Estado.PREPARACAO);
        pedido.novaVenda("4","oioi",200,FormaPagamento.CREDITO,Estado.PREPARACAO);
        pedido.novaVenda("5","oioi",200,FormaPagamento.CREDITO,Estado.ENTREGUE);
        pedido.novaVenda("6","oioi",200,FormaPagamento.CREDITO,Estado.REALIZADO);

        pedido.mostraPedidos();
        System.out.println("\nSeparação");
        pedido.alterarPedidos("3",Estado.DEVOLVIDO);
        pedido.alterarPedidos("6",Estado.DEVOLVIDO);
        pedido.mostraPedidos();

    }
}
