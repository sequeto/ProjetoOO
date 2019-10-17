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
public class ClienteJuridico extends Cliente{
    private String cnpj;

    public ClienteJuridico(String nome, String telefone) {
        super(nome, telefone);
    }
}
