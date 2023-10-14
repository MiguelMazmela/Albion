/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ventanas;

import Variables.Var;
import javax.swing.JFrame;

/**
 *
 * @author miguel
 */
public class Albion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Var v= new Var();
        v.conectar();
        System.out.println("Sistem Operativo : "+v.getsSistemaOperativo());
        System.out.println("Path : "+v.getCaminoCompletoBD());
        System.out.println("conectado : "+v.isConectado());
        Inicio p=new Inicio(v);
        p.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        p.setTitle("Principal");
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLocationRelativeTo(null);
        p.setVisible(true);
//        Inicio in=new Inicio();
//        in.setVisible(true);
    }
    
}
