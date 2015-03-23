
package exmopro1131473;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;

public class EXMOPRO1131473 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Goodbye, cruel world!");
        Data.printLong();
    }
}
class Data {

    static int ano = GregorianCalendar.getInstance().get(GregorianCalendar.YEAR);
    static int dia = GregorianCalendar.getInstance().get(GregorianCalendar.DATE);
    static int mes = GregorianCalendar.getInstance().get(GregorianCalendar.MONTH);
    
    static void printInvShort() {
        JOptionPane.showMessageDialog(null,Data.ano + "/" + Data.mes + "/"+ Data.dia);
    }
    
    static void printLong() {
        JOptionPane.showMessageDialog(null,Data.dia + " de " + (GregorianCalendar.getInstance().getDisplayName(GregorianCalendar.MONTH, GregorianCalendar.LONG, Locale.getDefault())) +" de "+ Data.ano);
    }
    
    static void ReadDate() {
        
        try{
            dia = Integer.parseInt(JOptionPane.showInputDialog("Introduza o dia do mês:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Número inválido.");
        } catch (NullPointerException e) {
            return;
        }
        
        try{
            mes = Integer.parseInt(JOptionPane.showInputDialog("Introduza o mês:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Número inválido.");
        } catch (NullPointerException e) {
            return;
        }
        
        try{
            ano = Integer.parseInt(JOptionPane.showInputDialog("Introduza o ano:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Número inválido.");
        } catch (NullPointerException e) {
        }
    }
    
}
