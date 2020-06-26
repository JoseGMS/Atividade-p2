package br.maua.models;

import br.maua.interfaces.Autenticar;

public class usuario implements Autenticar {
    private int senha = 1234;
    private String nome = "Clebinho";
    private String email = "clebinhopizza@ratoqueri.com.br"

    @Override
    public boolean autentica(int senha) {
        if(this.senha != senha){
        return false;
        }
        return true;
    }
}
