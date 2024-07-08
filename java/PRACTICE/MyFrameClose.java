import java.awt.event.*;
import javax.swing.*;

public class MyFrameClose {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Closing Frame with WindowEvent");
        f.setBounds(100, 50, 500, 300);
        f.setVisible(true);
    }
}

class MyFrame extends JFrame {
    public MyFrame() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}