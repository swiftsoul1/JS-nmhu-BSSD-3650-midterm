package DnDpak;

public class OrderDomain extends ClericSubClass {

    private String displaySubClassFeatures;

    //region constructor
    public OrderDomain(DnDClass cleric) {
        super(cleric);
        SplitDisplayString();
    }
    //endregion

    //region methods
    @Override
    public String getSubClassFeatures() {
        return super.getSubClassFeatures() + "Order Domain\n" +
                "Order Domain Spells\n" +
                "Cleric Level Spells\n" +
                "1st Command Heroism\n" +
                "3rd Hold Person Zone of Truth\n" +
                "5th Mass Healing Word Slow\n" +
                "7th Compulsion Locate Creature\n" +
                "9th Commune Dominate Person\n" +
                "\n" +
                "Bonus Proficiencies\n" +
                "When you choose this domain at 1st level you gain proficiency with heavy armor. You also gain proficiency in the Intimidation or Persuasion skill (your choice).\n" +
                "\n" +
                "Voice of Authority\n" +
                "Starting at 1st level you can invoke the power of law to drive an ally to attack. If you cast a spell with a spell slot of 1st level or higher and target an ally with the spell" +
                " that ally can use their reaction immediately after the spell to make one weapon attack against a creature of your choice that you can see. If the spell targets more than one ally " +
                "you choose the ally who can make the attack.\n" +
                ", \n" +
                "Channel Divinity: Order's Demand\n" +
                "Starting at 2nd level you can use your Channel Divinity to exert an intimidating presence over others.\n" +
                "As an action you present your holy symbol and each creature of your choice that can see or hear you within 30 feet of you must succeed on a Wisdom saving throw or be charmed by " +
                "you until the end of your next turn or until the charmed creature takes any damage. You can also cause any of the charmed creatures to drop what they are holding when they fail " +
                "the saving throw.\n" +
                ", \n" +
                "Embodiment of the Law\n"+
                "At 6th level you become remarkably adept at channeling magical energy to compel others. If you cast a spell of the enchantment school using a spell slot of 1st level or higher " +
                "you can change the spell's casting time to 1 bonus action for this casting provided the spell's casting time is normally 1 action. You can use this feature a number of times equal " +
                "to your Wisdom modifier (minimum of once) and you regain all expended uses of it when you finish a long rest.\n" +
                ", \n" +
                "Divine Strike\n" +
                "At 8th level you gain the ability to infuse your weapon strikes with divine energy. Once on each of your turns when you hit a creature with a weapon attack " +
                "you can cause the attack to deal an extra 1d8 psychic damage to the target. When you reach 14th level the extra damage increases to 2d8.\n" +
                ", \n" +
                "Order's Wrath\n" +
                "Starting at 17th level enemies you designate for destruction wilt under the combined efforts of you and your allies. " +
                "If you deal your Divine Strike damage to a creature on your turn you can curse that creature until the start of your next turn. " +
                "The next time one of your allies hits the cursed creature with an attack the target also takes 2d8 psychic damage and the curse ends. " +
                "You can curse a creature in this way only once per turn.\n";
    }

    @Override
    public void SplitDisplayString() {
        //call super
        super.SplitDisplayString();
        //split up current abilities from all abilities
        //all SubClasses get their abilities on the same levelpath
        String[] dispArch = getSubClassFeatures().split(",");
        switch (GetLevel()) {
            default:
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
    //endregion
}
