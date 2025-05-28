/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jogo;

import java.util.Scanner;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Tela inicial
        System.out.println("BEM-VINDO AO SHOW DO Javão!");
        System.out.println("Responda com 'sim' para começar ou 'não' para sair.");
        
        String comecar = sc.nextLine();
        
        if (comecar.equalsIgnoreCase("sim")) {
            System.out.println("Então vamos começar!");
        }else {
            System.out.println("Tá bem, até a próxima!");
            return;
        }

        String[][] perguntas = {
            {"O que é Java?", "A) Um sistema operacional desenvolvido pela Microsoft", "B) Um editor de texto usado para programar", "C) Uma linguagem de programação orientada a objetos", "D) Um software de planilhas", "C"},
            {"O que é a JVM?", "A) Um servidor web para aplicações Java", "B) Um compilador de código Java", "C) Um banco de dados relacional","D) Uma máquina virtual que executa bytecode Java","D"},
            {"Qual das opções abaixo representa a forma correta de declarar um array de inteiros em Java?", "A) int array[] = new int(5);", "B) int array[5];", "C) int[] array = new int[5];", "D) array int = new int[5];", "C"},
            {"O que são classes e objetos em Java?", "A) Classe é um programa inteiro e objeto é uma variável", "B) Classe é um molde e objeto é uma instância dessa classe", "C) Classe é uma estrutura de dados e objeto é um método", "D) Classe é uma exceção e objeto é um erro", "B"},
            {"O que é encapsulamento?", "A) Proteger os arquivos com senha", "B) Esconder detalhes internos de uma classe e controlar acesso com métodos", "C) Executar múltiplos programas ao mesmo tempo", "D) Criar interfaces gráficas no código Java", "B"},
            {"Qual a diferença entre == e .equals() em Java?", "A) Nenhuma, ambos comparam o conteúdo dos objetos", "B) == compara valores, .equals() compara tipos", "C) == compara referências de memória, .equals() compara o conteúdo", "D) == é usado apenas em números, .equals() apenas em strings", "C"},
            {"O que é herança em Java?", "A) O processo de salvar arquivos no computador", "B) Uma forma de compartilhar arquivos entre classes", "C) Um tipo especial de variável", "D) Quando uma classe herda atributos e métodos de outra classe", "D"},
            {"D) Quando uma classe herda atributos e métodos de outra classe", "A) Classes que só podem ser usadas para entrada e saída de dados", "B) Classes abstratas obrigatórias em todo programa Java", "C) Contratos que definem métodos que uma classe deve implementar", "D) Programas de rede utilizados em Java"},
            {"O que são exceções em Java?", "A) Erros que ocorrem durante a execução e podem ser tratados", "B) Tipos de variáveis com valor indefinido", "C) Funções especiais para repetição de código", "D) Comandos usados para encerrar o programa", "A"},
            {"O que é polimorfismo em Java?", "A) A capacidade de armazenar múltiplos arquivos em um só", "B) A possibilidade de executar múltiplos sistemas operacionais", "C) Quando objetos de diferentes classes se comportam como se fossem da mesma superclasse", "D) Um comando que encerra o programa abruptamente", "C"}
        };
        
        int pontuacao = 0;
//        boolean jogador = true;
        
        
        // Tela final
        System.out.println("\n FIM DE JOGO!");
        System.out.println("Total de perguntas respondidas: " + Math.min(pontuacao / 10, perguntas.length));
        System.out.println("Pontuacao final: " + pontuacao + " pontos");
        
        System.out.println("Gostaria de saber sua classificacao? Digite 'Sim' para saber ou 'Nao' para sair");
        
        String classificacao = sc.nextLine();
        
        if (classificacao.equalsIgnoreCase("sim")) {
            System.out.println("Carregando sua pontuacao!");
        }else {
            System.out.println("Ate a proxima!");
            return;
        }
        
        if (pontuacao >= 80) {
            System.out.println("Voce foi excelente! Parabens!");
        } else if (pontuacao >= 50) {
            System.out.println("Voce foi bem!");
        } else {
            System.out.println("Voce nao foi tao bem, quem sabe na proxima!");
        } return;
        
    }
}