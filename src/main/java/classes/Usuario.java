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
public class Usuario {
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private String Tipo;
    private String identificacao;
    
    public Usuario(String nome, String cpf, String login, String senha, String tipo, String identificacao){
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.Tipo = tipo;
        this.identificacao = identificacao;
    }
    
    
}
