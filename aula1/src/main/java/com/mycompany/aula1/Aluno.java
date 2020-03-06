/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1;

/**
 *
 * @author silva
 */
public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public void Aluno (double nota1, double nota2, double nota3, double nota4){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    
    public double mediaAritmetica (){
        return nota1 + nota2 + nota3 + nota4 / 4;
    }
}
