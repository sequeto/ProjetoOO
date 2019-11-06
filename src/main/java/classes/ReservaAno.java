/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author ice
 */
public class ReservaAno extends Reserva{
    
    public ReservaAno(ClienteFisico cliente, int periodo, Veiculo veiculo, double valor) {
        super(cliente, periodo, veiculo, valor);
    }
    
    public ReservaAno(ClienteJuridico cliente, int periodo, Veiculo veiculo, double valor) {
        super(cliente, periodo, veiculo, valor);
    }
}
