import java.awt.*;
import java.awt.event.*;
import java.swing.*;

//class extendes Jframe

class BorderLayout extendes JFrame{
    BorderLayoutDemo()
    {
        JPanel pa = JPanel();

        //set layout

        pa.setLayout(new BorderLayout());
        pa.add(new JButton("Button NOrth"), BorderLayout.NORTH);
        pa.add(new JButton("Button NOrth"), BorderLayout.EAST);
        pa.add(new JButton("Button NOrth"), BorderLayout.SOUTH);
        pa.add(new JButton("Button NOrth"), BorderLayout.WEST);
        add(pa);

        //function close the operattion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        setVisible(tue);

    }
}

class MainFrame {
    public static void main(String[] args)
    {
        new BorderLayoutDemo();
    }
}