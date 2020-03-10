package DnDpak;

public class Conjuration extends WizardSubClass {

    public String displaySubClassFeatures;

    //region constructor
    public Conjuration(DnDClass wiz) {
        //call super
        super(wiz);
        SplitDisplayString();
    }
    //endregion

    //region methods
    @Override
    public String getSubClassFeatures() {
        //append to supers method
        return (super.getSubClassFeatures() +"School of Conjuration\n" +
                "Conjuration Savant\n" +
                "Beginning when you select this school at 2nd level the gold and time you must spend to copy a Conjuration spell into your spellbook is halved.\n" +
                "\n" +
                "Minor Conjuration\n" +
                "Starting at 2nd level when you select this school " +
                "you can use your action to conjure up an inanimate object in your hand " +
                "or on the ground in an unoccupied space that you can see within 10 feet of you. " +
                "This object can be no larger than 3 feet on a side and weigh no more than 10 pounds " +
                "and its form must be that of a nonmagical object that you have seen. " +
                "The object is visibly magical radiating dim light out to 5 feet. " +
                "The object disappears after 1 hour when you use this feature again or if it takes any damage.\n" +
                "\n," +
                "Benign Transportation\n" +
                "Starting at 6th level you can use your action to teleport up to 30 feet to an unoccupied space that you can see. " +
                "Alternatively you can choose a space within range that is occupied by a Small or Medium creature. " +
                "If that creature is willing you both teleport swapping places. " +
                "Once you use this feature you can't use it again until you finish a long rest " +
                "or you cast a conjuration spell of 1st level or higher.\n" +
                "\n," +
                "Focused Conjuration\n" +
                "Beginning at 10th level while you are concentrating on a conjuration spell " +
                "your concentration can't be broken as a result of taking damage.\n" +
                "\n," +
                "Durable Summons\n" +
                "Starting at 14th level any creature that you summon or create with a conjuration spell has 30 temporary hit points.");
    }
    @Override
    public void SplitDisplayString() {
        //call super
        super.SplitDisplayString();
        //split up current abilities from all abilities
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

    //endregion
}

