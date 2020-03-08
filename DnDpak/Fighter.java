package DnDpak;

public class Fighter implements DnDClass {


    //region properties
    //region features
    private final String classFeatures = "Class Features:\n\n" +
            "Fighting Style\n" +
            "You adopt a particular style of fighting as your specialty. Choose a Fighting Style from the list of optional features. You can't take the same Fighting Style option more than once even if you get to choose again.\n" +
            "Archery\n" +
            "You gain a +2 bonus to Attack rolls you make with Ranged Weapons.\n" +
            "Defense\n" +
            "While you are wearing armor you gain a +1 bonus to AC.\n" +
            "Dueling\n" +
            "When you are wielding a melee weapon in one hand and no other Weapons you gain a +2 bonus to Damage Rolls with that weapon.\n" +
            "Great Weapon Fighting\n" +
            "When you roll a 1 or 2 on a damage die for an Attack you make with a melee weapon that you are wielding with two hands you can reroll the die and must use the new roll even if the new roll is a 1 or a 2. The weapon must have the Two-Handed or Versatile property for you to gain this benefit.\n" +
            "Protection\n" +
            "When a creature you can see attacks a target other than you that is within 5 feet of you you can use your Reaction to impose disadvantage on the Attack roll. You must be wielding a Shield.\n" +
            "Two-Weapon Fighting\n" +
            "When you engage in two-weapon fighting you can add your ability modifier to the damage of the second Attack.\n" +
            "\n" +
            "Second Wind\n" +
            "You have a limited well of stamina that you can draw on to protect yourself from harm. On Your Turn you can use a Bonus Action to regain Hit Points equal to 1d10 + your Fighter level.\n" +
            "Once you use this feature you must finish a short or Long Rest before you can use it again.\n" +
            ", \n" +
            "Action Surge\n" +
            "Starting at 2nd Level you can push yourself beyond your normal limits for a moment. On Your Turn you can take one additional action on top of your regular action and a possible Bonus Action.\n" +
            "Once you use this feature you must finish a short or Long Rest before you can use it again. Starting at 17th level you can use it twice before a rest but only once on the same turn.\n" +
           ", \n" +
            "Extra Attack\n" +
            "Beginning at 5th Level you can Attack twice instead of once whenever you take the Attack action on Your Turn.\n" +
            "The number of attacks increases to three when you reach 11th level in this class and to four when you reach 20th level in this class.\n" +
            ", \n" +
            "Indomitable\n" +
            "Beginning at 9th level you can reroll a saving throw that you fail. If you do so you must use the new roll and you can't use this feature again until you finish a Long Rest.\n" +
            "You can use this feature twice between long rests starting at 13th level and three times between long rests starting at 17th level.";
    //endregion
    private int level;
    private String displayClassFeatures;
    //endregion

    //region constructor
    public Fighter() {
        SetLevel(1);
        SplitDisplayString();
    }//level 1 constructor

    public Fighter(int level) {
        SetLevel(level);
    }//subclass use.
    //endregion

    //region methods
    @Override
    public void LevelUp() {
        SetLevel(GetLevel() +1);
        SplitDisplayString();
    }



    @Override
    public void SplitDisplayString() {
        String[] dispFeat = getClassFeatures().split(",");
        switch(GetLevel()){
            default:
                setDispClassFeats(dispFeat[0]);
                break;
            case 2:
                setDispClassFeats(dispFeat[0]+dispFeat[1]);
                break;
            case 5:
                setDispClassFeats(dispFeat[0]+dispFeat[1]+dispFeat[2]);
                break;
            case 9:
                setDispClassFeats(dispFeat[0]+dispFeat[1]+dispFeat[2]+dispFeat[3]);
                break;
        }
    }
    //endregion

    //region accessors
    //gets
    @Override
    public int GetLevel() {
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
    public void SetLevel(int level) {
        this.level = level;
    }
    //endregion
}
