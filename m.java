import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class m extends Frame implements ActionListener
{
    
    m()
    {
        TextField t1=new TextField();
         TextField t2=new TextField();
          TextField t3=new TextField();
          Label l1=new Label("enter a");
           Label l2=new Label("enter b");
            Label l3=new Label("enter res");
            l1.setBounds(30,70,100,50);
        t1.setBounds(170,70,200,50);
          l2.setBounds(30,100,100,50);
        t2.setBounds(170,100,200,50);
          l3.setBounds(30,150,100,50);
        t3.setBounds(250,150,200,50);
        Button b1=new Button("+");
        Button b2=new Button("-");
        Button b3=new Button("*");
        Button b4=new Button("%");
        Button b5=new Button("/");
        Button b6=new Button("=");
        b1.setBounds(30,200,20,50);
        b2.setBounds(30,230,20,50);

b3.setBounds(30,260,20,50);

b4.setBounds(30,300,20,50);

b5.setBounds(30,330,20,50);

b6.setBounds(30,360,20,50);

        addWindowListener(this);
        addactionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(t1);
        add(t2);
        add(t3);
        add(l1);
        add(l2);
        add(l3);
        setSize(800,800);
        setVisible(true);
        setLayout(null);
    }
    
    public void actionPerformed(actionEvent e)
    {
        
        t3.setText(t1+t2);
    }
      public void windoeClosing(windowEvent e)
    {
        dispose();
    }
    public static void main(String args[])
    {
        m m1=new m();
    }
}