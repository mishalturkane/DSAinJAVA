package projtopic.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame4 extends Frame implements ActionListener{
    Button b1,b2;
   public  MyFrame4() {
     setTitle("Mishal's Frame");
     setBackground(Color.pink);
     setBounds(200,200,400,400);
      b1=new Button("Quit");
      b2=new Button("change colour");
     FlowLayout fl=new FlowLayout();
     setLayout(fl);
     add(b1);
     add(b2);
  
     b1.addActionListener(this);
     
     b2.addActionListener(this);
     setVisible(true); 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     
        if(e.getSource()==b1){
            System.exit(0);
        }
        else
            setBackground(Color.red);
         }
}

public class GuiEx8 {

    public static void main(String[] args) {
            MyFrame4 fr1=new MyFrame4();
    }
}
