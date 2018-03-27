/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

/**
 *
 * @author sire_marcos
 */
public class Table extends javax.swing.JFrame
{

    /**
     * Creates new form Table
     */
    public Table()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        gradeScrollPane = new javax.swing.JScrollPane();
        gradeTable = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        mItemNew = new javax.swing.JMenuItem();
        mItemOpen = new javax.swing.JMenuItem();
        mItemSave = new javax.swing.JMenuItem();
        mItemSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mItemQuit = new javax.swing.JMenuItem();
        menuEdition = new javax.swing.JMenu();
        mItemAdd = new javax.swing.JMenuItem();
        mItemModify = new javax.swing.JMenuItem();
        mItemEraser = new javax.swing.JMenuItem();
        menuTools = new javax.swing.JMenu();
        mItemSearch = new javax.swing.JMenuItem();
        mItemList = new javax.swing.JMenuItem();
        menuOrder = new javax.swing.JMenu();
        mItemOrdID = new javax.swing.JMenuItem();
        mItemOrdName = new javax.swing.JMenuItem();
        menuAide = new javax.swing.JMenu();
        mItemApropos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gradeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "ID", "Prénom", "Nom", "Note Mi-Session", "Note Projet", "Note Examen Final", "Moyenne", "Situation"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        gradeScrollPane.setViewportView(gradeTable);

        menuFile.setText("Fichier");

        mItemNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.META_MASK));
        mItemNew.setText("Nouveau");
        mItemNew.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mItemNewActionPerformed(evt);
            }
        });
        menuFile.add(mItemNew);

        mItemOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.META_MASK));
        mItemOpen.setText("Ouvrir");
        menuFile.add(mItemOpen);

        mItemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.META_MASK));
        mItemSave.setText("Enregistrer");
        menuFile.add(mItemSave);

        mItemSaveAs.setText("Enregistrer sous...");
        menuFile.add(mItemSaveAs);
        menuFile.add(jSeparator1);

        mItemQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.META_MASK));
        mItemQuit.setText("Fermer");
        mItemQuit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mItemQuitActionPerformed(evt);
            }
        });
        menuFile.add(mItemQuit);

        menuBar.add(menuFile);

        menuEdition.setText("Édition");

        mItemAdd.setText("Ajouter");
        menuEdition.add(mItemAdd);

        mItemModify.setText("Modifier");
        menuEdition.add(mItemModify);

        mItemEraser.setText("Supprimer");
        menuEdition.add(mItemEraser);

        menuBar.add(menuEdition);

        menuTools.setText("Outils");

        mItemSearch.setText("Rechercher");
        menuTools.add(mItemSearch);

        mItemList.setText("Lister");
        menuTools.add(mItemList);

        menuOrder.setText("Ordonner");

        mItemOrdID.setText("ID étudiant");
        menuOrder.add(mItemOrdID);

        mItemOrdName.setText("Nom");
        menuOrder.add(mItemOrdName);

        menuTools.add(menuOrder);

        menuBar.add(menuTools);

        menuAide.setText("Aide");

        mItemApropos.setText("À propos");
        menuAide.add(mItemApropos);

        menuBar.add(menuAide);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(gradeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(gradeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemNewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mItemNewActionPerformed
    {//GEN-HEADEREND:event_mItemNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemNewActionPerformed

    private void mItemQuitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mItemQuitActionPerformed
    {//GEN-HEADEREND:event_mItemQuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemQuitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane gradeScrollPane;
    private javax.swing.JTable gradeTable;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mItemAdd;
    private javax.swing.JMenuItem mItemApropos;
    private javax.swing.JMenuItem mItemEraser;
    private javax.swing.JMenuItem mItemList;
    private javax.swing.JMenuItem mItemModify;
    private javax.swing.JMenuItem mItemNew;
    private javax.swing.JMenuItem mItemOpen;
    private javax.swing.JMenuItem mItemOrdID;
    private javax.swing.JMenuItem mItemOrdName;
    private javax.swing.JMenuItem mItemQuit;
    private javax.swing.JMenuItem mItemSave;
    private javax.swing.JMenuItem mItemSaveAs;
    private javax.swing.JMenuItem mItemSearch;
    private javax.swing.JMenu menuAide;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdition;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuOrder;
    private javax.swing.JMenu menuTools;
    // End of variables declaration//GEN-END:variables
}
