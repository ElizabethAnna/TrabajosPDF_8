/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo4;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
public class Vista extends JFrame{
    JTextField txtBase, txtExponente;
    JLabel etiResultado;

    public Vista() {
        this.setTitle(" Ejercicio1");
        this.setSize(500, 500);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(50, 100, 270, 20));
        txtBase = new JTextField();
        this.getContentPane().add(txtBase, new AbsoluteConstraints(30, 30, 170, 20));
        

        txtExponente = new JTextField();
        this.getContentPane().add(txtExponente, new AbsoluteConstraints(250, 30, 170, 20));
       
    }

    public static void main(String[] args) {
        Vista r = new Vista();
        r.setVisible(true);
    }
}
    