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

// Classe que controla valores do sistema.
public class Contadoria {
    private double valorCaixaInicial;
    private double valorCaixaFinal;
    private double lucro;
    private double prejuizo;
    
    public Contadoria(){
        this.valorCaixaInicial = 0;
        this.valorCaixaFinal = 0;
        this.lucro = 0;
        this.prejuizo = 0;
    }

    // Getters e Setters
    public double getValorCaixaInicial() {
        return valorCaixaInicial;
    }

    public void setValorCaixaInicial(double valorCaixaInicial) {
        this.valorCaixaInicial = valorCaixaInicial;
    }

    public double getValorCaixaFinal() {
        return valorCaixaFinal;
    }

    public void setValorCaixaFinal(double valorCaixaFinal) {
        this.valorCaixaFinal = valorCaixaFinal;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getPrejuizo() {
        return prejuizo;
    }

    public void setPrejuizo(double prejuizo) {
        this.prejuizo = prejuizo;
    }
    
    
}
