
package Conta;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Funcionario {
    private String nome;
    private String rg;
    private String departamento;
    private Double salario;
    private String dataentrada;
    private boolean permanen = true;
    public void mostra () {
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("O salario é de: " + this.salario);
        System.out.println("Com a bonificação o salario fica: " + this.bonificacao(60));
        System.out.println("Dada de entrada do funcionario: " + this.dataentrada);
        System.out.println("Seu departamento é: " + this.departamento);
        System.out.println("RG:" + this.rg);
        System.out.println("Permanencia do empregado:" + this.permanen);
        System.out.println("Demitir trabalhador caso esteja trabalhando:" + this.demite());
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(String dataentrada) {
        this.dataentrada = dataentrada;
    }

    public boolean isPermanen() {
        return permanen;
    }

    public void setPermanen(boolean permanen) {
        this.permanen = permanen;
    }
    Scanner sc = new Scanner (System.in);
    public void seusalario(Double salario){
        salario = sc.nextDouble();
    }
    public double bonificacao (int aumento){
    return salario+aumento;
    }
    public boolean demite(){
        return permanen = false;
    }
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
