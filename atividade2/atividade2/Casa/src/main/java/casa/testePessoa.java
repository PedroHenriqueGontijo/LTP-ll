/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class testePessoa {
   public static void main (String [] args)
    {
        Pessoa pe = new Pessoa();
      Scanner scan = new Scanner(System.in);
       
        System.out.println("digite seu nome:");
        pe.nome=scan.next();
        System.out.println("digite a idade");
       pe.idade = scan.nextInt();
       pe.fazAniersario();
       pe.fazAniersario();
       pe.fazAniersario();
       pe.fazAniersario();
        System.out.println(pe.nome + "acrecentando 4 anos ele terá " + pe.fazAniersario() + 
                " anos de didade");
      
       
       
        
        
    }
}
