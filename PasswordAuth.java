package com.zetcode;

import javax.swing.*;

public class PasswordAuth {

    public static void main(String[] args) {

        String user = JOptionPane.showInputDialog("User:");
        String password = JOptionPane.showInputDialog("Password:");

        if (user != null && password != null && (user.equals("john") &&
                password.equals("swordfish")) ||
                (user.equals("bella") && password.equals("apple"))
        )
        {
            JOptionPane.showMessageDialog(null, "Access granted!");
        } else {
            JOptionPane.showMessageDialog(null, "Access denied!");
        }
    }
}
