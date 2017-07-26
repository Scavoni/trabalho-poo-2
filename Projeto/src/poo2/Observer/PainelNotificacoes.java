/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.Observer;

/**
 *
 * @author jeff
 */
public class PainelNotificacoes implements Observer{
    
    private Subject criatura;
    private String nome;
    private int idade;
    private int fome;
    private int energia;
    private int felicidade;
    public PainelNotificacoes(Subject criatura){
        this.criatura = criatura;
    }
    @Override
    public void atualizar(String nome, int idade, int fome, int energia, int felicidade) {
        this.nome = nome;
        this.idade = idade;
        this.fome = fome;
        this.energia = energia;
        this.felicidade = felicidade;
        //o metodo exibir deve mostrar um quadro no jogo informando o status do animal
        exibir();
        
    }
    public void exibir(){
        System.out.println("Teste pra mostrar que o observer funciona");
        System.out.println("Status: Nome = "+nome+"\n Idade = "+idade+"\n Fome = "+fome+"\nEnergia = "+energia+"\n Felicidade = "+felicidade+"\n");
    }
    
    
}
