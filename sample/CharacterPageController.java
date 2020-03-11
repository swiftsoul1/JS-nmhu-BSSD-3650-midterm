package sample;

import DnDpak.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class CharacterPageController implements Initializable {

    //region control properties
    @FXML public Label nameLbl, classOneLbl, classOneLvlLbl;
    //endregion

    private DnDCharacter myGuy;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //switch to build initial DnDClass
        //from the values we got from the first window
        //region switch
        switch (classOneLbl.getText()){
            case "Wizard":
                if(classOneLvlLbl.getText() == "Necromancy"){
                    myGuy = new DnDCharacter(nameLbl.getText(), new Necromancy(new Wizard()));
                }
                else if (classOneLvlLbl.getText() == "Evocation"){
                    myGuy = new DnDCharacter(nameLbl.getText(), new Evocation(new Wizard()));
                }
                else if(classOneLvlLbl.getText() == "Conjuration"){
                    myGuy = new DnDCharacter(nameLbl.getText(),new Conjuration(new Wizard()));
                }
                break;
            case "Fighter":
                if(classOneLvlLbl.getText() == "Champion"){
                    myGuy = new DnDCharacter(nameLbl.getText(), new Champion(new Fighter()));
                }
                else if (classOneLvlLbl.getText() == "Knight"){
                    myGuy = new DnDCharacter(nameLbl.getText(), new Knight(new Fighter()));
                }
                else if(classOneLvlLbl.getText() == "Samurai"){
                    myGuy = new DnDCharacter(nameLbl.getText(), new Samurai(new Fighter()));
                }
                break;
            case "Cleric":
                if(classOneLvlLbl.getText() == "Life"){
                    myGuy = new DnDCharacter(nameLbl.getText(), new LifeDomain(new Cleric()));
                }
                else if (classOneLvlLbl.getText() == "Death"){
                    myGuy = new DnDCharacter(nameLbl.getText(), new DeathDomain(new Cleric()));
                }
                else if(classOneLvlLbl.getText() == "Order"){
                    myGuy = new DnDCharacter(nameLbl.getText(), new OrderDomain(new Cleric()));
                }
                break;
        }//switch
        //endregion

    }

    //update UI
    private void UpdateCharacterDisplay(){
        //check which DnDClasses are filled
        if(myGuy.GetClass(0) != null){
            //if we have a class here display it
        }
        if(myGuy.GetClass(1) != null){
            //if we have a class here display it
        }
        if(myGuy.GetClass(2) != null){
            //if we have a class here display it
        }
    }

    public void transferCharacterAttributes(String name, String cClass, String subClass) {
        //store values so we can use they later when we bring up the page
        nameLbl.setText(name);
        classOneLbl.setText(cClass);
        classOneLvlLbl.setText(subClass);

    }
}
