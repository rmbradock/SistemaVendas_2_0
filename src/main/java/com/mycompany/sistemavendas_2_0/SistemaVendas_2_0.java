/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemavendas_2_0;

import com.mycompany.controle.ControleSistema;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoMenu;

/**
 *
 * @author batista.4995
 */
public class SistemaVendas_2_0 {
    public static void main(String[] args) {
        int opcaoMenu;
        
        //nossa condição de saída é fechar o sistema na "mão"
        while (true){
            // coloco a declaração que veio fora do laço de repetição
            //importar VisaoMenu e menuPrincipal
            opcaoMenu = VisaoMenu.menuPricipal();
            
            if(opcaoMenu == Constantes.CADASTRAR){
                ControleSistema.cadastrar();
                
            }else if (opcaoMenu == Constantes.ALTERAR){
                ControleSistema.alterar(VisaoMenu.MenuAlteracaoProduto());
            }else if (opcaoMenu == Constantes.LISTAR){
                ControleSistema.listar(ControleSistema.produtos);
            }else if (opcaoMenu == Constantes.REMOVER){
               
            }
        }
    }
}
