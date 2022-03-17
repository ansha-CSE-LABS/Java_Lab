import java.awt.*;
import java.awt.event.*;

class DialogBox extends Dialog implements ActionListener {
    Division div;

    DialogBox(Frame parent, String title)
    {
        super(parent,title,false);
        div=(Division)parent;
        setLayout(new FlowLayout());
        setSize(250,100);
        add(new Label(div.msg));
        Button b;
        add(b=new Button("Okay"));
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        dispose();
    }
}

public class Division extends Frame implements ActionListener
{
    String msg = "";
    String msg1="";
    TextField n1,n2,res;
    Button b;
    String n3;
    Label result = new Label("Result:",Label.RIGHT);

    public Division()
    {
        setLayout(new FlowLayout());
        Label num1 = new Label("Number 1: ", Label.RIGHT);
        Label num2 = new Label("Number 2: ", Label.RIGHT);
        Label result = new Label("Result:",Label.RIGHT);
        Button div = new Button("Divide");
        n1 = new TextField(10);
        n2 = new TextField(10);
        res = new TextField(35);

        add(num1);
        add(n1);
        add(num2);
        add(n2);
        b= (Button)add(div);
        add(result);
        add(res);
    
        n1.addActionListener(this);
        n2.addActionListener(this);
        b.addActionListener(this);
        res.addActionListener(this);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
    });
}
public void actionPerformed(ActionEvent ae)
{
    String s=ae.getActionCommand();
    if(s.equals("Divide"))
    {
        res.setText(divide());
    }
}
String divide()
{
    int n;
    int x1,x2;
    try {
        x1=Integer.parseInt(n1.getText());
        x2=Integer.parseInt(n2.getText());
        try{
            n=x1/x2;
            n3=String.valueOf(n);
            return n3;
        }
        catch(ArithmeticException e)
        {
            msg="Cannot divide number1 by 0";
            DialogBox d= new DialogBox(this,"Exception message box");
            d.setVisible(true);
            return "";
        }
    }
    catch(NumberFormatException nf)
    {
        msg="The input numbers should be integers";
        DialogBox d=new DialogBox(this,"Exception message box");
        d.setVisible(true);
        return "";
    }
    
}
public static void main(String[] args)
{
    Division appwin = new Division();
    appwin.setSize(new Dimension(380,180));
    appwin.setTitle("Division");
    appwin.setVisible(true);
}
}
