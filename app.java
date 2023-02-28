/* Equipe: 
    Caio Passos
    Alessandra Lima 
    Arthur Silva
 * 
 */
import javax.swing.JOptionPane;

public class app {
    public static void main(String[] args) {
        operacao opera = new operacao();
        String f = ""; // JOptionpane só recebe input em string, então é importante converter
        Integer n = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the number to be used in your calculator", "Simple calc", 1));
        Integer p = Integer.parseInt(JOptionPane.showInputDialog(null, "1-Add \n 2- Subtraction \n 3-Multiply \n 4- Divide", "Simple calc", 1));

        for (Integer r = 1; r <= 10; r++) {
            switch (p) {
                case 1:
                    f += r + "º:  " + opera.Add(n, r) + "\n"; //a cada iteração o código acumula o valor de R
                    break;
                case 2:
                    f += r + "º:  " + opera.Subtraction(n, r) + "\n";
                    break;
                case 3:
                    f += r + "º:  " + opera.Multiply(n, r) + "\n";
                    break;
                case 4:
                    f += r + "º:  " + opera.Divide(n, r) + "\n"; //
                    break;
            }
        }
        
        
        
        JOptionPane.showMessageDialog(null, "The result is: \n" + f);
    }
}
