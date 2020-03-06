package DnDpak;

public class Necromancy extends WizardSubClass {
    public Necromancy(Wizard wiz) {
        super(wiz);
        super.SplitDisplayString();
    }

    @Override
    public String getSubClassFeatures() {
        return "School of Necromancy\n" +
                "\n" +
                "Necromancy Savant\n" +
                "Beginning when you select this school at 2nd level the gold and time you must spend to copy a necromancy spell into your spellbook is halved.\n" +
                "\n" +
                "Grim Harvest\n" +
                "At 2nd level you gain the ability to reap life energy from creatures you kill with your spells. \n" +
                "Once per turn when you kill one or more creatures with a spell of 1st level or higher\n" +
                "you regain hit points equal to twice the spell’s level\n" +
                "or three times its level if the spell belongs to the School of Necromancy. \n" +
                "You don’t gain this benefit for killing constructs or undead.\n" +
                ",\n" +
                "Undead Thralls\n" +
                "At 6th level, you add the animate dead spell to your spellbook if it is not there already. \n" +
                "When you cast animate dead you can target one additional corpse or pile of bones creating another zombie or skeleton as appropriate.\n" +
                "Whenever you create an undead using a necromancy spell, it has additional benefits:\n" +
                "The creature’s hit point maximum is increased by an amount equal to your wizard level.\n" +
                "The creature adds your proficiency bonus to its weapon damage rolls.\n" +
                ",\n" +
                "Inured to Undeath\n" +
                "Beginning at 10th level you have resistance to necrotic damage and your hit point maximum can't be reduced.\n" +
                "You have spent so much time dealing with undead and the forces that animate them that you have become inured to some of their worst effects.\n" +
                ",\n" +
                "Command Undead\n" +
                "Starting at 14th level you can use magic to bring undead under your control even those created by other wizards.\n" +
                "As an action you can choose one undead that you can see within 60 feet of you. \n" +
                "That creature must make a Charisma saving throw against your wizard spell save DC. \n" +
                "If it succeeds you can’t use this feature on it again. If it fails\n" +
                "it becomes friendly to you and obeys your commands until you use this feature again.\n" +
                "Intelligent undead are harder to control in this way. If the target has an Intelligence of 8 or higher\n" +
                "it has advantage on the saving throw. If it fails the saving throw and has an Intelligence of 12 or higher\n" +
                "it can repeat the saving throw at the end of every hour until it succeeds and breaks free.\n";
    }
}
