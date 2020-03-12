package sample;

import DnDpak.*;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CharacterPageController implements Initializable {

    //region control properties
    @FXML public Label nameLbl, totLevelLbl, classOneLbl, classOneLvlLbl, classTwoLbl, classTwoLvlLbl, classThreeLbl, classThreeLvlLbl, classOneDispLbl, classOneDispLvlLbl,
            classTwoDispLbl, classTwoDispLvlLbl, classThreeDispLbl, classThreeDispLvlLbl, ftsOneSubDispLbl, ftsOneDispLbl, ftsTwoSubDispLbl, ftsTwoDispLbl, ftsThreeSubDispLbl,
            ftsThreeDispLbl;
    @FXML public TextArea classOneFtsArea, classOneSubFtsArea,classTwoFtsArea, classTwoSubFtsArea, classThreeFtsArea, classThreeSubFtsArea, outputArea;
    @FXML public ImageView classOneSubImgVw, classOneImgVw, classTwoSubImgVw, classTwoImgVw, classThreeSubImgVw, classThreeImgVw;
    @FXML public Button classOneLvlBtn, classTwoLvlBtn, classThreeLvlBtn, addClassBtn, useItemBtn;
    @FXML public ListView<String> invListVw;
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
        //btns
        classOneLvlBtn.setVisible(false);
        classTwoLvlBtn.setVisible(false);
        classThreeLvlBtn.setVisible(false);
        outputArea.setText("Welcome to your Character Sheet!\n");

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

        //give the character some starting items
        ItemMaker iM = new ItemMaker();
        InventoryItem sword = iM.MakeLongsword();
        InventoryItem potion = iM.MakeHealingPotion();
        InventoryItem staff = iM.MakeStaffOfFire();
        myGuy.AddItem(sword);
        myGuy.AddItem(potion);
        myGuy.AddItem(staff);
        UpdateCharacterDisplay();
    }

    //region update UI
    private void UpdateCharacterDisplay(){
        //load character traits
       nameLbl.setText(myGuy.getName());
       totLevelLbl.setText(""+myGuy.getAllLevels());

        //check which DnDClasses are filled

        //firstClass
        if(myGuy.GetClass(0) != null){
            //if we have a class here load values and display it
            classOneLbl.setText(myGuy.GetClass(0).getName());
            classOneLvlLbl.setText(""+myGuy.GetClass(0).GetLevel());
            classOneFtsArea.setText(myGuy.GetClass(0).getDispClassFeats());
            classOneSubFtsArea.setText(myGuy.GetClass(0).getDisplaySubClassFeatures());

            try {
                //try to load the imagefiles from the path
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

            //show it all after
            classOneLbl.setVisible(true);
            classOneLvlLbl.setVisible(true);
            classOneDispLbl.setVisible(true);
            classOneDispLvlLbl.setVisible(true);
            ftsOneSubDispLbl.setVisible(true);
            ftsOneDispLbl.setVisible(true);
            classOneFtsArea.setVisible(true);
            classOneSubFtsArea.setVisible(true);
            classOneLvlBtn.setVisible(true);
        }

        //secondClass
        if(myGuy.GetClass(1) != null){
            //if we have a class here load values and display it
            classTwoLbl.setText(myGuy.GetClass(1).getName());
            classTwoLvlLbl.setText(""+myGuy.GetClass(1).GetLevel());
            classTwoFtsArea.setText(myGuy.GetClass(1).getDispClassFeats());
            classTwoSubFtsArea.setText(myGuy.GetClass(1).getDisplaySubClassFeatures());

            try {
                //try to load the imagefiles from the path
                FileInputStream input = new FileInputStream(myGuy.GetClass(1).getImgUrl().strip());
                Image image = new Image(input);
                classTwoImgVw.setImage(image);
                input = new FileInputStream(myGuy.GetClass(1).getSubImgUrl().strip());
                Image image2 = new Image(input);
                classTwoSubImgVw.setImage(image2);
            }
            catch (IOException e){
                e.printStackTrace();
            }

            //show it all after
            classTwoLbl.setVisible(true);
            classTwoLvlLbl.setVisible(true);
            classTwoDispLbl.setVisible(true);
            classTwoDispLvlLbl.setVisible(true);
            ftsTwoSubDispLbl.setVisible(true);
            ftsTwoDispLbl.setVisible(true);
            classTwoFtsArea.setVisible(true);
            classTwoSubFtsArea.setVisible(true);
            classTwoLvlBtn.setVisible(true);
        }

        //thirdClass
        if(myGuy.GetClass(2) != null){
            //if we have a class here display it
            //if we have a class here load values and display it
            classThreeLbl.setText(myGuy.GetClass(2).getName());
            classThreeLvlLbl.setText(""+myGuy.GetClass(2).GetLevel());
            classThreeFtsArea.setText(myGuy.GetClass(2).getDispClassFeats());
            classThreeSubFtsArea.setText(myGuy.GetClass(2).getDisplaySubClassFeatures());

            try {
                //try to load the imagefiles from the path
                FileInputStream input = new FileInputStream(myGuy.GetClass(2).getImgUrl().strip());
                Image image = new Image(input);
                classThreeImgVw.setImage(image);
                input = new FileInputStream(myGuy.GetClass(2).getSubImgUrl().strip());
                Image image2 = new Image(input);
                classThreeSubImgVw.setImage(image2);
            }
            catch (IOException e){
                e.printStackTrace();
            }

            //show it all after
            classThreeLbl.setVisible(true);
            classThreeLvlLbl.setVisible(true);
            classThreeDispLbl.setVisible(true);
            classThreeDispLvlLbl.setVisible(true);
            ftsThreeSubDispLbl.setVisible(true);
            ftsThreeDispLbl.setVisible(true);
            classThreeFtsArea.setVisible(true);
            classThreeSubFtsArea.setVisible(true);
            classThreeLvlBtn.setVisible(true);
            addClassBtn.setVisible(false);
        }
        //if max level take away leveling options
        if(myGuy.getAllLevels() == 20){
            addClassBtn.setVisible(false);
            classOneLvlBtn.setVisible(false);
            classTwoLvlBtn.setVisible(false);
            classThreeLvlBtn.setVisible(false);
        }

        //display inventory
        invListVw.getItems().clear();
       for(InventoryItem item: myGuy.getItems()){
            invListVw.getItems().add(item.getName());
        }

    }
    //endregion

    @FXML void handleClassOneLvlBtn(ActionEvent event){
        myGuy.LevelUp(0);
        outputArea.setText(outputArea.getText() + "You leveled up!" + "\n");
        UpdateCharacterDisplay();
    }
    @FXML void handleClassTwoLvlBtn(ActionEvent event){
        myGuy.LevelUp(1);
        outputArea.setText(outputArea.getText() + "You leveled up!" + "\n");
        UpdateCharacterDisplay();
    }
    @FXML void handleClassThreeLvlBtn(ActionEvent event){
        myGuy.LevelUp(2);
        outputArea.setText(outputArea.getText() + "You leveled up!" + "\n");
        UpdateCharacterDisplay();
    }
    @FXML void handleAddClassBtn(ActionEvent event){
        //get list ready
        ArrayList<String> classNames = new ArrayList<>();
        classNames.add("Wizard");
        classNames.add("Cleric");
        classNames.add("Fighter");


        //remove classes we have already
        for(DnDClass mc: myGuy.getmClasses()){
            classNames.remove(mc.getName());
        }

        //build array for dialalog bbox
        String[] input = new String[classNames.size()];
        int i= 0;
        for(String str: classNames) {
            input[i] = classNames.get(i);
            i++;
        }

        //user input
        int uChoice = JOptionPane.showOptionDialog(null,"Pick a Class.", "Multiclass",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, input, null);
        int uChoice2;
        String[] input2;
        //use choice to display subclasses
        switch(input[uChoice]){
            case "Wizard":
                input2 = new String[]{"Necromancy", "Evocation", "Conjuration"};
                uChoice2 = JOptionPane.showOptionDialog(null,"Pick a Sub Class.", "Subclass",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, input2, null);
                switch (input2[uChoice2]){
                    case "Necromancy":
                        myGuy.LevelUp(new Necromancy(new Wizard()));
                        break;
                    case "Evocation":
                        myGuy.LevelUp(new Evocation(new Wizard()));
                        break;
                    case "Conjuration":
                        myGuy.LevelUp(new Conjuration(new Wizard()));
                        break;
                }
                break;
            case "Fighter":
                input2 = new String[]{"Champion", "Knight", "Samurai"};
                uChoice2 = JOptionPane.showOptionDialog(null,"Pick a Sub Class.", "Subclass",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, input2, null);
                switch (input2[uChoice2]){
                    case "Champion":
                        myGuy.LevelUp(new Champion(new Fighter()));
                        break;
                    case "Knight":
                        myGuy.LevelUp(new Knight(new Fighter()));
                        break;
                    case "Samurai":
                        myGuy.LevelUp(new Samurai(new Fighter()));
                        break;
                }
                break;
            case "Cleric":
                input2 = new String[]{"Life", "Death", "Order"};
                uChoice2 = JOptionPane.showOptionDialog(null,"Pick a Sub Class.", "Subclass",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, input2, null);
                switch (input2[uChoice2]){
                    case "Life":
                        myGuy.LevelUp(new LifeDomain(new Cleric()));
                        break;
                    case "Death":
                        myGuy.LevelUp(new DeathDomain(new Cleric()));
                        break;
                    case "Order":
                        myGuy.LevelUp(new OrderDomain(new Cleric()));
                        break;
                }
                break;
        }//bigSwitch
        outputArea.setText(outputArea.getText() + "You leveled up!" + "\n");
        UpdateCharacterDisplay();

    }
    @FXML public void handleUseItemBtn(ActionEvent event){
        ObservableList<Integer> index = invListVw.getSelectionModel().getSelectedIndices();
        int i = index.get(0);
        outputArea.setText(outputArea.getText() + myGuy.UseItem(i) + "\n");
    }

}
