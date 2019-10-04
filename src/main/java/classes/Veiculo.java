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
 * @author Sequeto
 */
public class Veiculo {
    private String placa;
    private String modelo;
    private String cor;
    private int ano;
    
    public Veiculo(String placa, String modelo, String cor, int ano)
    {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
}
