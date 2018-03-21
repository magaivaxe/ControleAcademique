/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;
//Libraries
import javax.swing.*;

/**
 * Class to create the application window 
 * @author sire_marcos
 */
public class CaWindow extends JFrame
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
        mFileNew = new JMenuItem("Nouveau"); mFile.add(mFileNew);
        mFileOpen = new JMenuItem("Ouvrir"); mFile.add(mFileOpen);
        mFileSave = new JMenuItem("Enregistrer"); mFile.add(mFileSave);
        mFileSaveAs = new JMenuItem("Enregistrer sous"); mFile.add(mFileSaveAs);
        mFileQuit = new JMenuItem("Fermer"); mFile.add(mFileQuit);
        
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
}





















