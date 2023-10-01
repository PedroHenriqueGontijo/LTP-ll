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
public class testePortaCasa {
    public static void main (String [] args ){
        Porta por = new Porta();
        Scanner scan = new Scanner (System.in);
        System.out.println("dimensao x:");
        por.dimensaoX = scan.nextFloat();
        System.out.println("dimensao y:");
        por.dimensaoY = scan.nextFloat();
        System.out.println("dimensao z:");
        por.dimensaoZ = scan.nextFloat();
        System.out.println("cor que deseja pintar:");
        
        
    }
}
