package DnDpak;

public class Evocation extends WizardSubClass {

    private String displaySubClassFeatures;
    private final String SubImgUrl = "C:\\Users\\Jonah\\Desktop\\Patterns-nmhu\\midterm\\JS-nmhu-BSSD-3650-midterm\\DnDpak\\Characters\\evocation.png";

    //region constructor
    public Evocation(DnDClass wiz) {
        //call super
        super(wiz);
        SplitDisplayString();
    }
    //endregion

    //region methods
    @Override
    public String getSubClassFeatures() {
        //append to supers method
        return (super.getSubClassFeatures() +"School of Evocation\n" +
                "Evocation Savant when you select this school at 2nd level " +
                "the gold and time you must spend to copy an Evocation spell into your Spellbook is halved.\n" +
                "\n" +
                "Sculpt Spells\n" +
                "Beginning at 2nd level you can create pockets of relative safety within the Effects of your Evocation Spells. " +
                "When you cast an Evocation spell that affects other creatures that you can see " +
                "you can choose a number of them equal to 1 + the spell’s level. " +
                "The chosen creatures automatically succeed on their Saving Throws against the spell " +
                "and they take no damage if they would normally take half damage on a successful save.\n" +
                ",\n" +
                "Potent Cantrip\n" +
                "Starting at 6th level your damaging Cantrips affect even creatures that avoid the brunt of the effect. When a creature succeeds on a saving throw against your cantrip " +
                "the creature takes half the cantrip’s damage (if any) but suffers no additional effect from the cantrip.\n" +
                ",\n" +
                "Empowered Evocation\n" +
                "Beginning at 10th level you can add your Intelligence modifier to one damage roll of any Wizard Evocation spell you cast.\n" +
                ",\n" +
                "Overchannel\n" +
                "Starting at 14th level you can increase the power of your simpler Spells. " +
                "When you cast a Wizard spell of 1st through 5th level that deals damage you can deal maximum damage with that spell." +
                "The first time you do so you suffer no adverse effect. If you use this feature again before you finish a Long Rest you take 2d12 necrotic damage for each level of the spell" +
                "immediately after you cast it. Each time you use this feature again before finishing a Long Rest " +
                "the necrotic damage per Spell Level increases by 1d12. This damage ignores Resistance and immunity.");
    }
    @Override
    public void SplitDisplayString() {
        //call super
        super.SplitDisplayString();
        //split up current abilities from all abilities
        //all SubClasses get their abilities on the same levelpath
        String[] dispArch = getSubClassFeatures().split(",");
        switch (GetLevel()) {
            case 2:
                displaySubClassFeatures = dispArch[0];
                break;
            case 6:
                displaySubClassFeatures = dispArch[0] + dispArch[1];
                break;
            case 10:
                displaySubClassFeatures= dispArch[0] + dispArch[1] + dispArch[2] + dispArch[3];
                break;
            case 14:
                displaySubClassFeatures = dispArch[0] + dispArch[1] + dispArch[2] + dispArch[3] + dispArch[4];
                break;
        }//switch
    }

    @Override
    public void LevelUp() {
        super.LevelUp();
        SplitDisplayString();
    }

    @Override
    public String getDisplaySubClassFeatures() {
        return super.getDisplaySubClassFeatures() + displaySubClassFeatures;
    }
    public String getSubImgUrl(){return SubImgUrl;}
    //endregion
}


