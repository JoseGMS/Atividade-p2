package br.maua.interfaces;

/** Interface responsavel pelo "contrato" de autenticação de senha, atualmente so é implementada no usuario, mas pode futuramente ser sobrescrita por diversas classes, baseada na hierarquia da pizzaria.
 * @author José Guilherme Martins dos Santos - josegms2000@gmail.com
 * @since 26/06/2020
 * @version 1.o
 */

public interface Autenticar {
        /**
         * @param senha senha que sera sobrescrita
         */
        boolean autentica(int senha);
}
