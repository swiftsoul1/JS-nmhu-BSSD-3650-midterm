package sample;

import DnDpak.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CharacterPageController implements Initializable {

    //region control properties
    @FXML public Label nameLbl, totLevelLbl, classOneLbl, classOneLvlLbl, classTwoLbl, classTwoLvlLbl, classThreeLbl, classThreeLvlLbl, classOneDispLbl, classOneDispLvlLbl,
            classTwoDispLbl, classTwoDispLvlLbl, classThreeDispLbl, classThreeDispLvlLbl, ftsOneSubDispLbl, ftsOneDispLbl, ftsTwoSubDispLbl, ftsTwoDispLbl, ftsThreeSubDispLbl,
            ftsThreeDispLbl;
    @FXML public TextArea classOneFtsArea, classOneSubFtsArea,classTwoFtsArea, classTwoSubFtsArea, classThreeFtsArea, classThreeSubFtsArea;
    @FXML public ImageView classOneSubImgVw, classOneImgVw, classTwoSubImgVw, classTwoImgVw, classThreeSubImgVw, classThreeImgVw;
    //endregion

    private DnDCharacter myGuy;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //hide everything at start
        //labels
        classOneLbl.setVisible(false);
        classOneLvlLbl.setVisible(false);
        classTwoLbl.setVisible(false);
        classTwoLvlLbl.setVisible(false);
        classThreeLbl.setVisible(false);
        classThreeLvlLbl.setVisible(false);
        classOneDispLbl.setVisible(false);
        classOneDispLvlLbl.setVisible(false);
        classTwoDispLbl.setVisible(false);
        classTwoDispLvlLbl.setVisible(false);
        classThreeDispLbl.setVisible(false);
        classThreeDispLvlLbl.setVisible(false);
        ftsOneSubDispLbl.setVisible(false);
        ftsOneDispLbl.setVisible(false);
        ftsTwoSubDispLbl.setVisible(false);
        ftsTwoDispLbl.setVisible(false);
        ftsThreeSubDispLbl.setVisible(false);
        ftsThreeDispLbl.setVisible(false);
        //textareas
        classOneFtsArea.setVisible(false);
        classOneSubFtsArea.setVisible(false);
        classTwoFtsArea.setVisible(false);
        classTwoSubFtsArea.setVisible(false);
        classThreeFtsArea.setVisible(false);
        classThreeSubFtsArea.setVisible(false);

        //switch to build initial DnDClass
        DataPasser dataPasser = DataPasser.getInstance();
        //region switch
        switch (dataPasser.getClassName()){
            case "Wizard":
                if(dataPasser.getSubClassName().strip() == "Necromancy"){
                    myGuy = new DnDCharacter(dataPasser.getName(), new Necromancy(new Wizard()));
                }
                else if (dataPasser.getSubClassName().strip()== "Evocation"){
                    myGuy = new DnDCharacter(dataPasser.getName(), new Evocation(new Wizard()));
                }
                else if(dataPasser.getSubClassName().strip() == "Conjuration"){
                    myGuy = new DnDCharacter(dataPasser.getName(),new Conjuration(new Wizard()));
                }
                break;
            case "Fighter":
                if(dataPasser.getSubClassName().strip() == "Champion"){
                    myGuy = new DnDCharacter(dataPasser.getName(), new Champion(new Fighter()));
                }
                else if (dataPasser.getSubClassName().strip() == "Knight"){
                    myGuy = new DnDCharacter(dataPasser.getName(), new Knight(new Fighter()));
                }
                else if(dataPasser.getSubClassName().strip() == "Samurai"){
                    myGuy = new DnDCharacter(dataPasser.getName(), new Samurai(new Fighter()));
                }
                break;
            case "Cleric":
                if(dataPasser.getSubClassName().strip() == "Life"){
                    myGuy = new DnDCharacter(dataPasser.getName(), new LifeDomain(new Cleric()));
                }
                else if (dataPasser.getSubClassName().strip() == "Death"){
                    myGuy = new DnDCharacter(dataPasser.getName(), new DeathDomain(new Cleric()));
                }
                else if(dataPasser.getSubClassName().strip() == "Order"){
                    myGuy = new DnDCharacter(dataPasser.getName(), new OrderDomain(new Cleric()));
                }
                break;
        }//switch
        //endregion
        UpdateCharacterDisplay();
    }

    //update UI
    private void UpdateCharacterDisplay(){
        //load character traits
        classOneLbl.setText(myGuy.GetClass(0).getName());
        totLevelLbl.setText(""+myGuy.getAllLevels());

        //check which DnDClasses are filled
        if(myGuy.GetClass(0) != null){
            //if we have a class here load values and display it
            classOneLvlLbl.setText(""+myGuy.GetClass(0).GetLevel());
            classOneFtsArea.setText(myGuy.GetClass(0).getDispClassFeats());
            classOneSubFtsArea.setText(myGuy.GetClass(0).getDisplaySubClassFeatures());

            try {
                FileInputStream input = new FileInputStream(myGuy.GetClass(0).getImgUrl().strip());
                Image image = new Image(input);
                classOneImgVw.setImage(image);
                input = new FileInputStream(myGuy.GetClass(0).getSubImgUrl().strip());
                Image image2 = new Image(input);
                classOneSubImgVw.setImage(image2);
            }
            catch (IOException e){
                e.printStackTrace();
            }

            classOneLbl.setVisible(true);
            classOneLvlLbl.setVisible(true);
            classOneDispLbl.setVisible(true);
            classOneDispLvlLbl.setVisible(true);
            ftsOneSubDispLbl.setVisible(true);
            ftsOneDispLbl.setVisible(true);
            classOneFtsArea.setVisible(true);
            classOneSubFtsArea.setVisible(true);
        }
        if(myGuy.GetClass(1) != null){
            //if we have a class here display it
        }
        if(myGuy.GetClass(2) != null){
            //if we have a class here display it
        }
    }
}
