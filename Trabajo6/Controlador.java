/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo6;

import javax.swing.*;

import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controlador implements ActionListener {

    Vista f;

    public Controlador() {
        f = new Vista();
        f.setVisible(true);
        f.btnConcatenar.setVisible(true);
        f.btnConcatenar.addActionListener(this);
        f.btnConcatenar.setActionCommand("Concatenar");

        
        
    }

    public void actionPerformed(ActionEvent ae) {
        String t1,t2;
        t1 = (f.txtPalabra1.getText());
        t2 = (f.txtPalabra2.getText());
         f.etiTexto.setText(t1 + t2);

    }

    public static void main(String[] args) {
        Controlador r = new Controlador();
    }
}
