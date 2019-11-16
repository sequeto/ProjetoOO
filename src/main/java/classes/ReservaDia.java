/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * Grupo: 
    * Nome - Matrícula:
    * Milles Joseph Magalhães - 20177626
    * Joan Gustavo Melo Fortes – 201435005
    * Guilherme Soares Frias – 201535042
    * João Pedro Sequeto Nascimento – 201776022
 */
public class ReservaDia extends Reserva{

    public ReservaDia() {
    }
        
    
    
    public ReservaDia(ClienteFisico cliente, int periodo, Veiculo veiculo, double valor) {
        super(cliente, periodo, veiculo, valor);
    }
    
    public ReservaDia(ClienteJuridico cliente, int periodo, Veiculo veiculo, double valor) {
        super(cliente, periodo, veiculo, valor);
    }
    
    @Override
    public double calculaValor(){
        double valor = this.getPeriodo() * this.getValor();
        this.setValor(valor);
        return valor;
    }
    
}
