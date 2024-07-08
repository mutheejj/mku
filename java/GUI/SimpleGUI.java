import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Hello, World!");

        panel.add(button);
        panel.add(label);
        frame.add(panel);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}