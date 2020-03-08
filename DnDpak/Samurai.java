package DnDpak;

public class Samurai extends FighterSubClass {
    //region constructor
    public Samurai(DnDClass fighter) {
        super(fighter);
    }
    //endregion

    //region methods

    @Override
    public String getSubClassFeatures() {
        return super.getSubClassFeatures() + "Samurai\n" +
                "Bonus Proficiency\n" +
                "When you choose this archetype at 3rd level you gain proficiency in one of the following skills of your choice: " +
                "History Insight Performance or Persuasion. Alternatively you learn one language of your choice.\n" +
                "\n" +
                "Fighting Spirit\n" +
                "Starting at 3rd level your intensity in battle can shield you and help you strike true." +
                "As a bonus action on your turn you can give yourself advantage on all weapon attack rolls until the end of the current turn. " +
                "When you do so you also gain 5 temporary hit points. The number of hit points increases when you reach certain levels in this class " +
                "increasing to 10 at 10th level and 15 at 15th level." +
                "You can use this feature three times. You regain all expended uses of it when you finish a long rest.\n" +
                ", \n" +
                "Elegant Courtier\n" +
                "Starting at 7th level your discipline and attention to detail allow you to excel in social situations. " +
                "Whenever you make a Charisma (Persuasion) check you gain a bonus to the check equal to your Wisdom modifier." +
                "Your self-control also causes you to gain proficiency in Wisdom saving throws. " +
                "If you already have this proficiency you instead gain proficiency in Intelligence of Charisma saving throws (your choice).\n" +
                ", \n" +
                "Tireless Spirit\n" +
                "Starting at 10th level when you roll initiative and have no uses of Fighting Spirit remaining you regain one use.\n" +
                ", \n" +
                "Rapid Strike\n" +
                "Starting at 15th level you learn to trade accuracy for swift strikes. If you take the Attack action on your turn and have advantage" +
                " on an attack roll against against one of the targets you can forgo the advantage for that roll to make an additional weapon attack" +
                " against that target as part of the same action. You can do so no more than once per turn.\n" +
                ", \n" +
                "Strength Before Death\n" +
                "Starting at 18th level your fighting spirit can delay the grasp of death. " +
                "If you take damage that reduces you to 0 hit points you can use your reaction to delay falling unconscious and you can immediately take an extra turn. " +
                "While you have 0 hit points during that extra turn taking damage causes death saving throw failures as normal and three death saving throw failures can still kill you. " +
                "When the extra turn ends you fall unconscious if you still have 0 hit points." +
                "Once you use this feature you can’t use it again until you finish a long rest.\n";
    }

    //endregion
}
