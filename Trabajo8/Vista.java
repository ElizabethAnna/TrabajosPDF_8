/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo8;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
public class Vista extends JFrame{
     JTextField txtAx2,txtBx,txtC,txtG;
    JLabel etiResultado,etiA,etiB,etiC,etiG;

    public Vista() {
        this.setTitle(" Ejercicio1");
        this.setSize(500, 500);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(100, 270, 270, 30));
        txtAx2 = new JTextField();
        this.getContentPane().add(txtAx2, new AbsoluteConstraints(30, 100, 70, 20));
        txtBx = new JTextField();
        this.getContentPane().add(txtBx, new AbsoluteConstraints(30, 140, 70, 20));
        txtC = new JTextField();
        this.getContentPane().add(txtC, new AbsoluteConstraints(30, 190, 70, 20));
        
        txtG = new JTextField();
        this.getContentPane().add(txtG, new AbsoluteConstraints(30, 230, 70, 20));
        
        
        etiA = new JLabel("AX2");
        this.getContentPane().add(etiA, new AbsoluteConstraints(150, 100, 70, 20));
        etiB = new JLabel("Bx");
        this.getContentPane().add(etiB, new AbsoluteConstraints(150, 140, 70, 20));
        etiC = new JLabel("C");
        this.getContentPane().add(etiC, new AbsoluteConstraints(150, 190, 70, 20));
        
        etiG = new JLabel("=");
        this.getContentPane().add(etiG, new AbsoluteConstraints(150, 230, 70, 20));
       
    }

    public static void main(String[] args) {
        Vista r = new Vista();
        r.setVisible(true);
    }
}
