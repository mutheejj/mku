import javax.swing.*;

public class DialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        // Message dialog
        JOptionPane.showMessageDialog(frame, "This is a message dialog.");
        
        // Input dialog
        String input = JOptionPane.showInputDialog(frame, "Enter your name:");
        
        // Confirmation dialog
        int choice = JOptionPane.showConfirmDialog(frame, "Do you want to continue?");
        
        System.out.println("User input: " + input);
        System.out.println("User choice: " + (choice == JOptionPane.YES_OPTION ? "Yes" : "No"));
    }
}
