/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author batista.4995
 */
//Faço Computador herdar as propriedades de Produto
public class Computador extends Produto{
    private Double memoriaRam;
    private String processador;

    //Alt + Insert "Construtor" é a primeira classe que utilizo 
    public Computador() {
    }

    public Double getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    
    //Alt + Inset + "to String" = pega os valores que estao em nossas propriedades e mostra em um valor só
    // super = quando quero pegar a propriedade que estou herdando
    //this utiliza uma propriedade desta classe
    @Override
    public String toString() {
        return  "Nome: " + super.getNome() + 
                " | Preço: " + super.getPreco() + 
                " | Memória Ram: " + this.memoriaRam + 
                " | Processador: " + this.processador;
    }
}