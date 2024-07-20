//importing the class of JOptionPane of packege swing
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: "); //decllare an sring to hold the users name 

        JOptionPane.showMessageDialog(null, "Welcome " + name + " to our system");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));// same to age 

        JOptionPane.showMessageDialog(null, "you are " + age + "Years old");// displaying the out put
        
    }
    
}
