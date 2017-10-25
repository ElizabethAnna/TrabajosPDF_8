/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo3;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;



public class Vista extends JFrame{

    JTextField txtRadio;
    JLabel etiArea, etiPerimetro;

    public Vista() {
        this.setTitle(" Ejercicio3");
        this.setSize(500, 500);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiArea = new JLabel();
        this.getContentPane().add(etiArea, new AbsoluteConstraints(30, 100, 270, 20));
        etiPerimetro = new JLabel();
        this.getContentPane().add(etiPerimetro, new AbsoluteConstraints(30, 150, 270, 20));
  
       
        txtRadio = new JTextField();
        this.getContentPane().add(txtRadio, new AbsoluteConstraints(200, 20, 170, 20));

    }

    public static void main(String[] args) {
        Vista f = new Vista();
        f.setVisible(true);
    }

}
 