import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

public class CardLayout extendes JFrame implements ActionListener{
    CardLayout mycard;
    JButton btnone, btntwo, btnthree;

    Container mycontainer;
    cardlayout(){
        mycontainer = getcontentpane();
        mycard = new CardLayout(40, 30);


    mycontainer.setlayout(mycard);
    btnone = new JButton("First card");

    btntwo = new JButton("Second Card");

    btnthree = new JButton("third card");

    btnone.addActionListener(this);
    btntwo.addActionListener(this);
    btnthree.addActionListener(this);

    mycontainer.add("1", btnone);
    mycontainer.add("2", btntwo);
    mycontainer.add("3", btnthree);

    public void actionPerformed(ActionEvent e)
    {
        mycard.next(mycontainer);
    }

    public static void main(String[] args){
        CardLayout cd1 = new CardLayout();

        cdl.setSize(400, 400);

        cdl.setDefaultCloseOperation(EXIT_ON_CLOSE)
    }

    }
}