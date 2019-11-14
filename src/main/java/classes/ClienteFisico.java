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
public class ClienteFisico extends Cliente{
     private String cpf;

    public ClienteFisico(String nome, String telefone, String cpf) {
        super(nome, telefone);
        this.cpf = cpf;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
}
