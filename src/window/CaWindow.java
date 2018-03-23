/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;
//Libraries
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 * Class to create the application window 
 * @author sire_marcos
 */
class CaWindow extends JFrame implements ActionListener
{
    //Fields
    private int X = 650;
    private int Y = 200;
    private int W_WIDTH = 1200;
    private int W_HEIGHT = 600;
    
    private Menus menus = new Menus();
    
    /**
     * Window constructor
     */
    CaWindow()
    {
        //Window title and set up
        setTitle("Contrôle Académique");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Insert Menu Bar with menus
        setJMenuBar(menus.createJMenuBar());
        
        
        //Display the window
        setBounds(X, Y, W_WIDTH, W_HEIGHT);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev)
    {
        
    }
    
}





















