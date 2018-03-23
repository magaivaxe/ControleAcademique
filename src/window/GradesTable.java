/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author sire_marcos
 */
class GradesTable extends JPanel
{
    //Fields
    private boolean DEBUG = false;
    //Objects
    JTable gradesJTable;

    GradesTable()
    {
        //Constructor of JPanel
        super(new GridLayout(0, 0));
        
        String [] ColumnNames = 
        {
            "ID",
            "Prénom",
            "Nom",
            "Note Mi-Session",
            "Note Examen Final",
            "Moyenne",
            "Situation"
        };
        Object[][] rowData = null;
        
        gradesJTable = new JTable(rowData, ColumnNames);
    }
    
}
