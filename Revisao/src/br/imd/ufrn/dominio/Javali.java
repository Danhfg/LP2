/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.ufrn.dominio;

import br.imd.ufrn.controle.LimiteIdadeException;
import java.util.Random;

/**
 *
 * @author danhfg
 */
public class Javali extends Animal {
    private static final int MAX_IDADE = 10;
    private int idade;
    private int velocidade;

    public Javali() {
        this.idade = 0;
    }

    @Override
    public int alimentar() {
        Random rand = new Random();
        return rand.nextInt(7)+1;
    }

    @Override
    public void envelhecer(int env) throws LimiteIdadeException{
        idade += env;
        if (idade > MAX_IDADE ){
            throw new LimiteIdadeException("Javali excedeu sua idade máxima!!");
        }
    }

    @Override
    public void correr() {
        int alimento = alimentar();
        if(idade >= 3 && idade <= 8 ){
            velocidade = alimento*idade;
        }
        else{
            velocidade = alimento;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getIdade() {
        return idade;
    }
    
    
}
