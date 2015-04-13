
package exmopro1131473;
import javax.swing.JOptionPane;

public class EXMOPRO1131473 {

    public static void main(String[] args) {
        Pessoa teste1 = new Pessoa("Nuno Nunes",new Data(3,12,1), 5749);
        JOptionPane.showMessageDialog(null, teste1.toString());
    }
}
