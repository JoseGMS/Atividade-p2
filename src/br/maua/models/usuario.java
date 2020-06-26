package br.maua.models;

import br.maua.interfaces.Autenticar;

/**
 * Classe onde ocorre a definição de usuario, como a pizzaria ainda não possui diferenciação de funcionarios por herenças, todos estão alocados aqui
 * @author José Guilherme Martins dos Santos - josegms2000@gmail.com
 * @since 26/06/2020
 * @version 1.o
 */

public class usuario implements Autenticar {
    /**
     * senha para acesso de nova venda e altereção de pedido
     */
    private int senha = 1234;
    /**
     * Nome cadastrado como usuario.
     */
    private String nome = "Clebinho";
    /**
     * Email cadastrado como usuario.
     */
    private String email = "clebinhopizza@ratoqueri.com.br";

    /**função sobrescrita para autenticação da senha.
     * @param senha paremetro recebido para autenticação de senha
     * @return retorna se a senha é correta ou não.
     */
    @Override
    public boolean autentica(int senha) {
        if(this.senha != senha){
        return false;
        }
        return true;
    }
}
