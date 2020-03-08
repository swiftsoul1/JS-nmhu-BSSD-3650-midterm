package DnDpak;

public class WizardSubClass extends Wizard {

    //region properties
    private DnDClass wizard;//self ref
    private String displaySubClassFeatures;
    //endregion

    //region constructor(s)
    public WizardSubClass(DnDClass wiz) {
        super(wiz.GetLevel());
        wizard = wiz;
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
    public String getSubClassFeatures(){
        return wizard.getSubClassFeatures();
    }
    @Override
    public String getDisplaySubClassFeatures() {
        return displaySubClassFeatures;
    }
    //endregion

}//class
