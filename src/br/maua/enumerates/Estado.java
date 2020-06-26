package br.maua.enumerates;

/**Enum responsavel por guardar 5 estados para os pedidos existentes.
 * @author José Guilherme Martins dos Santos - josegms2000@gmail.com
 * @since 26/06/2020
 * @version 1.0
 */

public enum Estado {
    REALIZADO,
    PREPARACAO,
    SAIU_PARA_ENTREGA,
    ENTREGUE,
    DEVOLVIDO;

    private Estado(){
    }
}
