
package exmopro1131473;

public class Trabalhador extends Pessoa {
    
    private float salario;
    private int codigo;
    private float irs;
    
    /*
    public Trabalhador(String nome){
            super(nome);
    }
    
    public Trabalhador(String nome, Data dNasc){
            super(nome, dNasc);
    }
    
    public Trabalhador(String nome, Data dNasc, int n_nif){
            super(nome, dNasc, n_nif);
    }
    
    public Trabalhador(String nome, Data dNasc, int n_nif, float sal){
            super(nome, dNasc, n_nif);
            salario = sal;
    }
    
    public Trabalhador(String nome, Data dNasc, int n_nif, float sal, int cod){
            super(nome, dNasc, n_nif);
            salario = sal;
            codigo = cod;
    }*/
    
    public Trabalhador(String nome, Data dNasc, int n_nif, float sal, int cod, float new_irs){
            super(nome, dNasc, n_nif);
            salario = sal;
            codigo = cod;
            irs = new_irs;
    }
    
    public float calcularSalario(){
        return salario*irs;
    }
    
    public float GetSalario(){
        return salario;
    }
    
    public int GetCodigo(){
        return codigo;
    }
    
    public float GetIRS(){
        return irs;
    }
    
    public void SetSalario(float sal){
        salario = sal;
    }
    
    public void SetCodigo(int cod){
        codigo = cod;
    }
    
    public void SetIRS(float new_irs){
         irs = new_irs;
    }
}
