/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.controle;

/**
 *
 * @author danhfg
 */
public class PistaException extends Exception {
    
    public PistaException(String message, AcimaVelocidadeException ave){
        super(message, ave);
    }
}
