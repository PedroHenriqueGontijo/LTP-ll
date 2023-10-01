/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author pedro
 */
public class Porta {
   String aberta;
   String cor;
   float dimensaoX;
   float dimensaoY;
    float dimensaoZ;
    boolean ff = true;

    public  boolean aberto(){
        return ff = true;
    }
    
    public boolean fechar(){
        return ff = false;
    }
        public String estaaberta(){
            return aberta;
        }
        public void pinta(){
            System.out.println(this.cor);
        }
    
    
    
    
    
}
