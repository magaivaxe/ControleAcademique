/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author sire_marcos
 */
class GradesTable extends JScrollPane
{
    //Fields
    private boolean DEBUG = false;
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
    Object[][] rowData = 
        {
            {" "," "," "," "," "," "," "},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""}
        };
    //Table objects
    JTable gradesJTable;
    TableModel tableModel;
    //Scroll pane object
    JScrollPane scrollPaneJTable;

    GradesTable()
    {
        //Instance from table and table model
        tableModel = new DefaultTableModel(rowData, ColumnNames);
        gradesJTable = new JTable(tableModel);
        //Instance from scrollpane
        scrollPaneJTable =  new JScrollPane(
                gradesJTable, 
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
