/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import java.util.Scanner;

/**
 *
 * @author batista.4995
 */
public class VisaoMenu {
    public static int menuPricipal(){
    System.out.println("==========Sistema de Vendas 2.0==========");
    System.out.println("1 - Cadastrar produto");
    System.out.println("2 - Alterar produto");
    System.out.println("3 - Remover produto");
    System.out.println("4 - Listar produtos");
    System.out.println("=========================================");
    //Desta forma estamos instanciando e utilizando o Scanner
    int opcaoMenu = new Scanner(System.in).nextInt();
    
    //após declarar a opcao será devolvida para onde for chamado
    return opcaoMenu;
    }
    public static int menuEscolhaProduto(){
        System.out.println("==========CADASTRAR PRODUTO==========");
        System.out.println("Qual categoria de produto deseja cadastrar?");
        System.out.println("1 - Video Game");
        System.out.println("2 - Computador");
        System.out.println("=====================================");
        int opcaoProduto = new Scanner(System.in).nextInt();
        
        //Valor que será retornado pelo método - 
        return opcaoProduto;
    }
    public static int MenuAlteracaoProduto(){
        System.out.println("==========ALTERAR PRODUTO==========");
        System.out.println("Qual categoria de produto deseja Alterar?");
        
        //produtos size = leght
        for (int i = 0; i< ControleSistema.produtos.size(); i++){
            //Colocamos i + 1 pois o Arraylista começa por zero, se colocar o i começa a listar o produto zero
            //+1 so para garantir que a listagem comece com "1"
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
        }
        System.out.println("=====================================");
        int produtoAlterar = new Scanner(System.in).nextInt();
        
        return produtoAlterar;
    }
    public static Object menuAlteracaoProdutoInformacoes(Object object){
        System.out.println("==========ALTERAÇÃO DE PRODUTO==========");
        if (object instanceof VideoGame){
            System.out.println("Novo nome: ");
            //escrever "object." selecionar setNome / set metodo que utilizo para ter acesso ao parametro "nome"
            ((VideoGame) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((VideoGame) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova plataforma: ");
            ((VideoGame) object).setPlataforma(new Scanner(System.in).nextLine());
            
        }else if(object instanceof Computador){
            System.out.println("Novo nome: ");
            //escrever "object." selecionar setNome / set metodo que utilizo para ter acesso ao parametro "nome"
            ((Computador) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((Computador) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova quantidade de memoria RAM: ");
            ((Computador) object).setMemoriaRam(new Scanner(System.in).nextDouble());
            System.out.println("Novo Processador: ");
            ((Computador) object).setProcessador(new Scanner(System.in).nextLine());
        }
        System.out.println("==========================================");
    return object;
    }
    public static int menuRemocaoProduto(){
        System.out.println("==========REMOVER PRODUTO==========");
        System.out.println("Qual produto deseja remover?");
        
        for (int i = 0; i > ControleSistema.produtos.size() ; i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
        }
        System.out.println("=====================================");
        int produtoRemover = new Scanner(System.in).nextInt();
        
        return produtoRemover;
    }
}