/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo3;

import java.awt.Color;
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
        f.txtRadio.setVisible(true);
        f.txtRadio.addActionListener((ActionListener) this);

    }

    public void actionPerformed(ActionEvent ae) {
        double r;
        double p = 0, a = 0;
        r = Double.parseDouble(f.txtRadio.getText());
        a = Math.floor((r * r) * Math.PI);
        p = Math.floor((r + r) * Math.PI);
        if (r <= 0) {
            f.etiArea.setText("ERROR " );
            f.etiPerimetro.setText("ERROR " );
            f.etiArea.setForeground(Color.red);
            f.etiPerimetro.setForeground(Color.red);
        } else if (r > 0) {
            f.etiArea.setText(" " + a);
            f.etiPerimetro.setText(" " + p);
        }

    }

    public static void main(String[] args) {
        Controlador r = new Controlador();
    }
}
