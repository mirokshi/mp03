/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt7;

import controller.controlador;
import java.io.IOException;
import model.modelo;
import view.vista;

/**
 *
 * @author mirokshi
 */
public class Pt7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         vista v=new vista();
        try {
            // TODO code application logic here
            modelo m=new modelo();
            controlador c=new controlador(m,v);
            v.setVisible(true);
        } catch (IOException|ClassNotFoundException ex) {
            v.showMessage("Error al llegir les dades.");
            System.exit(0);
        } 
    }
    }
    

