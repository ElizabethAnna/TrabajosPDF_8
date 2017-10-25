/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo5;

import javax.swing.JFrame;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JTextField txtNumero;
    JLabel etiRaiz;

    public Vista() {
        this.setTitle(" Ejercicio1");
        this.setSize(500, 500);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiRaiz = new JLabel();
        this.getContentPane().add(etiRaiz, new AbsoluteConstraints(30, 100, 270, 20));
        

        txtNumero = new JTextField();
        this.getContentPane().add(txtNumero, new AbsoluteConstraints(10, 20, 170, 20));
       
    }

    public static void main(String[] args) {
        Vista g = new Vista();
        g.setVisible(true);
    }

}