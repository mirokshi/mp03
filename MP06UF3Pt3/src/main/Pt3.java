/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.controlador;
import view.vista;


/**
 *
 * @author mirokshi
 */
public class Pt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controlador c = new controlador();
        
//         vista v = new vista();
         c.listBd();
//        c.connectDB("consultes");
//        c.connectCollection("users");

    }
    
}
