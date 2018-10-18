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
public abstract class Animal {
    private boolean alive;

    public Animal() {
        this.alive = true;
    }

    public void morrer(){
        alive = false;
    }
    
    public abstract int alimentar();
    
    public abstract void envelhecer(int env) throws LimiteIdadeException;
    
    public abstract void correr();
    
    public boolean isAlive() {
        return alive;
    }
    
}
