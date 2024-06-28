import java.awt.event.*;
import javax.swing.*;

public class MyFrameClose3 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Closing Frame with WindowListener");
        f.setBounds(100, 50, 500, 300);
        f.setVisible(true);
    }
}

class MyFrame extends JFrame {
    public MyFrame() {
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Close the application when the frame is closed
            }

            @Override
            public void windowClosed(WindowEvent e) {}

            @Override
            public void windowIconified(WindowEvent e) {}

            @Override
            public void windowDeiconified(WindowEvent e) {}

            @Override
            public void windowActivated(WindowEvent e) {}

            @Override
            public void windowDeactivated(WindowEvent e) {}
        });
    }
}
