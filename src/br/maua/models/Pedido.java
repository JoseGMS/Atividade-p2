package br.maua.models;

import br.maua.enumerates.Estado;
import br.maua.enumerates.FormaPagamento;
import sun.security.x509.InvalidityDateExtension;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pedido {
    ArrayList<Cadastro> myCadastro = new ArrayList<>();
    private Estado estadoAtual;
    private FormaPagamento pagamentoAtual;
    private String geradorId(){
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
            return idGerado;
    }
    public void novaVenda() {
        Scanner des = new Scanner(System.in);
        System.out.println("Digite a descrição: ");
        String descricao = des.nextLine();
        Scanner val = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        float valor = des.nextFloat();
        Scanner form = new Scanner(System.in);
        System.out.println("Escolha forma de pagamento: \n 1 - Dinheiro\n 2 - Debito\n 3 - Credito\n 4 - Vale Alimentação\n 5 - Vale Refeição");
        int numeroForm = form.nextInt();
        switch (numeroForm){
            case 1:
                pagamentoAtual = FormaPagamento.DINHEIRO;
                break;
            case 2:
                pagamentoAtual = FormaPagamento.DEBITO;
                break;
            case 3:
                pagamentoAtual = FormaPagamento.CREDITO;
                break;
            case 4:
                pagamentoAtual = FormaPagamento.VALE_ALIMENTACAO;
                break;
            case 5:
                pagamentoAtual = FormaPagamento.VALE_REFEICAO;
                break;
        }
        myCadastro.add(new Cadastro(geradorId(), descricao, valor, pagamentoAtual, Estado.REALIZADO));
    }

    public void mostraPedidos(){
        for (Cadastro pedido: myCadastro)
            System.out.println(" -----------------------\nOs pedidos atuais são: \nId: " + pedido.getId() + "\nDescrição: " + pedido.getDescricao() + "\nValor: " + pedido.getValor() + "\nForma de Pagamento: " + pedido.getFormaPagamento() + "\nEstado: " + pedido.getEstado() + "\n-----------------------");
    }

    public void alterarPedidos(){
        Scanner id1 = new Scanner(System.in);
        System.out.println("Digite o id do pedido que deseja alterar: ");
        String id = id1.nextLine();
        Scanner est = new Scanner(System.in);
        System.out.println("Para qual estado você deseja alterar o pedido\n 1 - Realizado\n 2 - Preparação\n 3 - Saiu para a entrega\n 4 - Entregue\n 5 - Devolvido ");
        int estado = est.nextInt();
        switch (estado){
            case 1:
                estadoAtual = Estado.REALIZADO;
                break;
            case 2:
                estadoAtual = Estado.PREPARACAO;
                break;
            case 3:
                estadoAtual = Estado.SAIU_PARA_ENTREGA;
                break;
            case 4:
                estadoAtual = Estado.ENTREGUE;
                break;
            case 5:
                estadoAtual = Estado.DEVOLVIDO;
                break;
        }

        for (Cadastro pedido: myCadastro) {
            if(id.equals(pedido.getId()))
            pedido.setEstado(estadoAtual);
        }
    }

}
