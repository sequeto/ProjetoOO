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
public abstract class Cliente {
    private String nome;
    private String telefone;
    public  static int reservas;
    
    public Cliente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        reservas = 0;
    } 
    
    public void reserva()
    {
        this.reservas = this.reservas + 1;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public int getReservas(){
        return this.reservas;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
