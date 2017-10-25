/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Controlador implements ActionListener {

    Vista g;

    public Controlador() {
        g = new Vista();
        g.setVisible(true);
        g.btnCalcular.setVisible(true);
        g.btnCalcular.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        double uno = 0, dos = 0, tres = 0;
        double media = 0;
        uno = Double.parseDouble(g.txtPrimertrimestre.getText());
        dos = Double.parseDouble(g.txtSegundotrimestre.getText());
        tres = Double.parseDouble(g.txtPrimertrimestre.getText());
        media = (uno + dos + tres) / 3;
        if (media<5){
            g.etiResultado.setText(  "Suspenso ");
            g.etiNotafinal.setText(media + " ");
            
            g.etiNotafinal.setForeground(Color.red); 
            g.etiResultado.setForeground(Color.red); 
        }else if(media>=5){
            g.etiResultado.setText(  "Aprobado ");
            g.etiNotafinal.setText(media + " ");
        }
       
         
       
    }

    public static void main(String[] args) {
        Controlador r = new Controlador();
    }
}
