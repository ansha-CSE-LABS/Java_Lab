import java.awt.*;
import java.awt.event.*;

class Awt extends Frame implements ActionListener{
    TextField t1, t2;
    String s = "";
    Button a , b ;
    Label l;

    public Awt(){

        t1= new TextField();
        setBounds(50,50,200,25);
        t2= new TextField();
        setBounds(50,100,200,25);

        setLayout(new GridLayout());
        a = new Button("A");
        b = new Button("B");
        l = new Label();
        add(t1);
        add(t2);
        add(a);
        add(b);
        add(l);
        setSize(800,800);
        
        a.addActionListener(this);
        b.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
        if(str.equals("A"))
        {
            s = "You pressed A";
        }
        else{
            s = "You pressed B ";
        }
        repaint();

        try{
            String n1 = t1.getText();
            String n2 = t2.getText();
            l.setText("Quotient:"+Integer.parseInt(n1)*Integer.parseInt(n2));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void paint(Graphics g){
        g.drawString(s,20,100);
    }
    public static void main(String[] args){
        Awt appwin = new Awt();
        appwin.setTitle("My App");
        appwin.setVisible(true);
    }
}
