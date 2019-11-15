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
    private static List<Administrador> administradores;
    
    public QuadroFuncionarios(){
        funcionarios = new ArrayList<>();
        administradores = new ArrayList<>();
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
    
    
    public void cadastraAdmin(Administrador admin){
        administradores.add(admin);
    }
    
    public void excluiAdmin(String id){
         for(int i = 0; i < administradores.size(); i++){
             if(administradores.get(i).getId().equals(id)){
                administradores.remove(i);
             }
         }
    }
    
    public void editaAdministradpr(){
        
    }
}
