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
public class CaWindow extends JFrame implements ActionListener
{
    //Fields
    private int X = 650;
    private int Y = 200;
    private int W_WIDTH = 1200;
    private int W_HEIGHT = 600;
    //Menu objects
    private JMenuBar menuBar;
    private JMenu mFile,mEdit,mTools,mHelp,mToolsClassify;
    private JMenuItem mFileNew,mFileOpen,mFileSave,mFileSaveAs,mFileQuit,
                      mEditAdd,mEditModify,mEditDelete,
                      mToolsSearch,mToolsShow,mTClasStudent,mTClasLastName;
    /**
     * Window constructor
     */
    CaWindow()
    {
        //Window title
        setTitle("Contrôle Académique");
        //Window position and dimension
        setBounds(X, Y, W_WIDTH, W_HEIGHT);
        //MenuBar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        //Menu
        mFile = new JMenu("Fichier");mEdit = new JMenu("Édition");
        mTools = new JMenu("Outils");mHelp = new JMenu("Aide");
        //Add menus to MenuBar
        menuBar.add(mFile);menuBar.add(mEdit);
        menuBar.add(mTools);menuBar.add(mHelp);
        //MenuItems and add to menus
        mFileNew = new JMenuItem("Nouveau");
        mFile.add(mFileNew);
        mFileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
                                                       InputEvent.META_MASK));
        mFileOpen = new JMenuItem("Ouvrir"); 
        mFile.add(mFileOpen);
        mFileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
                                                        InputEvent.META_MASK));
        mFileSave = new JMenuItem("Enregistrer");
        mFile.add(mFileSave);
        mFileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
                                                        InputEvent.META_MASK));
        mFileSaveAs = new JMenuItem("Enregistrer sous...");
        mFile.add(mFileSaveAs);
        mFile.addSeparator();
        
        mFileQuit = new JMenuItem("Fermer");
        mFile.add(mFileQuit);
        mFileQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,
                                                        InputEvent.META_MASK));
        mEditAdd = new JMenuItem("Ajouter"); mEdit.add(mEditAdd);
        mEditDelete = new JMenuItem("Supprimer"); mEdit.add(mEditDelete);
        mEditModify = new JMenuItem("Modifier"); mEdit.add(mEditModify);
        
        mToolsSearch = new JMenuItem("Rechercher"); mTools.add(mToolsSearch);
        mToolsShow = new JMenuItem("Lister"); mTools.add(mToolsShow);
        mToolsClassify = new JMenu("Ordonner"); mTools.add(mToolsClassify);
        
        mTClasStudent = new JMenuItem("ID Étudiant"); 
        mToolsClassify.add(mTClasStudent);
        mTClasLastName = new JMenuItem("Nom de famille");
        mToolsClassify.add(mTClasLastName);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ev)
    {
        
    }
}





















