/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogo;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class Jogo {
    public static void main(String[] args) {

        // Tela inicial
        System.out.println("BEM-VINDO AO SHOW DO Javão!");
        System.out.println("Responda com 'sim' para começar ou 'não' para sair.");
        
        String comecar = sc.nextLine();
        
        if (!comecar.equalsIgnoreCase("sim")) {
            System.out.println("Então vamos começar!");
        }else {
            System.out.println("Tá bem, até a próxima!");
            return;
        }
}
}