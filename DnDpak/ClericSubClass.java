package DnDpak;

public class ClericSubClass extends  Cleric {
    //region properties
    private DnDClass cleric;
    //endregion

    //region constructor
    public ClericSubClass(DnDClass cleric){
        super(cleric.GetLevel());
        this.cleric = cleric;
    }
    //endregion

    //region methods

    @Override
    public void SplitDisplayString() {
        cleric.SplitDisplayString();
    }
    @Override
    public String getClassFeatures() {
        return cleric.getClassFeatures();
    }

    @Override
    public String getDispClassFeats() {
        return cleric.getDispClassFeats();
    }

    @Override
    public String getSubClassFeatures() {
        return cleric.getSubClassFeatures();
    }

    @Override
    public void LevelUp() {
        cleric.LevelUp();
        SetLevel(GetLevel()+1);
    }

    @Override
    public String getDisplaySubClassFeatures() {
        return cleric.getDisplaySubClassFeatures();
    }
    //endregion

}
