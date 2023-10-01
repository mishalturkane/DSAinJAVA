package projtopic.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame7 extends Frame implements ActionListener{
    
    Button  b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    int t=0,sum;
   public  MyFrame7() {
     setTitle("0");
     setBackground(Color.gray);
     setBounds(200,200,400,400);
     b1=new Button("  1");
     b2=new Button("  2");
     b3=new Button("  3");
     b4=new Button("  4");
     b5=new Button("  5") ;
     b6=new Button("  6"); 
     b7=new Button("  7"); 
     b8=new Button("  8"); 
     b9=new Button("  9");
     b10=new Button("  0");
     b11=new Button("        Addition          ");
     b12=new Button("   Subtract    ");
     b13=new Button("   Miltiplly   ");
     b14=new Button("   Division    ");
     b15=new Button("       Clear     ");
     b16=new Button("       Quit        ");
  
     
     FlowLayout fl=new FlowLayout();
     setLayout(fl);
     add(b1);
     add(b2);
     add(b3);
     add(b4);
     add(b5);
     add(b6);
     add(b7);
     add(b8);
     add(b9);
     add(b10);
     add(b11);
     add(b12);
     add(b13); 
     add(b14);
     add(b15);
     add(b16);
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this); 
     b6.addActionListener(this);
     b7.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);      
     b10.addActionListener(this);
     b11.addActionListener(this); 
     b12.addActionListener(this); 
     b13.addActionListener(this); 
     b14.addActionListener(this); 
     b15.addActionListener(this); 
     b16.addActionListener(this); 
     setVisible(true); 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     
        if(e.getSource()==b1){
            sum=sum+1;
            setTitle(sum+"");
        }
        else if(e.getSource()==b2){
            sum=sum+2;
            setTitle(sum+"");
        }
          
        else if(e.getSource()==b11){
          setTitle(sum+"+");
        }
         else if(e.getSource()==b15){
             sum=0;
          setTitle(""+sum);
        }
     if(e.getSource()==b16)
         System.exit(0);
         
    }
}

public class GuiEx11 {

    public static void main(String[] args) {
            MyFrame7 mf=new MyFrame7();
    }
}
