
package exmopro1131473;

public class Retangulo {
    
    private int base;
    private int altura;
    
    public Retangulo(int l, int h){
        base = l;
        altura = h;
    }
    
    public Retangulo(int l)
    {
        base = l;
        altura = l;
    }
    
    public Retangulo()
    {
        base = 1;
        altura = 1;
    }
    
    public boolean IsSquare()
    {
        return base==altura;
    }
    
    public int GetArea()
    {
        return base*altura;
    }
    
    public int GetPerimetro()
    {
        return base*2+altura*2;
    }
    
    public int GetBase()
    {
        return base;
    }
    
    public int GetAltura()
    {
        return altura;
    }
    
    public void SetBase(int l)
    {
        base = l;
    }
    
    public void SetAltura(int l)
    {
        altura = l;
    }
    
    @Override
    public String toString()
    {
        return "Base: " + base + "\nAltura: " + altura;
    }

}
