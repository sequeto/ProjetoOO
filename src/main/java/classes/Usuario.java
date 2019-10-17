/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author ice
 */
public class Usuario {
    private String login;
    private String senha;
    private String Tipo;
    
    public Usuario(String login, String senha, String tipo){
        this.login = login;
        this.senha = senha;
        this.Tipo = tipo;
    }
}
