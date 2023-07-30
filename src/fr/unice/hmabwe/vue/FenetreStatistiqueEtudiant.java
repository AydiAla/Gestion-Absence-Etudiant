package fr.unice.hmabwe.vue;


import javax.swing.*;

import fr.unice.hmabwe.controleur.bd.Connexion;
import fr.unice.hmabwe.controleur.bd.dao.DaoEtudiant;
import fr.unice.hmabwe.controleur.bd.dao.DaoException;
import fr.unice.hmabwe.controleur.bd.dao.DaoFabrique;
import fr.unice.hmabwe.modele.Etudiant;

/**
 *
 * @author M'RAH Mehdi
 *
 * Fenetre permettant d'afficher les statistiques d'un etudiant
 *
 */

public class FenetreStatistiqueEtudiant extends JFrame{
    private Connexion conn;

    private DaoFabrique df;
    private DaoEtudiant de;
    private PanelStatistiqueEtudiant panelStatEtu;

    /** Constructeur vide*/
    public FenetreStatistiqueEtudiant(){

    }

    public FenetreStatistiqueEtudiant(DaoFabrique df, Etudiant e){


        this.df = df;
        de = df.getDaoEtudiant();
        Etudiant etumodif = de.findByNumeroEtudiant(e.getNumEtu());
        this.conn = df.getConnexion();
        panelStatEtu = new PanelStatistiqueEtudiant(e, df);
        this.setTitle("Statistiques de l'etudiant " + e.getPrenom() + " " + e.getNom());
        this.setSize(350, 350);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(panelStatEtu.getPanelPrincipal());
        this.setVisible(true);



    }

}