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
public abstract class Reserva {
    private ClienteFisico clienteFis;
    private ClienteJuridico clienteJur;
    private int periodo;
    private Veiculo veiculo;
    private double valor;
    
    
        public Reserva(ClienteFisico cliente, int periodo, Veiculo veiculo, double valor){
            this.clienteFis = cliente;
            this.periodo = periodo;
            this.veiculo = veiculo;
            this.valor = valor;
        }
        
        public Reserva(ClienteJuridico cliente, int periodo, Veiculo veiculo, double valor){
            this.clienteJur = cliente;
            this.periodo = periodo;
            this.veiculo = veiculo;
            this.valor = valor;
        }

        // Getters e Setters
        public ClienteFisico getClienteFis() {
            return clienteFis;
        }

        public void setClienteFis(ClienteFisico clienteFis) {
            this.clienteFis = clienteFis;
        }

        public ClienteJuridico getClienteJur() {
            return clienteJur;
        }

        public void setClienteJur(ClienteJuridico clienteJur) {
            this.clienteJur = clienteJur;
        }

        public int getPeriodo() {
            return periodo;
        }

        public void setPeriodo(int periodo) {
            this.periodo = periodo;
        }

        public Veiculo getVeiculo() {
            return veiculo;
        }

        public void setVeiculo(Veiculo veiculo) {
            this.veiculo = veiculo;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
        
       
}
