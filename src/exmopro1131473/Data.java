
package exmopro1131473;

import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Data {
    private static int ano = GregorianCalendar.getInstance().get(GregorianCalendar.YEAR);
    private static int dia = GregorianCalendar.getInstance().get(GregorianCalendar.DATE);
    private static int mes = GregorianCalendar.getInstance().get(GregorianCalendar.MONTH);
    
    static void printInvShort() {
        JOptionPane.showMessageDialog(null,Data.ano + "/" + Data.mes + "/"+ Data.dia);
    }
    
    static void printLong() {
        JOptionPane.showMessageDialog(null,Data.dia + " de " + (GregorianCalendar.getInstance().getDisplayName(GregorianCalendar.MONTH, GregorianCalendar.LONG, Locale.getDefault())) +" de "+ Data.ano);
    }
    
    static void ReadDate() {
        
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

