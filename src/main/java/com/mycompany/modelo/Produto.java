/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author batista.4995
 */
public class Produto {
    //declaro propriedade que é privada e declaro uma variável 
    private String nome;
    private Double preco;
    
    //Alt + insert "Generate"

    public Produto() {
    }
    // Alt + Insert "Getter e Setter"
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}