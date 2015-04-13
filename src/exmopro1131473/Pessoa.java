
package exmopro1131473;

public class Pessoa {
    
    private String nome;
    private Data dataNasc = new Data(true);
    private int nif = 0;
    
    
    public Pessoa(String new_nome, Data dNasc, int n_nif){
        if (n_nif > 999999999 || n_nif < 0) {
            throw new NumberFormatException("Invalid NIF");
        }
        nome = new_nome;
        dataNasc = dNasc;
        nif = n_nif;
    }
    
    public Pessoa(String new_nome, Data dNasc){
        nome = new_nome;
        dataNasc = dNasc;
    }
    
    public Pessoa(String new_nome){
        nome = new_nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String new_nome){
        nome=new_nome;
    }
    
    public Data getDataNasc(){
        return dataNasc;
    }
    
    public void setDataNasc(Data dNasc){
        dataNasc = dNasc;
    }
    
    public int getNIF(){
        return nif;
    }
    
    public void setNIF(int n_nif){
        nif = n_nif;
    }
    
    @Override
    public String toString(){
        return nome + ": " + dataNasc.outLong() + ": " + String.format("%09d", nif);
    }
            
}
