/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.visao;

import br.ufrn.imd.controle.PistaException;
import br.ufrn.imd.dominio.Pista;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danhfg
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pista pista = new Pista();
        
        try {
            pista.iniciar();
        } catch (PistaException ex) {
            ex.printStackTrace();
        }
        finally{
            System.out.println("That's all folks .......");
        }
        System.out.println("Outra ação");
        
    }
    
}
