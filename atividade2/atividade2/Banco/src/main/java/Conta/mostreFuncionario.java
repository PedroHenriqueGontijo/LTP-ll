/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conta;

/**
 *
 * @author pedro
 */
public class mostreFuncionario {
    public static void main (String args []){
        Funcionario oo = new Funcionario();
       oo.setDataentrada("22/22/2222");
       oo.setDepartamento("RH");
       oo.setRg("123456789");
       oo.setSalario(22222.22);
       oo.setPermanen(true);
        oo.mostra();
        
        
        
    }
    
}
