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
public class QuadroFuncionarios {
    private static List<Funcionario> funcionarios;
    
    public QuadroFuncionarios(){
        funcionarios = new ArrayList<>();
    }
    
    public void cadastraFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public void excluiFuncionario(String id){
         for(int i = 0; i < funcionarios.size(); i++){
             if(funcionarios.get(i).getId().equals(id)){
                funcionarios.remove(i);
             }
         }
    }
    
    public void editaFuncionario(){
        
    }
}
