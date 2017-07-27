    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class Criatura implements Subject
{
    //Os valores de alimentacao, higiene e diversão variam de 0 a 100 e diminuem a saude se forem menos que 0 ou maiores que 100.
    public static int higiene; 
    int saude; // Se chegar a 0 bichinho morre. Varia de 0 a 100.
    int nivel; //Varia de 0 a 100. 100 troca de bichinho. A cada 33 niveis ele muda.
    String nome;
    int idade=  0;
    public static int fome = 0;
    public static int felicidade = 0;
    
    public void Alimentar(Alimento al)  
    {
        al.Alimentar();
    }
    
    FasesDaVida faseatual;
    
    
    
    public void setFase(FasesDaVida fase) 
    {
        this.faseatual = fase;
    }
    
    public void subirDeFase(){
        setFase(this.faseatual.subirDeFase());
    }
    
    public void cairDeFase(){
        setFase(this.faseatual.cairDeFase());
    }
    
    public static final int IDADE_CRIANCA = 17;
    public static final int IDADE_ADULTA = 48;
    public static final int IDADE_IDOSA = 100;
    
    public static final int NIVEL_QUER_COMER = 14;
    public static final int NIVEL_PRECISA_COMER = 28;
    
    public static final int ENERGIA_QUER_DORMIR = 150;
    public static final int ENERGIA_CANSADO = 64;
    public static final int ENERGIA_ANIMADO = 8;
    
    /*
    public void realizaCiclo(){
        fome++;
        energia--;
        idade++; 
        if(fome<NIVEL_PRECISA_COMER&&energia<ENERGIA_QUER_DORMIR)
            felicidade++;
        notificarObservador();
    } 

    */
    public ArrayList<Observer> observadores;

    @Override
    public void registrarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        int i = observadores.indexOf(o);
        if(i>=0){
            observadores.remove(o);
        }
    }

    @Override
    public void notificarObservador() {
        for(int i=0; i < observadores.size();i++){
            Observer obs = (Observer) observadores.get(i);
            obs.atualizar(nome, nivel, fome, saude, felicidade, higiene);
        }
    }
    
    
    
    
}
