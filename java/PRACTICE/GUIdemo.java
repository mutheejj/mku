import java.awt.*;
import javax.swing.*;

public class GUIdemo {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("Student Information Form");
        
        // Specify GridLayout for the layout manager with 4 rows and 2 columns
        frame.setLayout(new GridLayout(4, 2));
        
        // Give the frame an initial size
        frame.setSize(400, 200);
        
        // Terminate the program when the user closes the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create JLabels and JTextFields for student information
        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameField = new JTextField(20);
        
        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField(20);
        
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(3);
        
        JButton submitButton = new JButton("Submit");

        // Add the labels and text fields to the frame
        frame.add(firstNameLabel);
        frame.add(firstNameField);
        frame.add(lastNameLabel);
        frame.add(lastNameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(new JLabel("")); // Empty label for spacing
        frame.add(submitButton);
        
        // Display the frame
        frame.setVisible(true);
    }
}
