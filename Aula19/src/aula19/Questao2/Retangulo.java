/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19.Questao2;

/**
 *
 * @author danhfg
 */
public class Retangulo extends Forma{
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }
    
    public float calcularArea(){
        return lado*altura;
    }
    public float calcularPerimetro(){
        return 2*lado + 2*altura;
    }
}
