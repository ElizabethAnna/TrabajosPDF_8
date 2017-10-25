/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo5;

import javax.swing.*;

import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controlador implements KeyListener{

    Vista g;

    public Controlador() {
        g = new Vista();
        g.setVisible(true);
        g.txtNumero.setVisible(true);
        g.txtNumero.addKeyListener(this);

    }

    public void keyReleased(KeyEvent e) {
        double r = 0, z;
        r = Double.parseDouble(g.txtNumero.getText());
        z = Math.sqrt(r);
        g.etiRaiz.setText(" " + z);

    }

    public static void main(String[] args) {
        Controlador r = new Controlador();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    

}
