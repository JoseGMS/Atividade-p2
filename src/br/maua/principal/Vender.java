package br.maua.principal;

import br.maua.interfaces.Autenticar;
import br.maua.models.Pedido;
import br.maua.models.usuario;

import java.util.Scanner;

/**
 * Classe principal do programa,é aqui onde é centro das vendas, nela está presente o loop que ocorre para o cliente adicionar novos pedidos, ver os pedidos atuais ou alterar os existentes.
 * @author José Guilherme Martins dos Santos - josegms2000@gmail.com
 * @since 26/06/2020
 * @version 1.o
 */

public class Vender {
    /**
     * Função que é chamada pela classe main, essa a função principal do programa, aqui é onde ocorre maior parte da intereção com os funcionarios da pizzaria.
     *
     *
     */
    public static void run() {
        Autenticar funcionario = new usuario();
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
