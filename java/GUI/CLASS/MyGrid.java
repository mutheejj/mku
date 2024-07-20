import java.awt.*;
import javax.swing.*;
public class MyGrid{
    JFrame myframe;
    MyGrid(){
        myframe = new JFrame();
        JButton btwone = new JButton("+1");
        JButton btwtwo = new JButton("+2");
        JButton btwthree = new JButton("+3");
        JButton btwfour = new JButton("+4");
        JButton btwfive = new JButton("+5");
        JButton btwsix = new JButton("+6");
        JButton btwseven = new JButton("+7");
        JButton btweight = new JButton("+8");
        JButton btwnine = new JButton("+9");
        myframe.add(btwone);
        myframe.add(btwtwo);
        myframe.add(btwthree);
        myframe.add(btwfour);
        myframe.add(btwfive);
        myframe.add(btwsix);
        myframe.add(btwseven);
        myframe.add(btweight);
        myframe.add(btwnine);

        myframe.setLayout(new GridLayout(3, 3));
        myframe.setSize(500, 500);
        myframe.setVisible(true);

    }
    public static void main(String[] args){
        new MyGrid();
    }
}