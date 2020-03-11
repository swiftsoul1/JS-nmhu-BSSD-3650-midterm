package DnDpak;

public class Knight extends FighterSubClass {

    private String displaySubClassFeatures;
    private final String SubImgUrl = "JS-nmhu-BSSD-3650-midterm\\DnDpak\\Characters\\knight.png";

    //region constructor
    public Knight(DnDClass fighter) {
        super(fighter);
    }
    // endregion

    //region methods

    @Override
    public String getSubClassFeatures() {
        return super.getSubClassFeatures() + "Knight\n" +
                "Starting at 3rd level mounting or dismounting a creature costs you only 5 feet of movement rather than half your speed. " +
                "in addition you have advantage on saving throws made to avoid falling off your mount. " +
                "If you fall off it you can automatically land on your feet if you aren’t incapacitated and you fall less than 10 feet.\n" +
                "\n" +
                "Implacable Mark\n" +
                "At 3rd level you excel at foiling attacks and protecting your allies by menacing your foes. When you hit a creature with a melee weapon attack " +
                "the target is marked by you until the end of your next turn. A creature ignores this effect if the creature can’t be frightened." +
                "The marked target has disadvantage on any attack roll against a creature other than you or someone else who marked it." +
                "If a target marked by you is within 5 feet of you on its turn and it moves at least 1 foot or makes an attack that suffers disadvantage from this feature" +
                "you can make one melee weapon attack against it using your reaction. This attack roll has advantage and if it hits the attack’s weapon deals extra damage to the target" +
                "equal to your fighter level. You can make this special attack even if you have already expended your reaction this round" +
                "but not if you have already used your reaction this turn. You can make this attack three times and you regain all expended uses of it when you finish a short or long rest.\n" +
                ", \n" +
                "Noble Cavalry\n" +
                "At 7th level you gain proficiency in two of the following skills of your choice: Animal Handling History Insight Persuasion or Religion." +
                "Alternatively you learn one language of your choice.\n" +
                ",\n" +
                "Hold the Line\n" +
                "At 10th level you master the ability to harass and slow your enemies. As a reaction when a creature moves at least 1 foot within 5 feet of you " +
                "you can make one melee weapon attack against that creature. If you hit the attack’s weapon deals extra damage to the target equal to half your fighter level " +
                "and the target’s speed is reduced to 0 until the end of this turn.\n" +
                ", \n" +
                "Rapid Strike\n" +
                "Starting at 15th level you learn to trade accuracy for swift strikes. If you have advantage on a weapon attack against a target on your turn" +
                "you can forgo that advantage to immediately make an additional weapon attack against the same target as a bonus action.\n" +
                ", \n" +
                "Defender's Blade\n" +
                "At 18th level you respond to danger with extraordinary vigilance. You can use your reaction for an opportunity attack even if you have already expended your reaction this round" +
                " but not if you have already used your reaction this turn. In addition you gain a +1 bonus to AC while wearing heavy armor.\n";
    }

    @Override
    public void SplitDisplayString() {
        //call super
        super.SplitDisplayString();
        //split up current abilities from all abilities
        //all SubClasses get their abilities on the same levelpath
        String[] dispArch = getSubClassFeatures().split(",");
        switch (GetLevel()) {
            case 3:
                displaySubClassFeatures = dispArch[0];
                break;
            case 7:
                displaySubClassFeatures = dispArch[0] + dispArch[1];
                break;
            case 10:
                displaySubClassFeatures = dispArch[0] + dispArch[1] + dispArch[2] + dispArch[3];
                break;
            case 15:
                displaySubClassFeatures = dispArch[0] + dispArch[1] + dispArch[2] + dispArch[3] + dispArch[4];
                break;
            case 18:
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
    public String getSubImgUrl(){return SubImgUrl;}
    //endregion
}
