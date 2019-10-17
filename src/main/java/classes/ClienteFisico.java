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
public class ClienteFisico extends Cliente{
     private String cpf;

    public ClienteFisico(String nome, String telefone, String cpf) {
        super(nome, telefone);
        this.cpf = cpf;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
}