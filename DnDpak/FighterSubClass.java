package DnDpak;

public class FighterSubClass extends Fighter {

    //region properties
    private DnDClass fighter;
    private String displaySubClassFeatures;
    //endregion

    //region constructor
    public FighterSubClass(DnDClass fighter){
        super(fighter.GetLevel());
        this.fighter = fighter;
        SplitDisplayString();
    }
    //endregion

    //region methods

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
    public String getSubClassFeatures() {
        return fighter.getSubClassFeatures();
    }

    @Override
    public String getDisplaySubClassFeatures() {
        return displaySubClassFeatures;
    }
    //endregion

}
