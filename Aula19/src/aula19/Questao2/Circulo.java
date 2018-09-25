/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19.Questao2;
import java.lang.*;

/**
 *
 * @author danhfg
 */
public class Circulo extends Forma {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }
    
    
    public float calcularArea(){
        return (float) Math.PI * raio * raio;
    }
    
    public float calcularPerimetro(){
        return 2 * (float)Math.PI * raio;
    }
    
}
