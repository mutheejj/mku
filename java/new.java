import java.awt.event.*;
import javax.swing.*;
public class MyFrameclose2 {
    public static void mai n(string[] a) {
        MyFrame f = new MyFrame();
        f.setTitle("closing Frame with process window Event");
        f.setBounds(100,50,500,300);
        setVisible(true);
    }
}
static class MyFrame extends JFrame {
    protected void processWindowEvent(windowEvent e) {
        if (e.getID() == WindowEvent)
    }
}