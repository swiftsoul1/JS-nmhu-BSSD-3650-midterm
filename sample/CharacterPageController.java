package sample;

import DnDpak.DnDCharacter;
import DnDpak.Necromancy;
import DnDpak.Wizard;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CharacterPageController implements Initializable {

    @FXML public Label nameLbl, classOneLbl, classOneLvlLbl;

    private DnDCharacter myGuy;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myGuy = new DnDCharacter(nameLbl.getText(), new Necromancy(new Wizard()));
        nameLbl.setText(myGuy.getName());
    }

    public void transferCharacterAttributes(String name, String cClass, String subClass) {

        nameLbl.setText(name);
        classOneLbl.setText(cClass);
        classOneLvlLbl.setText(subClass);

    }
}
