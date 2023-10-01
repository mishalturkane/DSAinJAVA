package projtopic.gui;

import java.awt.*;

class MyFrame2 extends Frame{
   public  MyFrame2() {
     setTitle("Mishal's Frame");
     setBackground(Color.pink);
     setBounds(200,200,400,400);
     Button b1=new Button("Login");
     Button b2=new Button("Quit");
     FlowLayout fl=new FlowLayout();
     setLayout(fl);
     add(b1);
     add(b2);
      setVisible(true);
    }
}
public class GuiEx6 {

    public static void main(String[] args) {
            MyFrame2 fr1=new MyFrame2();
    }
}
