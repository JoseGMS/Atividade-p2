package br.maua.models;

import br.maua.enumerates.Estado;
import br.maua.enumerates.FormaPagamento;

import java.util.Scanner;

public class Vender {
    public static void run() {
        Scanner ler = new Scanner(System.in);
        int opcao;
        System.out.println("Pizzaria o Rato que Ri\n 1 - Nova Venda\n 2 - Verificar pedidos\n 3 - Alterar pedidos\n 0 - Sair");
        Pedido pedido = new Pedido();
        opcao = ler.nextInt();
            while (opcao != 0){

                switch (opcao) {
                case 1:
                    pedido.novaVenda();
                    break;
                case 2:
                    pedido.mostraPedidos();
                    break;
                case 3:
                    pedido.alterarPedidos();
                    break;
            }
                System.out.println("Pizzaria o Rato que Ri\n 1 - Nova Venda\n 2 - Verificar pedidos\n 3 - Alterar pedidos\n 0 - Sair");
            opcao = ler.nextInt();
            }
    }
    }
