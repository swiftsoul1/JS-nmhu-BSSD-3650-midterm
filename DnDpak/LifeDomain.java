package DnDpak;

public class LifeDomain extends ClericSubClass {
    private String displaySubClassFeatures;
    private final String SubImgUrl = "C:\\Users\\Jonah\\Desktop\\Patterns-nmhu\\midterm\\JS-nmhu-BSSD-3650-midterm\\DnDpak\\Characters\\life.png";

    //region constructor
    public LifeDomain(DnDClass cleric) {
        super(cleric);
        SplitDisplayString();
    }
    //endregion

    //region methods
    @Override
    public String getSubClassFeatures() {
        return super.getSubClassFeatures() + "Life Domain\n" +
                "Life Domain Spells Cleric Level Spells\n" +
                "1st Bless Cure Wounds\n" +
                "3rd Lesser Restoration Spiritual Weapon\n" +
                "5th Beacon of Hope Revivify\n" +
                "7th Death Ward Guardian of Faith\n" +
                "9th Mass Cure Wounds Raise Dead\n" +
                "\n" +
                "Bonus Proficiency\n" +
                "When you choose this domain at 1st Level you gain proficiency with Heavy Armor.\n" +
                "\n" +
                "Disciple of Life\n" +
                "Also starting at 1st Level your Healing Spells are more effective. Whenever you use a spell of 1st Level or higher to Restore Hit Points to a creature " +
                "the creature regains additional Hit Points equal to 2 + the spell’s level.\n" +
                ", \n" +
                "Channel Divinity: Preserve Life\n" +
                "Starting at 2nd Level you can use your Channel Divinity to heal the badly injured. As an action you present your holy Symbol and evoke Healing energy " +
                "that can restore a number of Hit Points equal to five times your Cleric level. Choose any creatures within 30 feet of you and divide those Hit Points among them. " +
                "This feature can restore a creature to no more than half of its hit point maximum. You can’t use this feature on an Undead or a Construct.\n" +
                ", \n" +
                "Blessed Healer\n" +
                "Beginning at 6th level the Healing Spells you cast on others heal you as well. When you Cast a Spell of 1st Level or higher that restores Hit Points to a creature other than you. " +
                "you regain Hit Points equal to 2 + the spell’s level.\n" +
                ", \n" +
                "Divine Strike\n" +
                "At 8th level you gain the ability to infuse your weapon strikes with divine energy. Once on each of your turns when you hit a creature with a weapon Attack" +
                " you can cause the Attack to deal an extra 1d8 radiant damage to the target. When you reach 14th level the extra damage increases to 2d8.\n" +
                ", \n" +
                "Supreme Healing\n" +
                "Starting at 17th level when you would normally roll one or more dice to Restore Hit Points with a spell you instead use the highest number possible for each die. " +
                "For example instead of restoring 2d6 Hit Points to a creature you restore 12.";
    }
    @Override
    public void SplitDisplayString() {
        //call super
        super.SplitDisplayString();
        //split up current abilities from all abilities
        //all SubClasses get their abilities on the same levelpath
        String[] dispArch = getSubClassFeatures().split(",");
        switch (GetLevel()) {
            case 1:
                displaySubClassFeatures = dispArch[0];
                break;
            case 2:
                displaySubClassFeatures = dispArch[0] + dispArch[1];
                break;
            case 6:
                displaySubClassFeatures = dispArch[0] + dispArch[1] + dispArch[2] + dispArch[3];
                break;
            case 8:
                displaySubClassFeatures = dispArch[0] + dispArch[1] + dispArch[2] + dispArch[3] + dispArch[4];
                break;
            case 17:
                displaySubClassFeatures = dispArch[0] + dispArch[1] + dispArch[2] + dispArch[3] + dispArch[4] + dispArch[5];
                break;
        }
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

    public String getSubImgUrl() {
        return SubImgUrl;
    }
    //endregion
}
