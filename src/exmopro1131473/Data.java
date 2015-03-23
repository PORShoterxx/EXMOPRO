
package exmopro1131473;

import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Data {
    private int ano = GregorianCalendar.getInstance().get(GregorianCalendar.YEAR);
    private int dia = GregorianCalendar.getInstance().get(GregorianCalendar.DATE);
    private int mes = GregorianCalendar.getInstance().get(GregorianCalendar.MONTH)+1;
    
    public Data(){
        ano = 1;
        dia = 1;
        mes = 1;
    }

    public static void printInvShort() {
        JOptionPane.showMessageDialog(null, ano + "/" + mes + "/"+ dia);
    }
    
    public static void printLong() {
        JOptionPane.showMessageDialog(null, dia + " de " + (GregorianCalendar.getInstance().getDisplayName(GregorianCalendar.MONTH, GregorianCalendar.LONG, Locale.getDefault())) +" de "+ ano);
    }
    
    public static void ReadDate() {
        
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

