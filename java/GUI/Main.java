import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter Your Name");

        JOptionPane.showMessageDialog(null, name);
    }
}