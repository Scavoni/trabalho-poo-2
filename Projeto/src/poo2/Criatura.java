/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_de_poo2;
/**
 *
 * @author Vinicius
 */
public class Criatura 
{
    //Os valores de alimentacao, higiene e diversão variam de 0 a 100 e diminuem a saude se forem menos que 0 ou maiores que 100.
    int alimentacao; 
    int higiene; 
    int diversao;
    int saude; // Se chegar a 0 bichinho morre. Varia de 0 a 100.
    int nivel; //Varia de 0 a 100. 100 troca de bichinho. A cada 33 niveis ele muda.
}
