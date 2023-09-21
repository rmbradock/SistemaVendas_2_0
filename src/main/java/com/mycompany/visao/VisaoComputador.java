/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.modelo.Computador;
import java.util.Scanner;

/**
 *
 * @author batista.4995
 */
public class VisaoComputador {
    public static Computador telaCadastroComputador(){
        //Instanciar um objeto do tipo computador
        Computador computador = new Computador();
        
        System.out.println("==========CADASTRO DE COMPUTADOR==========");
        //Se no menu estamos mandando o nome a propriedade em baixo é nome
        System.out.println("Nome: ");
        computador.setNome(new Scanner(System.in).nextLine());
        System.out.println("Preço: ");
        computador.setPreco(new Scanner(System.in).nextDouble());
        System.out.println("Memoria Ram");
        computador.setMemoriaRam(new Scanner(System.in).nextDouble());
        System.out.println("Processador");
        computador.setProcessador(new Scanner(System.in).nextLine());
        System.out.println("==========================================");
        
        //retornar nosso objeto = computador
        return computador;
    }
}
