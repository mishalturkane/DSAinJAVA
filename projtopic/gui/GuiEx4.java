package projtopic.gui;

import java.awt.*;
import java.util.Date;

public class GuiEx4 {
    public static void main(String[] args) {
        Frame f=new Frame();
        Date today=new Date();
     // f.setTitle(today.toString());
     // f.setTitle(today+"");
        f.setTitle(String.valueOf(today));
        f.setBounds(200,200,400,400);
        f.setBackground(Color.red);
        f.setVisible(true);
    }
}
