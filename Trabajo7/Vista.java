/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo7;


import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame{

    JLabel txtUno, txtDos, txtTres, txtCuatro, txtCinco, txtSeis, txtSiete, txtOcho, txtNueve, txtCero;
    JTextField txtNumero;
    JButton btnBorrar;

    public Vista() {
        this.setTitle(" Ejercicio1");
        this.setSize(500, 900);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtUno = new JLabel("1");
        this.getContentPane().add(txtUno, new AbsoluteConstraints(30, 100, 70, 20));
        txtDos = new JLabel("2");
        this.getContentPane().add(txtDos, new AbsoluteConstraints(30, 140, 70, 20));
        txtTres = new JLabel("3");
        this.getContentPane().add(txtTres, new AbsoluteConstraints(30, 190, 70, 20));
        
        txtCuatro = new JLabel("4");
        this.getContentPane().add(txtCuatro, new AbsoluteConstraints(30, 230, 70, 20));
        txtCinco = new JLabel("5");
        this.getContentPane().add(txtCinco, new AbsoluteConstraints(30, 270, 70, 20));
        txtSeis = new JLabel("6");
        this.getContentPane().add(txtSeis, new AbsoluteConstraints(30, 310, 70, 20));
        
        txtSiete = new JLabel("7");
        this.getContentPane().add(txtSiete, new AbsoluteConstraints(30, 350, 70, 20));
        txtOcho = new JLabel("8");
        this.getContentPane().add(txtOcho, new AbsoluteConstraints(30, 390, 70, 20));
        txtNueve = new JLabel("9");
        this.getContentPane().add(txtNueve, new AbsoluteConstraints(30, 430, 70, 20));
         txtCero = new JLabel("0");
        this.getContentPane().add(txtCero, new AbsoluteConstraints(30, 60, 70, 20));
        btnBorrar = new JButton("Borrar");
        this.getContentPane().add(btnBorrar, new AbsoluteConstraints(230, 20, 170, 20));

        
        txtNumero = new JTextField();
        this.getContentPane().add(txtNumero, new AbsoluteConstraints(30, 20, 170, 20));

    }

    public static void main(String[] args) {
        Vista f = new Vista();
        f.setVisible(true);
    }

}
