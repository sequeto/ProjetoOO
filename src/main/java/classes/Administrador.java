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
public class Administrador extends Usuario{

    public Administrador(String nome, String cpf, String login, String senha, String tipo, String identificacao) {
        super(nome, cpf, login, senha, tipo, identificacao);
    }
}
