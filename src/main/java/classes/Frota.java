/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.lang.*;
import java.util.*;

/**
 * Grupo: 
    * Nome - Matrícula:
    * Milles Joseph Magalhães - 20177626
    * Joan Gustavo Melo Fortes – 201435005
    * Guilherme Soares Frias – 201535042
    * João Pedro Sequeto Nascimento – 201776022
 */
public class Frota {
    private List<Veiculo> frota;
    
    public Frota(){
        this.frota = new ArrayList();
    }

    public List<Veiculo> getFrota() {
        return frota;
    }

    public void setFrota(List<Veiculo> frota) {
        this.frota = frota;
    }
    
    public void adicionaVeiculo(Veiculo carro){
        this.frota.add(carro);
    }
}
