/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo6;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame{

    JTextField txtPalabra1, txtPalabra2;
    JLabel etiTexto;
    JButton btnConcatenar;

    public Vista() {
        this.setTitle(" Ejercicio1");
        this.setSize(500, 500);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiTexto = new JLabel();
        this.getContentPane().add(etiTexto, new AbsoluteConstraints(30, 100, 170, 20));
        
        btnConcatenar = new JButton("Concatenar");
        this.getContentPane().add(btnConcatenar, new AbsoluteConstraints(230, 100, 170, 20));

        txtPalabra1 = new JTextField();
        this.getContentPane().add(txtPalabra1, new AbsoluteConstraints(10, 20, 170, 20));
        txtPalabra2 = new JTextField();
        this.getContentPane().add(txtPalabra2, new AbsoluteConstraints(230, 20, 170, 20));

    }

    public static void main(String[] args) {
        Vista f = new Vista();
        f.setVisible(true);
    }

}
