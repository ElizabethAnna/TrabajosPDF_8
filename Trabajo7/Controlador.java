/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo7;

import javax.swing.*;

import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controlador implements MouseListener, ActionListener  {

    Vista g;

    public Controlador() {
        g = new Vista();
        g.setVisible(true);
        g.btnBorrar.setVisible(true);

        g.txtCero.addMouseListener(this);
        g.txtUno.addMouseListener(this);
        g.txtDos.addMouseListener(this);
        g.txtTres.addMouseListener(this);
        g.txtCuatro.addMouseListener(this);
        g.txtCinco.addMouseListener(this);
        g.txtSeis.addMouseListener(this);
        g.txtSiete.addMouseListener(this);
        g.txtOcho.addMouseListener(this);
        g.txtNueve.addMouseListener(this);
        g.btnBorrar.setActionCommand("Borrar");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String n = " ";
        if (e.getSource() == g.txtCero) {

            n = "0" + n;

        }
        if (e.getSource() == g.txtDos) {

            n = "2" + n;
        }
        if (e.getSource() == g.txtUno) {

            n = "1" + n;
        }
        if (e.getSource() == g.txtTres) {

            n = "3" + n;
        }
        if (e.getSource() == g.txtCuatro) {

            n = "4" + n;
        }
        if (e.getSource() == g.txtCinco) {

            n = "5" + n;
        }
        if (e.getSource() == g.txtSeis) {

            n = "6" + n;
        }
        if (e.getSource() == g.txtSiete) {

            n = "7" + n;
        }
        if (e.getSource() == g.txtOcho) {

            n = "8" + n;
        }
        if (e.getSource() == g.txtNueve) {

            n = "9" + n;
        }
        g.txtNumero.setText("" + n);

    }

    public static void main(String[] args) {
        Controlador r = new Controlador();
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String n=" ";
        
        if (e.getSource() == g.btnBorrar) {
            
             g.txtNumero=null;
        }
    }
}
