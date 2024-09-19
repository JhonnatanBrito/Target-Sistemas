import javax.swing.JOptionPane;
// count = contador ( podendor ser substituido um pelo outro).
public class CountA {
	   public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite uma string:");
        
        int count = contaQtdLetraA(input);
        JOptionPane.showMessageDialog(null, "A letra 'a' aparece " + count + " vezes na string.");
    }


	
    public int contaQtdLetraA(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }

 
}