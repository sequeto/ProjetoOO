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
 * @author ice
 */
public abstract class Usuario {
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private String tipo;
    private String identificacao;
    
    public Usuario(String nome, String cpf, String login, String senha, String tipo, String identificacao){
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
        this.identificacao = identificacao;
    }
    
    // Getters
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getId(){
        return this.identificacao;
    }
    
    //Setters
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public void setSenha(String senha){
        this.senha = senha; 
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setId(String id){
        this.identificacao = id;
    }
}
