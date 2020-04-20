package com.zetcode;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Colors extends Frame implements WindowListener {
    public Colors() {
        super("Colors example");
        setSize(320, 200);
        setBackground(new Color(192, 192, 192));
        addWindowListener(this);
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void paint(Graphics g) {
        Rectangle r = getBounds();
        g.setColor(new Color(255, 255, 255)); //white
        g.fillRect(20, 40, 50, 50);
        g.setColor(new Color(0, 0, 0, 255)); //black
        g.fillRect(100, 40, 50, 50);
        g.setColor(new Color(255, 0, 0)); //red
        g.fillRect(180, 40, 50, 50);
        g.setColor(new Color(0, 255, 0)); //green
        g.fillRect(260, 40, 50, 50);
        g.setColor(new Color(0, 0, 255)); //blue
        g.fillRect(20, 120, 50, 50);
        g.setColor(new Color(0, 255, 255)); //turquoise
        g.fillRect(100, 120, 50, 50);
        g.setColor(new Color(255, 255, 0)); //yellow
        g.fillRect(180, 120, 50, 50);
        g.setColor(new Color(255, 0, 255)); //magenta
        g.fillRect(260, 120, 50, 50);

    }

    public static void main(String[] args) {
        Colors mw = new Colors();
        mw.setVisible(true);

    }

}
