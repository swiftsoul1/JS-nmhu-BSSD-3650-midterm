package DnDpak;

public class Champion extends FighterSubClass {

    private String displaySubClassFeatures;
    private final String SubImgUrl = "C:\\Users\\Jonah\\Desktop\\Patterns-nmhu\\midterm\\JS-nmhu-BSSD-3650-midterm\\DnDpak\\Characters\\champion.png";

    //region constructor
    public Champion(DnDClass fighter) {
        super(fighter);
    }
    //endregion

    //region methods
    @Override
    public String getSubClassFeatures() {
        //append to supers method
        return super.getSubClassFeatures() + "Champion\n" +
                "Improved Critical\n" +
                "Beginning when you choose this archetype at 3rd Level your weapon attacks score a critical hit on a roll of 19 or 20.\n" +
                ", \n" +
                "Remarkable Athlete\n" +
                "Starting at 7th level you can add half your Proficiency Bonus (round up) to any Strength Dexterity or Constitution check you make that doesn’t already use your Proficiency Bonus." +
                "In addition when you make a running long jump the distance you can cover increases by a number of feet equal to your Strength modifier.\n" +
                ",\n" +
                "Additional Fighting Style\n" +
                "At 10th level you can choose a second option from the Fighting Style class feature.\n" +
                ",\n" +
                "Superior Critical\n" +
                "Starting at 15th level your weapon attacks score a critical hit on a roll of 18–20.\n" +
                ",\n" +
                "Survivor\n" +
                "At 18th level you attain the pinnacle of resilience in battle. At the start of each of your turns you regain Hit Points equal to 5 + your Constitution modifier if you have no more than half of your Hit Points left. " +
                "You don’t gain this benefit if you have 0 Hit Points.";
    }
    //endregion
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
    public  String getSubImgUrl(){return SubImgUrl;}
}
