import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Insets;
import java.awt.Dimension;

public class BoxDemo{
    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame myframe = new JFrame("BoxLayout along X_AXIS");

        JButton jbtnone, jbtntwo, jbtnthree, jbtnfour, jbtnfive;

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mypanel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(mypanel, BoxLayout.X_AXIS);
        mypanel.setLayout(boxlayout);
        mypanel.setBorder(new EmptyBorder(new Insets(100, 150, 100, 150)));
        jbtnone = new JButton("First button");
        jbtntwo = new JButton("Second button");
        jbtnthree = new JButton("Third button");
        jbtnfour = new JButton("Forth button");
        jbtnfive = new JButton("Fifth button");

        mypanel.add(jbtnone);
        mypanel.add(jbtntwo);
        mypanel.add(jbtnthree);
        mypanel.add(jbtnfour);
        mypanel.add(jbtnfive);
        myframe.add(mypanel);
        myframe.pack();
        myframe.setVisible(true);

    }
}