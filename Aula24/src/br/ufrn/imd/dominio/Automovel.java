/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.dominio;

import br.ufrn.imd.controle.AcimaVelocidadeException;

/**
 *
 * @author danhfg
 */
public class Automovel {
    
    private static final int VELOCIDADE_MAX = 120;
    private int velocidadeAtual;

    public Automovel() {
        this.velocidadeAtual = 0;
    }
    
    public void acelerar(int velocidade) throws AcimaVelocidadeException{
        if (velocidadeAtual + velocidade > VELOCIDADE_MAX){
            throw new AcimaVelocidadeException("Excedeu a VELOCIDADE MÁXIMA");
        }
    }
}
