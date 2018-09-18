/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foxes_and_rabbits;

/**
 *
 * @author danhfg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Simulator sim = new Simulator();
        sim.simulate(500);
        sim.reset();
        sim.simulate(500);
        //sim.runLongSimulation();
 
    }
    
}
