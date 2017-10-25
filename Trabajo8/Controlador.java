/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo8;

import javax.swing.*;

import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controlador implements ActionListener{
    Vista r;

    public Controlador() {
        r = new Vista();
        r.setVisible(true);
        r.etiResultado.setVisible(true);
        r.txtAx2.addActionListener(this);
        r.txtBx.addActionListener(this);
        r.txtC.addActionListener(this);
        r.txtG.addActionListener(this);
        
    }

    
    public void actionPerformed(ActionEvent ae) {
        
        
    }
    public static void main(String[] args) {
        Controlador r = new Controlador();
    }
}