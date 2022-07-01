/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativpooanimais;

/**
 *
 * @author professor
 */
public class Animais {
    private float peso;
    private char sexo;
    private String cor;

    public Animais(){
        
    }
    
    public Animais(float peso, char sexo, String cor) {
        this.peso = peso;
        this.sexo = sexo;
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}


