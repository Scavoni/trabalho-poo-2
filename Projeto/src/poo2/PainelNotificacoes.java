/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author jeff
 */
public class PainelNotificacoes implements Observer{
    
    private Subject criatura;
    private String nome;
    private int nivel;
    private int fome;
    private int saude;
    private int felicidade;
    private int higiene;
    
    public PainelNotificacoes(Subject criatura){
        this.criatura = criatura;
        this.criatura.registrarObservador(this);
    }
    
    @Override
    public void atualizar(String nome, int nivel, int fome, int saude, int felicidade, int higiene) {
        this.nome = nome;
        this.nivel = nivel;
        this.fome = fome;
        this.saude = saude;
        this.felicidade = felicidade;
        this.higiene = higiene;
        
    }
    /*
    public void exibir(){
        System.out.println("Teste pra mostrar que o observer funciona");
        System.out.println("Status: Nome = "+nome+"\n Idade = "+idade+"\n Fome = "+fome+"\nEnergia = "+energia+"\n Felicidade = "+felicidade+"\n");
    }
    */
    
}
