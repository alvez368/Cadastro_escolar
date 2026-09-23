/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.cadastroescola;

/**
 *
 * @author laryssa62922516
 */
   
public class Professor extends pessoas {

    public Professor (String nome) {
        super(nome);
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, sou o aluno. Me chamo " + nome);
    }
}

