import javax.swing.JOptionPane;

public class Exercicio_JOption {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas vindas", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas vindas", JOptionPane.ERROR_MESSAGE);

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número "));
        JOptionPane.showMessageDialog(null, "Você digitou: " + n);
    }
}
