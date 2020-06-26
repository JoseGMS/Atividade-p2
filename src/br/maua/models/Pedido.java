package br.maua.models;

import br.maua.enumerates.Estado;
import br.maua.enumerates.FormaPagamento;

import java.util.ArrayList;

public class Pedido {
    ArrayList<Cadastro> myCadastro = new ArrayList<>();

    public void novaVenda(String id, String descricao, int valor, FormaPagamento formaPagamento, Estado estado){
        myCadastro.add(new Cadastro(id, descricao, valor, formaPagamento, estado));

    }

    public void mostraPedidos(){
        for (Cadastro pedido: myCadastro)
            System.out.println(pedido.getEstado());
    }

    public void alterarPedidos(String id, Estado estadoAtual){
        for (Cadastro pedido: myCadastro){
            if(id == pedido.getId())
                pedido.setEstado(estadoAtual);
        }

    }

}
