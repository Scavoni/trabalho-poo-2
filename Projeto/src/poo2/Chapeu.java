/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author Rafael
 */
public class Chapeu extends AdicionalAcessorio{
    Acessorio acessorio;
    String visualChapeu; //Mais tarde vai ser a imagem do acessorio

    public void setVisualChapeu(String visualChapeu) {
        this.visualChapeu = visualChapeu;
    }
    
    public Chapeu(Acessorio acessorio){
        this.acessorio = acessorio;
    }
    
    public String getVisual() {
        return this.acessorio.getVisual() + this.visualChapeu;
    }
}
