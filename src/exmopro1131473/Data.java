
package exmopro1131473;

import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
//UPDATE FFS

public class Data {
    private int ano = GregorianCalendar.getInstance().get(GregorianCalendar.YEAR);
    private int dia = GregorianCalendar.getInstance().get(GregorianCalendar.DATE);
    private int mes = GregorianCalendar.getInstance().get(GregorianCalendar.MONTH);
    
    
    public Data(boolean today){
        if (today){
            ano = GregorianCalendar.getInstance().get(GregorianCalendar.YEAR);
            dia = GregorianCalendar.getInstance().get(GregorianCalendar.DATE);
            mes = GregorianCalendar.getInstance().get(GregorianCalendar.MONTH)+1;
        }else{
            ano = 1;
            dia = 1;
            mes = 1;
        }
    }
    
    public Data(int d, int m, int a){

            ano = a;
            dia = d;
            mes = m;
    }

    public void printInvShort() {
        JOptionPane.showMessageDialog(null, ano + "/" + mes + "/"+ dia);
    }
    
    public void printLong() {
        JOptionPane.showMessageDialog(null, dia + " de " + (GregorianCalendar.getInstance().getDisplayName(GregorianCalendar.MONTH, GregorianCalendar.LONG, Locale.getDefault())) +" de "+ ano);
    }
    
    public String outLong() {
        return dia + " de " + (GregorianCalendar.getInstance().getDisplayName(mes, GregorianCalendar.LONG, Locale.getDefault())) +" de "+ ano;
    }
    
    public void ReadDate() {

        
        int temp_dia;
        int temp_mes;
        int temp_ano;
        
        try{
            temp_dia = Integer.parseInt(JOptionPane.showInputDialog("Introduza o dia do mês:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Número inválido.");
            return;
        } catch (NullPointerException e) {
            return;
        }
        
        try{
            temp_mes = Integer.parseInt(JOptionPane.showInputDialog("Introduza o mês:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Número inválido.");
            return;
        } catch (NullPointerException e) {
            return;
        }
        
        try{
            temp_ano = Integer.parseInt(JOptionPane.showInputDialog("Introduza o ano:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Número inválido.");
            return;
        } catch (NullPointerException e) {
            return;
        }
        
        dia = temp_dia;
        mes = temp_mes;
        ano = temp_ano;
    }
    
}

