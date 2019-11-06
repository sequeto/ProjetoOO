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
public class ClienteJuridico extends Cliente{
    private String cnpj;

    public ClienteJuridico(String nome, String telefone, String cnpj) {
        super(nome, telefone);
        this.cnpj = cnpj;
    }
    
    public String getCNPJ(){
        return this.cnpj;
    }
    
    public void setCNPJ(String cnpj){
        this.cnpj = cnpj;
    }
}
