package projtopic.gui;

import java.awt.*;
import java.util.Date;

class MyFrame extends Frame {
    public MyFrame(String title, Color c, int w, int h, boolean s) {
        super(title);
        setBounds(200, 200, w, h);
        setBackground(c);
        setVisible(s);
    }
}
public class GuiEx5 {

    public static void main(String[] args) {
            MyFrame fr1=new MyFrame("Mishal's Frame",Color.pink,400,400,true);
            MyFrame fr2=new MyFrame("Pratima's Frame",Color.gray,300,300,true);
    }
}
