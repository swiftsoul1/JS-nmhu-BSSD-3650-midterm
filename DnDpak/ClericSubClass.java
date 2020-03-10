package DnDpak;

public class ClericSubClass extends  Cleric {
    //region properties
    private DnDClass cleric;
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
        cleric.SplitDisplayString();
    }

    @Override
    public String getSubClassFeatures() {
        return cleric.getSubClassFeatures();
    }

    @Override
    public void LevelUp() {
        cleric.LevelUp();
    }

    @Override
    public String getDisplaySubClassFeatures() {
        return cleric.getDisplaySubClassFeatures();
    }
    //endregion

}