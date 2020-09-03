package com.pluhi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorApplet extends Frame implements ActionListener {

    Button red, green, blue, Andrejka, exit;

    public GraphicTableEx() {

        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");
        Andrejka = new Button("Andrejka");
        exit = new Button("Exit");

        setLayout(new FlowLayout());

        add(red);
        add(green);
        add(blue);
        add(Andrejka);
        add(exit);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        Andrejka.addActionListener(this);
        exit.addActionListener(this);

    }

    public static void main(String[] args) {

        GraphicTableEx c = new GraphicTableEx();
        c.setTitle("Andrejka");
        c.setSize(500, 300);
        c.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String clickedButton = e.getActionCommand();
        System.out.println(clickedButton + " clicked");

        if (e.getSource() == red) {
            setBackground(Color.red);

        } else if (e.getSource() == green) {
            setBackground(Color.green);

        } else if (e.getSource() == blue) {
            setBackground(Color.blue);

        } else if (e.getSource() == Andrejka) {
            setTitle("Adrejka is a beautiful girl");

        } else {
            System.exit(0);
        }
    }
}
