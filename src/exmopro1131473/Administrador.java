
package exmopro1131473;

public class Administrador extends Trabalhador {
    
    private float ajudasDeCusto;
    
    public Administrador(String nome, Data dNasc, int n_nif, float sal, int cod, float irs, float adc){
        super(nome, dNasc, n_nif, sal, cod, irs);
        ajudasDeCusto = adc;
    }
    
    public float calcularSalario(){
        return super.GetSalario()*super.GetIRS()+ajudasDeCusto;
    }
}
