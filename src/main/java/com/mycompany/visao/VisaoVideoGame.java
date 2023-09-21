/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.modelo.VideoGame;
import java.util.Scanner;

/**
 *
 * @author batista.4995
 */
public class VisaoVideoGame {
    public static VideoGame telaCadastroVideoGame(){
        //Crio o objeto VideoGame e instacio um "videoGame"
        VideoGame videogame = new VideoGame();
        
        System.out.println("==========CADASTRO DE VIDEO GAME==========");
        System.out.println("Nome: ");
        videogame.setNome(new Scanner(System.in).nextLine());
        System.out.println("Preço: ");
        videogame.setPreco(new Scanner(System.in).nextDouble());
        System.out.println("Plataforma: ");
        videogame.setPlataforma(new Scanner(System.in).nextLine());
        System.out.println("==========================================");
    
        return videogame;
    }
}
