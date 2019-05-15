/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gns;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;


/**
 *
 * @author etudiant
 */
public class GNS007 extends Application {

    @Override
    public void start(Stage primaryStage) {
       Joueur unJoueur;
       VBox root = new VBox();
       HBox nomJ = new HBox();

        root.setSpacing(10);
        root.setPadding(new Insets(15,20, 10,10));


        Label nvJoueur = new Label("Nouveau Joueur : ");
        root.getChildren().add(nvJoueur);

                // TextField

        TextField nom = new TextField();
        nomJ.getChildren().addAll(new Label("Nom:"),nom);
        root.getChildren().add(nomJ);

        // Mot de passe
        HBox mdpp= new HBox();

        PasswordField mdp = new PasswordField();

        mdpp.getChildren().addAll(new Label("mdp:"),mdp);
        root.getChildren().add(mdpp);

        // Verif mdp

        HBox verif = new HBox();
        PasswordField mdpv = new PasswordField();

        verif.getChildren().addAll(new Label("Vérif mdp:"),mdpv);
        root.getChildren().add(verif);

     // RadioButton

        HBox Rbouton= new HBox();

        final ToggleGroup group = new ToggleGroup();

        RadioButton rb1 = new RadioButton("Homme");
        rb1.setToggleGroup(group);
        rb1.setSelected(true);

        RadioButton rb2 = new RadioButton("Femme");
        rb2.setToggleGroup(group);

        Rbouton.getChildren().addAll(rb1,rb2);
        root.getChildren().add(Rbouton);



        // CheckBox
        CheckBox CGU = new CheckBox("Acceptez vous les CGU");

        root.getChildren().add(CGU);






        // Valider
        HBox bouttons = new HBox();

        Button valider= new Button("Valider");

        valider.setOnAction(new EventHandler<ActionEvent>(){
                        @Override
            public void handle(ActionEvent event) {


        if(mdp.getText().equals(mdpv.getText()) ){


        String genreJoueur;
            if(rb1.isSelected()){

                genreJoueur = rb1.getText();

                  }
                else{

                      genreJoueur = rb2.getText();
                      System.out.println(genreJoueur);

                  }

                if(CGU.isSelected()){
                     boolean cguJoueur=true;

            }
                else{
                   boolean cguJoueur= false;

        }
                    Joueur unJoueur = new Joueur(nom.getText().toString(),mdp.getText(),genreJoueur,CGU.isSelected());

         System.out.println(unJoueur);


        Alert cbon = new Alert (AlertType.INFORMATION);
        cbon.setTitle("Joueur Crée");
        cbon.setHeaderText("Joueur a été créé");
        cbon.setContentText("C'est bon ça marche");



             cbon.showAndWait();
         }
         else{


        Alert err = new Alert (AlertType.ERROR);
        err.setTitle("Mot de passe");
        err.setHeaderText("Mots de passe pas pareil");
        err.setContentText("Erreur: Les deux mots de passe ne sont pas identiques");

        err.showAndWait();

         }





            }


        });




        // Supprimer
        Button supprimer = new Button("Supprimer");

        bouttons.setSpacing(10);
        bouttons.setPadding(new Insets(15,20, 10,10));



        supprimer.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               nom.setText("");
               mdp.setText("");
               rb1.setSelected(false);
               rb2.setSelected(false);
               CGU.setSelected(false);
            }
        });

        bouttons.getChildren().addAll(valider,supprimer);
        root.getChildren().addAll(bouttons);



        Scene scene = new Scene(root, 550, 250);

        primaryStage.setTitle("Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
