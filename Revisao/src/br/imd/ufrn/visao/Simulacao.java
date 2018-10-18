/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.ufrn.visao;

import br.imd.ufrn.controle.LimiteIdadeException;
import br.imd.ufrn.dominio.Javali;
import br.imd.ufrn.dominio.Onca;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danhfg
 */
public class Simulacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Javali jal = new Javali();
        Onca onc = new Onca();
        
        while(jal.isAlive() && onc.isAlive()){
            try {
                jal.envelhecer(1);
                onc.envelhecer(1);
                
                jal.correr();
                onc.correr();
                if(jal.getVelocidade() < onc.getVelocidade()){
                    jal.morrer();
                }
                else{
                    jal.envelhecer(2);
                    onc.envelhecer(1);
                }
            } catch (LimiteIdadeException ex) {
                if(ex.getMessage().contains("Onca")){
                    onc.morrer();
                }
                else{
                    jal.morrer();
                }
                ex.printStackTrace();
            }
        }
        
        System.out.println("Javali: " + jal.getIdade());
        System.out.println("Onça: "+ onc.getIdade());
    }
    
}
