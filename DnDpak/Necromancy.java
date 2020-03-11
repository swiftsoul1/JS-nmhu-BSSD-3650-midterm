package DnDpak;

public class Necromancy extends WizardSubClass {

    private String displaySubClassFeatures;
    private final String SubImgUrl = "C:\\Users\\Jonah\\Desktop\\Patterns-nmhu\\midterm\\JS-nmhu-BSSD-3650-midterm\\DnDpak\\Characters\\necromancy.png";
    //region constructor
    public Necromancy(DnDClass wiz) {
        //call super
        super(wiz);
        SplitDisplayString();
    }
    //endregion

    //region methods
    @Override
    public String getSubClassFeatures() {
        //append to supers method
        return super.getSubClassFeatures() + "School of Necromancy\n" +
                "Necromancy Savant\n" +
                "Beginning when you select this school at 2nd level the gold and time you must spend to copy a necromancy spell into your spellbook is halved.\n" +
                "\n" +
                "Grim Harvest\n" +
                "At 2nd level you gain the ability to reap life energy from creatures you kill with your spells. " +
                "Once per turn when you kill one or more creatures with a spell of 1st level or higher " +
                "you regain hit points equal to twice the spell’s level " +
                "or three times its level if the spell belongs to the School of Necromancy. " +
                "You don’t gain this benefit for killing constructs or undead.\n" +
                ",\n" +
                "Undead Thralls\n" +
                "At 6th level, you add the animate dead spell to your spellbook if it is not there already. " +
                "When you cast animate dead you can target one additional corpse or pile of bones creating another zombie or skeleton as appropriate. " +
                "Whenever you create an undead using a necromancy spell, it has additional benefits: " +
                "The creature’s hit point maximum is increased by an amount equal to your wizard level. " +
                "The creature adds your proficiency bonus to its weapon damage rolls.\n" +
                ",\n" +
                "Inured to Undeath\n" +
                "Beginning at 10th level you have resistance to necrotic damage and your hit point maximum can't be reduced. " +
                "You have spent so much time dealing with undead and the forces that animate them that you have become inured to some of their worst effects.\n" +
                ",\n" +
                "Command Undead\n" +
                "Starting at 14th level you can use magic to bring undead under your control even those created by other wizards. " +
                "As an action you can choose one undead that you can see within 60 feet of you. " +
                "That creature must make a Charisma saving throw against your wizard spell save DC. " +
                "If it succeeds you can’t use this feature on it again. If it fails " +
                "it becomes friendly to you and obeys your commands until you use this feature again. " +
                "Intelligent undead are harder to control in this way. If the target has an Intelligence of 8 or higher " +
                "it has advantage on the saving throw. If it fails the saving throw and has an Intelligence of 12 or higher " +
                "it can repeat the saving throw at the end of every hour until it succeeds and breaks free.\n";
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
                displaySubClassFeatures= dispArch[0] + dispArch[1] + dispArch[2];
                break;
            case 14:
                displaySubClassFeatures = dispArch[0] + dispArch[1] + dispArch[2] + dispArch[3];
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
    public  String getSubImgUrl(){return SubImgUrl;}
    //endregion
}
