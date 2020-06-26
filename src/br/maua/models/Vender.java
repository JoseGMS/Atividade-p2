package br.maua.models;

import br.maua.enumerates.Estado;
import br.maua.enumerates.FormaPagamento;

import java.util.Scanner;

public class Vender {
    public static void run() {
        Scanner num = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Pizzaria o Rato que Ri:  \n 1 - Nova venda\n 2 - Verificar pedidos\n 3 - Alterar pedidos\n 0 - Sair");

        int numero = num.nextInt();


        switch (numero) {
            case 1:
                Pedido pedido = new Pedido();
                Scanner des = new Scanner(System.in);
                System.out.println("Digite a descrição: ");
                String descricao = des.nextLine();
                Scanner val = new Scanner(System.in);
                System.out.println("Digite o valor: ");
                float valor = des.nextFloat();
                Scanner form = new Scanner(System.in);
                System.out.println("Escolha forma de pagamento: \n 1 - Dinheiro\n 2 - Debito\n 3 - Credito\n 4 - Vale Alimentação\n 5- Vale Refeição");
                int numeroForm = num.nextInt();
                switch (numeroForm){
                    case 1:
                        pedido.novaVenda("1",descricao,valor,FormaPagamento.DINHEIRO, Estado.REALIZADO);
                        break;
                    case 2:
                        pedido.novaVenda("1",descricao,valor,FormaPagamento.DEBITO, Estado.REALIZADO);
                        break;
                    case 3:
                        pedido.novaVenda("1",descricao,valor,FormaPagamento.CREDITO, Estado.REALIZADO);
                        break;
                    case 4:
                        pedido.novaVenda("1",descricao,valor,FormaPagamento.VALE_ALIMENTACAO, Estado.REALIZADO);
                        break;
                    case 5:
                        pedido.novaVenda("1",descricao,valor,FormaPagamento.VALE_REFEICAO, Estado.REALIZADO);
                        break;
                }
                break;
            case 2: // caso o número passado for 2
                System.out.println("Numero muito grande");
                break;

            // Como o número passado é 10, nenhum dos cases são executados.
        }

    }
}