/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.cadastroescola;

/**
 *
 * @author laryssa62922516
 */
public class CadastroEscola {

    
    public static void main(String[] args) {

        pessoas aluno = new Aluno("Laryssa");
        pessoas Professor = new Professor("Alessandra");

        aluno.apresentar();
        Professor.apresentar();
    }
}
  
