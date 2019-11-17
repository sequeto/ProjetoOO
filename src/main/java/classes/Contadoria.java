/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import java.util.*;

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
    public static ArrayList<Double> credito  = new ArrayList<>();;
    public static ArrayList<Double> debito  = new ArrayList<>();;
    public static ArrayList<Double> caixa  = new ArrayList<>();;

    public Contadoria() {

        
        
    }
    
    public static void movimentoDeCaixa(double valor) {
        if(valor < 0){
            debito.add(valor);
            caixa.add(valor);}
        else{
            credito.add(valor);
            caixa.add(valor);}
        }    
    
    
    public static double gerarRelatorio() {
        double valor = 0;
        for (int i = 0; i < caixa.size(); i++) {
            valor = valor + caixa.get(i);
            
        }
        return valor;
        
        
    }}
    

    // Getters e Setters

