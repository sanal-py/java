import java.awt.*;
import java.awt.event.*;

class FindMax1 extends Frame implements ActionListener {

    Label l1 = new Label("Enter first num");
    Label l2 = new Label("Enter second num");
    Label l3 = new Label("Enter third num");
    Label l4 = new Label("Result");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField();

    Button b1 = new Button("Max");
    Button b2 = new Button("Cancel");

    FindMax1() {

        setLayout(null);

        t4.setEditable(false);

        l1.setBounds(50, 100, 120, 20);
        l2.setBounds(50, 140, 120, 20);
        l3.setBounds(50, 180, 120, 20);
        l4.setBounds(50, 220, 120, 20);

        t1.setBounds(200, 100, 100, 20);
        t2.setBounds(200, 140, 100, 20);
        t3.setBounds(200, 180, 100, 20);
        t4.setBounds(200, 220, 100, 20);

        b1.setBounds(50, 260, 80, 30);
        b2.setBounds(150, 260, 80, 30);

        b1.setBackground(Color.yellow);
        b2.setBackground(Color.green);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3 = Integer.parseInt(t3.getText()); // fixed

            int result;

            if (n1 > n2 && n1 > n3)
                result = n1;
            else if (n2 > n1 && n2 > n3)
                result = n2;
            else
                result = n3;

            t4.setText(String.valueOf(result));
        }

        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        }
    }

    public static void main(String[] args) {
        new FindMax1();
    }
}