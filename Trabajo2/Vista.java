/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo2;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {
    JTextField txtPrimertrimestre, txtSegundotrimestre,txtTercertrimestre;
    JLabel etiNotafinal, etiResultado;
    JButton btnCalcular;
    
    public Vista() {
        this.setTitle(" Ejercicio1");
        this.setSize(500, 500);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        etiNotafinal = new JLabel();
        this.getContentPane().add(etiNotafinal, new AbsoluteConstraints(10, 10, 170, 20));
         etiResultado = new JLabel(); 
        this.getContentPane().add( etiResultado, new AbsoluteConstraints(190, 10, 170, 20));
        txtPrimertrimestre = new JTextField();
        this.getContentPane().add(txtPrimertrimestre, new AbsoluteConstraints(30, 50, 170, 20));
        txtSegundotrimestre = new JTextField();
        this.getContentPane().add(txtSegundotrimestre, new AbsoluteConstraints(30, 80, 170, 20));
        txtTercertrimestre = new JTextField();
        this.getContentPane().add(txtTercertrimestre, new AbsoluteConstraints(30, 120, 170, 20));
        

         
        btnCalcular= new JButton("Calcular"); 
        this.getContentPane().add( btnCalcular, new AbsoluteConstraints(210, 60, 100, 20));
        
    }
    
    public static void main(String[] args) {
        Vista g = new Vista();
        g.setVisible(true);
    }
}


