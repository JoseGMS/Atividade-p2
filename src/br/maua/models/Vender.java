package br.maua.models;

import br.maua.enumerates.Estado;
import br.maua.enumerates.FormaPagamento;
import br.maua.interfaces.Autenticar;

import java.util.Scanner;

public class Vender {
    public static void run() {
        Autenticar funcionario = new Pedido();
        Scanner ler = new Scanner(System.in);
        int opcao;
        System.out.println("Pizzaria o Rato que Ri\n 1 - Nova Venda\n 2 - Verificar pedidos\n 3 - Alterar pedidos\n 0 - Sair");
        Pedido pedido = new Pedido();
        opcao = ler.nextInt();
            while (opcao != 0){

                switch (opcao) {
                case 1:
                    Scanner lerSenha = new Scanner(System.in);
                    System.out.println("Digite a senha: ");
                    int senha = lerSenha.nextInt();
                    if(funcionario.autentica(senha))
                    pedido.novaVenda();
                    else
                        System.out.println("\nSenha incorreta!\n");
                    break;
                case 2:
                    pedido.mostraPedidos();
                    break;
                case 3:
                    Scanner lerSenha2 = new Scanner(System.in);
                    System.out.println("Digite a senha: ");
                    int senha2 = lerSenha2.nextInt();
                    if(funcionario.autentica(senha2))
                        pedido.alterarPedidos();
                    else
                        System.out.println("\nSenha incorreta!\n");
                    break;
            }
                System.out.println("Pizzaria o Rato que Ri\n 1 - Nova Venda\n 2 - Verificar pedidos\n 3 - Alterar pedidos\n 0 - Sair");
            opcao = ler.nextInt();
            }
    }
    }
