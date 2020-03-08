package DnDpak;

public class ClericSubClass extends  Cleric {
    //region properties
    private DnDClass cleric;
    private String displaySubClassFeatures;
    //endregion

    //region constructor
    public ClericSubClass(DnDClass cleric){
        super(cleric.GetLevel());
        this.cleric = cleric;
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
    public String getSubClassFeatures() {
        return cleric.getSubClassFeatures();
    }
    @Override
    public String getDisplaySubClassFeatures() {
        return displaySubClassFeatures;
    }
    //endregion

}
