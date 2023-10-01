package projtopic.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame6 extends Frame implements ActionListener{
    
    Button  b1,b2,b3,b4;
    int t=0;
   public  MyFrame6() {
     setTitle("0");
     setBackground(Color.gray);
     setBounds(200,200,400,400);
     b1=new Button("Increment");
     b2=new Button("Decrement");
     b3=new Button("Quit");
  
     
     FlowLayout fl=new FlowLayout();
     setLayout(fl);
     add(b1);
     add(b2);
     add(b3);
     
 
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
   
     setVisible(true); 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     
      if(e.getSource()==b1){
          t++;
          setTitle(""+t);
      }
      else if(e.getSource()==b2){
          t--;
          setTitle(""+t);
      }
        
        else 
             System.exit(0);
         
    }
}

public class GuiEx10 {

    public static void main(String[] args) {
            MyFrame6 mf=new MyFrame6();
    }
}
