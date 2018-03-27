/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;
//Libraries
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 * Class to create the application window 
 * @author sire_marcos
 */
class CaWindow extends JFrame
{
    //Fields
    private int W_WIDTH = 1200;
    private int W_HEIGHT = 600;
    
    private Menus menus = new Menus();
    private JScrollPane gradesTable = new GradesTable();
    /**
     * Window constructor
     */
    CaWindow()
    {
        //Window title and set up
        setTitle("Contrôle Académique");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //Insert Menu Bar with menus
        add(menus, BorderLayout.NORTH);
        //setJMenuBar(menus);
        //Add gradeTable
        add(gradesTable, BorderLayout.CENTER);
        //Display the window
        setSize(W_WIDTH, W_HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
}





















