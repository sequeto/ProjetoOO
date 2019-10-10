/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.lang.*;
import java.util.*;

/**
 *
 * @author Sequeto
 */
public class Cliente {
    private String nome;
    private String telefone;
    private String cpf;
    public  static int reservas;
    
    public Cliente(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        reservas = 0;
    } 
    
    public void reserva()
    {
        this.reservas = this.reservas + 1;
    }

    public String getNome(){
        return this->nome;
    }

    public String getTelefone(){
        return this->telefone;
    }

    public String getCpf(){
        return this->cpf;
    }

    public int getReservas(){
        return this->reservas;
    }
}
