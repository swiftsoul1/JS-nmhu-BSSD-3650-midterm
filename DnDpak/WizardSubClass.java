package DnDpak;

public class WizardSubClass extends Wizard {

    //region properties
    private DnDClass wizard;//self ref
    //endregion

    //region constructor(s)
    public WizardSubClass(DnDClass wiz) {
        super(wiz.GetLevel());
        wizard = wiz;
    }
    //endregion

    //region methods
    @Override
    public void SplitDisplayString() {
        //call super
        wizard.SplitDisplayString();
    }

    @Override
    public String getClassFeatures() {
        return wizard.getClassFeatures();
    }

    @Override
    public String getDispClassFeats() {
        return wizard.getDispClassFeats();
    }
    @Override
    public String getSubClassFeatures(){
        return wizard.getSubClassFeatures();
    }

    @Override
    public void LevelUp() {
        wizard.LevelUp();
        SetLevel(GetLevel()+1);
    }

    @Override
    public String getDisplaySubClassFeatures() {
        return wizard.getDisplaySubClassFeatures();
    }

    //endregion

}//class
