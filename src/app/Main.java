/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import gui.MainASYS;
import gui.Introduction;
import gui.FourierSeries;
import javax.swing.JFrame;

/**
 *
 * @author xeon
 */
public class Main {
    
    public JFrame mainASYS;
    public JFrame introduction;
    public JFrame fourierSeries;
    public JFrame fourierTransform;
    public JFrame discreteSystem;
    
    public Main() {
        mainASYS = new MainASYS(this);
        //complexNumbersASYS = new ComplexNumbersASYS(this);
        //realGraphASYS = new RealGraphASYS(this);
        
    }
    
    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    mainASYS.setVisible(true);
                }
            });
    }
    public static void main(String[] args) {
                new Main().run();
        
    }
}
