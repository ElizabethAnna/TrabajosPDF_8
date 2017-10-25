/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo4;

import javax.swing.*;

import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controlador implements ActionListener {

    Vista r;

    public Controlador() {
        r = new Vista();
        r.setVisible(true);
        r.txtBase.setVisible(true);
        r.txtBase.addActionListener(this);

        r.txtExponente.setVisible(true);
        r.txtExponente.addActionListener(this);
        

    }

    public void actionPerformed(ActionEvent ae) {
        double b = 0, e = 0;
        b = Double.parseDouble(r.txtBase.getText());
        e = Double.parseDouble(r.txtExponente.getText());
        r.etiResultado.setText(" " + Math.pow(b, e));

    }

    public static void main(String[] args) {
        Controlador r = new Controlador();
    }
}
