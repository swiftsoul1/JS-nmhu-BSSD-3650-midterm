package DnDpak;

public class Cleric implements DnDClass {


    //region properties
    //region features
    private final String classFeatures = "Class Features:" +
            "Spellcasting Ability\n" +
            "Wisdom is your Spellcasting Ability for your Cleric Spells. The power of your Spells comes from your devotion to your deity. " +
            "You use your Wisdom whenever a Cleric spell refers to your Spellcasting Ability. In addition you use your Wisdom modifier when setting the saving throw DC" +
            " for a Cleric spell you cast and when Making an Attack roll with one." +
            "Spell save DC = 8 + your Proficiency Bonus + your Wisdom modifier" +
            "Spell Attack modifier = your Proficiency Bonus + your Wisdom modifier" +
            "Ritual Casting\n" +
            "You can cast a Cleric spell as a ritual if that spell has the ritual tag and you have the spell prepared.\n" +
            "Spellcasting Focus\n" +
            "You can use a holy Symbol (see \"Equipment\") as a Spellcasting focus for your Cleric Spells.\n" +
            "Domain Spells\n" +
            "Each domain has a list of spells-its domain spells-that you gain at the Cleric levels noted in the domain description." +
            "Once you gain a domain spell you always have it prepared and it doesn't count against the number of Spells you can prepare each day." +
            "If you have a domain spell that doesn't appear on the Cleric spell list the spell is nonetheless a Cleric spell for you.\n" +
            ",\n" +
            "Channel Divinity\n" +
            "At 2nd Level you gain the ability to channel divine energy directly from your deity using that energy to fuel magical Effects. " +
            "You start with two such effects: Turn Undead and an effect determined by your domain. Some domains grant you additional Effects as you advance in levels" +
            " as noted in the domain description. When you use your Channel Divinity you choose which effect to create. You must then finish a short or Long Rest to use your " +
            "Channel Divinity again. Some Channel Divinity Effects require Saving Throws. When you use such an effect from this class the DC equals your Cleric spell save DC." +
            "Beginning at 6th level you can use your Channel Divinity twice between rests and beginning at 18th level you can use it three times between rests. " +
            "When you finish a short or Long Rest you regain your expended uses.\n" +
            ", \n"+
            "Destroy Undead\n" +
            "Starting at 5th Level when an Undead of CR 1/2 or lower fails its saving throw against Your Turn Undead feature the creature is instantly destroyed.\n" +
            ", \n" +
            "Divine Intervention\n" +
            "Beginning at 10th level you can call on your deity to intervene on your behalf when your need is great.Imploring your deity's aid requires you to use your action. " +
            "Describe the assistance you seek and roll percentile dice. If you roll a number equal to or lower than your Cleric level your deity intervenes. " +
            "The DM chooses the Nature of the intervention; the effect of any Cleric spell or Cleric domain spell would be appropriate. " +
            "If your deity intervenes you can't use this feature again for 7 days. Otherwise you can use it again after you finish a Long Rest. " +
            "At 20th level your call for intervention succeeds automatically no roll required.";
    //endregion
    private int level;
    private String displayClassFeatures;
    //endregion

    //region constructor
    public Cleric() {
        SetLevel(1);
        SplitDisplayString();
    }//level 1 constructor

    public Cleric(int level) {
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
            case 10:
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

