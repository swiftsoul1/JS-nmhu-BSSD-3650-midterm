package DnDpak;

public class DeathDomain extends ClericSubClass {
    //region constructor
    public DeathDomain(DnDClass cleric) {
        super(cleric);
    }
    //endregion

    //region methods
    @Override
    public String getSubClassFeatures() {
        return super.getSubClassFeatures() + "Death Domain\n" +
                "Death Domain Spells\n" +
                "Cleric Level Spells\n" +
                "1st False Life Ray of Sickness\n" +
                "3rd Blindness/Deafness Ray of Enfeeblement\n" +
                "5th Animate Dead Vampiric Touch\n" +
                "7th Blight Death Ward\n" +
                "9th Antilife Shell Cloudkill\n" +
                "\n"+
                "Bonus Proficiency\n" +
                "When you choose this domain at 1st level you gain proficiency with martial weapons.\n" +
                "\n"+
                "Reaper\n" +
                "At 1st level you learn one necromancy cantrip of your choice from any spell list. When you cast a necromancy cantrip that normally targets only one creature" +
                " the spell can instead target two creatures within range and within 5 feet of each other.\n" +
                ", \n"+
                "Channel Divinity: Touch of Death\n" +
                "Starting at 2nd level you can use Channel Divinity to destroy another creature's life force by touch. When you hit a creature with a melee attack" +
                " you can use Channel Divinity to deal extra necrotic damage to the target. The damage equals 5 + twice your cleric level.\n" +
                ", \n" +
                "Inescapable Destruction\n" +
                "Starting at 6th level your ability to channel negative energy becomes more potent. Necrotic damage dealt by your cleric spells and Channel Divinity options ignores resistance " +
                "to necrotic damage.\n" +
                ", \n" +
                "Divine Strike\n" +
                "At 8th level you gain the ability to infuse your weapon strikes with necrotic energy. Once on each of your turns when you hit a creature with a weapon attack " +
                "you can cause the attack to deal an a 1d8 necrotic damage to the target. When you reach 14th level the extra damage increases to 2d8.\n" +
                ", \n" +
                "Improved Reaper\n" +
                "Starting at 17th level when you cast a necromancy spell of 1st through 5th level that targets only one creature " +
                "the spell can instead target two creatures within range and within 5 feet of each other. If the spell consumes its material components you must provide them for each target.\n";
    }
    //endregion
}
