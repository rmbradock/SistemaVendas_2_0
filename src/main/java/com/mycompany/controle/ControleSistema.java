/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle;

import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoComputador;
import com.mycompany.visao.VisaoMenu;
import com.mycompany.visao.VisaoVideoGame;
import java.util.ArrayList;

/**
 *
 * @author batista.4995
 */
public class ControleSistema {
    //funcionalidade que precisa ser importada, "Objetic" tipo do Array, o mais generico
    public static ArrayList<Object> produtos = new ArrayList<>();
    
    //Criando o metodo "cadastrar"
    //VOID é um metodo vazio, será executado mas não retorna valor, como o RETURN 
    public static void cadastrar(){
        //metodo que está em VisaoMenu
        int opcaoProduto = VisaoMenu.menuEscolhaProduto();
        
        //Se opcao 1, cadastrar os produtos / .add para adicionar na ordem correta - 
        if (opcaoProduto == Constantes.CATEGORIA_VIDEO_GAME){
            produtos.add(VisaoVideoGame.telaCadastroVideoGame());
        }else if(opcaoProduto == Constantes.CATEGORIA_COMPUTADOR){
            produtos.add(VisaoComputador.telaCadastroComputador());
        }
    }
    //Se vamoa alterar algo já existente declara qual produto
    public static void alterar(int indiceProduto){
        //listar os produtos e retirar um pois é baseada no indice a partir do zero
        indiceProduto = indiceProduto - 1;
        
        //Object aceita qualquer tipo double, float, etc
        Object object = produtos.get(indiceProduto);
        
        //Se o object for de uma instancia (tipo) VideoGame, posso converter para VideoGame
        if(object instanceof VideoGame){
            VideoGame videoGame = new VideoGame ();
            //a variavel vidoGame vai receber object, mas eu tenho de informar que é do tipo (VideoGame)
            videoGame = (VideoGame) object;
            
            //Utilizo a variavel toString
            System.out.println("Alterando o produto: " + videoGame.toString());
            
            videoGame = (VideoGame) VisaoMenu.menuAlteracaoProdutoInformacoes(videoGame);
            
            //metodo "set" tem por parametro alterar alguma coisa
            //"produtos" é minha lista de produtos
            //este comando coloca novamente o produto no local original
            ControleSistema.produtos.set(indiceProduto, videoGame);
        }else if(object instanceof Computador){
            Computador computador = new Computador ();
            computador = (Computador) object;
            
            System.out.println("Alterando o produto: " + computador.toString());
            
            computador = (Computador) VisaoMenu.menuAlteracaoProdutoInformacoes(computador);
            
            ControleSistema.produtos.set(indiceProduto, computador);
        }
    }
    public static void listar (ArrayList<Object> produtos){
        //size = leght - variavel ArrayList e não vetor
        System.out.println("=========LISTAGEM DE PRODUTOS=============");
        for(int i = 0 ; i < produtos.size(); i++){
            Object object = produtos.get(i);
            
            if (object instanceof VideoGame){
                VideoGame videoGame = (VideoGame) object;
                System.out.println(videoGame.toString());
            }else if(object instanceof Computador){
                Computador computador = (Computador) object;
                System.out.println(computador.toString());
            }
        }
        System.out.println("==========================================");
    }
}
