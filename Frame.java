package com.company;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Frame extends JFrame implements ActionListener {
    private Container container;
    private JLabel title;
    private JLabel firstName;
    private JLabel age;
    private JTextField textAge;
    private JTextField textName;
    private JLabel lastName;
    private JTextField textLast;
    private JLabel optiune;
    private JLabel optiune1;
    private JLabel optiune2;
    private JRadioButton op1;
    private JRadioButton op2;
    private JRadioButton op3;
    private JRadioButton opt1;
    private JRadioButton opt2;
    private JRadioButton opt3;
    private JRadioButton optn1;
    private JRadioButton optn2;
    private JRadioButton optn3;
    private ButtonGroup genButton;
    private JLabel address;
    private JTextArea textAddress;
    private JCheckBox married;
    private JButton save;
    private JLabel reset;

    public Frame()

    {
        setTitle("-QUESTIONS-");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        title = new JLabel("-QUESTIONS-");
        title.setFont(new Font("Colibri", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        container.add(title);

        optiune = new JLabel("1+2?");
        optiune.setFont(new Font("Arial", Font.PLAIN, 20));
        optiune.setSize(80, 20);
        optiune.setLocation(80, 100);
        container.add(optiune);

        op1 = new JRadioButton("5");
        op1.setFont(new Font("Arial", Font.PLAIN, 15));
        op1.setSelected(true);
        op1.setSize(75, 20);
        op1.setLocation(90, 130);
        container.add(op1);

        op2 = new JRadioButton("3");
        op2.setFont(new Font("Arial", Font.PLAIN, 15));
        op2.setSelected(false);
        op2.setSize(80, 20);
        op2.setLocation(90, 160);
        container.add(op2);

        op3 = new JRadioButton("2");
        op3.setFont(new Font("Arial", Font.PLAIN, 15));
        op3.setSelected(false);
        op3.setSize(85, 20);
        op3.setLocation(90, 190);
        container.add(op3);

        genButton = new ButtonGroup();
        genButton.add(op1);
        genButton.add(op2);
        genButton.add(op3);

        optiune1 = new JLabel("6/2?");
        optiune1.setFont(new Font("Arial", Font.PLAIN, 20));
        optiune1.setSize(150, 20);
        optiune1.setLocation(80, 220);
        container.add(optiune1);

        opt1 = new JRadioButton("3");
        opt1.setFont(new Font("Arial", Font.PLAIN, 15));
        opt1.setSelected(true);
        opt1.setSize(150, 20);
        opt1.setLocation(80, 250);
        container.add(opt1);

        opt2 = new JRadioButton("0");
        opt2.setFont(new Font("Arial", Font.PLAIN, 15));
        opt2.setSelected(false);
        opt2.setSize(150, 20);
        opt2.setLocation(80, 280);
        container.add(opt2);

        opt3 = new JRadioButton("1");
        opt3.setFont(new Font("Arial", Font.PLAIN, 15));
        opt3.setSelected(false);
        opt3.setSize(150, 20);
        opt3.setLocation(80, 310);
        container.add(opt3);

        genButton = new ButtonGroup();
        genButton.add(opt1);
        genButton.add(opt2);
        genButton.add(opt3);

        optiune2 = new JLabel("4*4?");
        optiune2.setFont(new Font("Arial", Font.PLAIN, 20));
        optiune2.setSize(150, 20);
        optiune2.setLocation(80, 340);
        container.add(optiune2);

        optn1 = new JRadioButton("12");
        optn1.setFont(new Font("Arial", Font.PLAIN, 15));
        optn1.setSelected(true);
        optn1.setSize(150, 20);
        optn1.setLocation(80, 360);
        container.add(optn1);

        optn2 = new JRadioButton("10");
        optn2.setFont(new Font("Arial", Font.PLAIN, 15));
        optn2.setSelected(false);
        optn2.setSize(150, 20);
        optn2.setLocation(80, 390);
        container.add(optn2);

        optn3 = new JRadioButton("16");
        optn3.setFont(new Font("Arial", Font.PLAIN, 15));
        optn3.setSelected(false);
        optn3.setSize(150, 20);
        optn3.setLocation(80, 420);
        container.add(optn3);

        genButton = new ButtonGroup();
        genButton.add(optn1);
        genButton.add(optn2);
        genButton.add(optn3);

        save = new JButton("Save");
        save.setFont(new Font("Arial", Font.PLAIN, 15));
        save.setSize(200, 30);
        save.setLocation(80, 500);
        save.addActionListener(this);
        container.add(save);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int contor=0;
        if (actionEvent.getSource() == save) {
            String data1;
            if (op2.isSelected()) {
                data1 = "1.Correct!" + "\n";
                contor++;
            }
            else
                data1 = "1.Incorect!" + "\n";

            String data2;
            if (opt1.isSelected()){
                data2 = "2.Correct" + "\n";
                contor++;}
            else
                data2 = "2.Incorect" + "\n";

            String data3;
            if (optn3.isSelected()){
                data3 = "3.Correct" + "\n";
                contor++;}
            else
                data3 = "3.Incorect" + "\n";

            String rezultat="rezultat:" +contor;


            container.removeAll();
            container.revalidate();
            container.repaint();

            reset = new JLabel(data1);
            reset.setFont(new Font("Colibri", Font.PLAIN, 20));
            reset.setSize(190, 30);
            reset.setLocation(90, 190);
            container.add(reset);

            reset = new JLabel(data2);
            reset.setFont(new Font("Colibri", Font.PLAIN, 20));
            reset.setSize(190, 30);
            reset.setLocation(90, 230);
            container.add(reset);

            reset = new JLabel(data3);
            reset.setFont(new Font("Colibri", Font.PLAIN, 20));
            reset.setSize(190, 30);
            reset.setLocation(90, 270);
            container.add(reset);

            reset = new JLabel(rezultat);
            reset.setFont(new Font("Colibri", Font.PLAIN, 20));
            reset.setSize(190, 30);
            reset.setLocation(90, 300);
            container.add(reset);


            setVisible(true);
        }
    }
}