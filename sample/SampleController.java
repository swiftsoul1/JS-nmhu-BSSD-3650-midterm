package sample;

import DnDpak.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SampleController  implements Initializable {

    //region control properties
    @FXML public TextField nameTxb;
    @FXML public RadioButton wizRBtn, fighterRBtn, clericRBtn, necroRBtn, evocatRBtn, conjureRBtn,
            champRBtn, samRBtn, niteRBtn, lifeRBtn, deathRBtn, orderRBtn;
    @FXML public ToggleGroup DnDClassToggle, WizSubGroup, FighterSubGroup, ClericSubGroup;
    @FXML public Button createBtn;
    //endregion

    //region constructor
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        WizSubGroup = new ToggleGroup();
        necroRBtn.setToggleGroup(WizSubGroup);
        evocatRBtn.setToggleGroup(WizSubGroup);
        conjureRBtn.setToggleGroup(WizSubGroup);


        necroRBtn.setVisible(false);
        evocatRBtn.setVisible(false);
        conjureRBtn.setVisible(false);
        champRBtn.setVisible(false);
        samRBtn.setVisible(false);
        niteRBtn.setVisible(false);
        lifeRBtn.setVisible(false);
        deathRBtn.setVisible(false);
        orderRBtn.setVisible(false);
    }
    //endregion

    //region events
    @FXML void handleClassTGroup(ActionEvent event){
        if(wizRBtn.isSelected()){
            necroRBtn.setVisible(true);
            evocatRBtn.setVisible(true);
            conjureRBtn.setVisible(true);
            champRBtn.setVisible(false);
            samRBtn.setVisible(false);
            niteRBtn.setVisible(false);
            lifeRBtn.setVisible(false);
            deathRBtn.setVisible(false);
            orderRBtn.setVisible(false);
        }
        else if (fighterRBtn.isSelected()){
            necroRBtn.setVisible(false);
            evocatRBtn.setVisible(false);
            conjureRBtn.setVisible(false);
            champRBtn.setVisible(true);
            samRBtn.setVisible(true);
            niteRBtn.setVisible(true);
            lifeRBtn.setVisible(false);
            deathRBtn.setVisible(false);
            orderRBtn.setVisible(false);

        }
        else if(clericRBtn.isSelected()) {
            necroRBtn.setVisible(false);
            evocatRBtn.setVisible(false);
            conjureRBtn.setVisible(false);
            champRBtn.setVisible(false);
            samRBtn.setVisible(false);
            niteRBtn.setVisible(false);
            lifeRBtn.setVisible(true);
            deathRBtn.setVisible(true);
            orderRBtn.setVisible(true);
        }
    }
    @FXML
    private void handleCreateButtonAction(ActionEvent event) {
            //Load second scene
        DataPasser d = DataPasser.getInstance();
        d.setName(nameTxb.getText());

            if(wizRBtn.isSelected()) {
                d.setClassName("Wizard");
                if (necroRBtn.isSelected()) {
                    d.setSubClassName("Necromancy");
                } else if (evocatRBtn.isSelected()) {
                    d.setSubClassName("Evocation");
                } else if (conjureRBtn.isSelected()) {
                    d.setSubClassName("Conjuration");
                }
            }else if (fighterRBtn.isSelected()) {
                d.setClassName("Fighter");
                if (champRBtn.isSelected()) {
                    d.setSubClassName("Champion");
                } else if (niteRBtn.isSelected()) {
                    d.setSubClassName("Knight");
                } else if (samRBtn.isSelected()) {
                    d.setSubClassName("Samurai");
                }
            }else if (clericRBtn.isSelected()) {
                d.setClassName("Cleric");
                if (lifeRBtn.isSelected()) {
                    d.setSubClassName("Life");
                } else if (deathRBtn.isSelected()) {
                    d.setSubClassName("Death");
                } else if (orderRBtn.isSelected()) {
                    d.setSubClassName("Order");
                }
            }

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("characterPage.fxml"));
            Parent root = null;
            root = loader.load();

            //Show scene 2 in new window
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Character Page");
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    //endregion

}
