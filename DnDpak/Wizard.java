package DnDpak;

public class Wizard implements DnDClass {

    //region properties
    //region features
    private final String classFeatures = "Class Features: \n\n" +
            "Spellcasting Ability\n" +
            "Intelligence is your Spellcasting ability for your Wizard Spells since you learn your Spells through dedicated study and memorization. \n" +
            "You use your Intelligence whenever a spell refers to your Spellcasting ability. \n" +
            "In addition you use your Intelligence modifier when Setting the saving throw DC for a Wizard spell you cast and when Making an Attack roll with one.\n" +
            "Spell save DC = 8 + your Proficiency Bonus + your Intelligence modifier\n" +
            "Spell Attack modifier = your Proficiency Bonus + your Intelligence modifier\n" +
            "\n" +
            "Ritual Casting\n" +
            "You can cast a Wizard spell as a ritual if that spell has the ritual tag and you have the spell in your Spellbook. \n" +
            "You don't need to have the spell prepared.\n" +
            "\n" +
            "Spellcasting Focus\n" +
            "You can use an arcane focus as a Spellcasting focus for your Wizard Spells.\n" +
            "\n" +
            "Learning Spells of 1st Level and Higher\n" +
            "Each time you gain a Wizard level you can add two Wizard Spells of your choice to your Spellbook for free. \n" +
            "Each of these Spells must be of a level for which you have Spell Slots, as shown on the Wizard table. \n" +
            "On your Adventures you might find other Spells that you can add to your Spellbook.\n" +
            "\n" +
            "Arcane Recovery\n" +
            "You have learned to regain some of your magical energy by studying your Spellbook. \n" +
            "Once per day when you finish a Short Rest, you can choose expended Spell Slots to recover. \n" +
            "The Spell Slots can have a combined level that is equal to or less than half your Wizard level (rounded up) \n" +
            "and none of the slots can be 6th level or higher.\n" +
            "\n" +
            "Arcane Tradition\n" +
            "When you reach 2nd level you choose an arcane tradition, shaping your practice of magic through one of eight schools such as Evocation. \n" +
            "Your choice grants you features at 2nd level and again at 6th 10th and 14th level.\n" +
            ",\n" +
            "Spell Mastery\n" +
            "At 18th level, you have achieved such mastery over certain Spells that you can cast them at will. \n" +
            "Choose a 1st-level Wizard spell and a 2nd-level Wizard spell that are in your Spellbook. \n" +
            "You can cast those Spells at their lowest level without expending a spell slot when you have them prepared. \n" +
            "If you want to cast either spell at a higher level, you must expend a spell slot as normal.\n" +
            "By spending 8 hours in study, you can exchange one or both of the Spells you chose for different Spells of the same levels.\n" +
            ",\n" +
            "Signature Spells\n" +
            "When you reach 20th level, you gain mastery over two powerful Spells and can cast them with little effort. \n" +
            "Choose two 3rd-level Wizard Spells in your Spellbook as your signature Spells. \n" +
            "You always have these Spells prepared, they don't count against the number of Spells you have prepared \n" +
            "and you can cast each of them once at 3rd level without expending a spell slot. \n" +
            "When you do so, you can't do so again until you finish a short or Long Rest.\n" +
            "If you want to cast either spell at a higher level, you must expend a spell slot as normal.";
    //endregion
    private final String ImgUrl = "C:\\Users\\Jonah\\Desktop\\Patterns-nmhu\\midterm\\JS-nmhu-BSSD-3650-midterm\\DnDpak\\Characters\\wizard.png";
    private final String name = "Wizard";
    private int level;
    private  String displayClassFeatures;
    //endregion

    //region constructor

    public Wizard() {
        SetLevel(1);
        SplitDisplayString();
    }//level 1 constructor

    public Wizard(int level) {
        SetLevel(level);
    }//for preexisting wizard/subclass use.

    //endregion

    //region methods
    @Override
    public void SplitDisplayString(){

        String[] dispFeat = getClassFeatures().split(",");
        switch(GetLevel()){
            case 1:
                setDispClassFeats(dispFeat[0]);
                break;
            case 18:
                setDispClassFeats(dispFeat[0]+dispFeat[1]);
                break;
            case 20:
                setDispClassFeats(dispFeat[0]+dispFeat[1]+dispFeat[2]);
                break;
        }
    }

    @Override
    public void LevelUp(){
        SetLevel(GetLevel() +1);
        SplitDisplayString();
    }//method
    //endregion

    //region accessors
    //gets
    @Override
    public int GetLevel(){
        return level;
    }

    @Override
    public String getClassFeatures() {
        return classFeatures;
    }

    @Override
    public String getDispClassFeats() {
        return displayClassFeatures;
    }
    @Override
    public String getSubClassFeatures() {
        return "Sub Class Features: \n\n";
    }

    @Override
    public String getDisplaySubClassFeatures() {
        return "";
    }
    //sets
    @Override
    public void setDispClassFeats(String dispClassFeats) {
        this.displayClassFeatures = dispClassFeats;
    }

    @Override
    public void SetLevel(int level){
        this.level = level;
    }

    @Override
    public String getImgUrl() {
        return ImgUrl;
    }

    @Override
    public String getSubImgUrl() {
        return "";
    }

    @Override
    public String getName() {
        return name;
    }
    //endregion

}//class
