/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.*;

/**
 *
 * @author Sequeto
 */
public class QuadroClientes {

    /**
     *
     */
    public static List<ClienteFisico>  clientesFis = new ArrayList<>();
    private static List<ClienteJuridico> clientesJur;
    
    public QuadroClientes(){
        
        clientesJur = new ArrayList<>();
    }
    
    // Funções para cadastro de cliente físico
    public void cadastraClienteFisico(ClienteFisico clienteF){
         clientesFis.add(clienteF);
    }
    
    public void excluiClienteFisico(String cpf){
         for(int i = 0; i < clientesFis.size(); i++){
             if(clientesFis.get(i).getCPF().equals(cpf)){
                clientesFis.remove(i);
             }
         }
    }
    
    public void editaClienteFisico(){
        
    }
    
   
    
    // Funções para cadastro de cliente jurídico
    public void cadastraClienteJuridico(ClienteJuridico clienteJ){
         clientesJur.add(clienteJ);
    }
    
    public void excluiClienteJuridico(String cnpj){
         for(int i = 0; i < clientesJur.size(); i++){
             if(clientesJur.get(i).getCNPJ().equals(cnpj)){
                clientesJur.remove(i);
             }
         }
    }
    
    public void editaClienteJuridico(){
        
    }
}
