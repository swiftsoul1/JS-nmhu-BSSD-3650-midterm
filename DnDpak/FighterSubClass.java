package DnDpak;

public class FighterSubClass extends Fighter {

    //region properties
    private DnDClass fighter;
    //endregion

    //region constructor
    public FighterSubClass(DnDClass fighter){
        super(fighter.GetLevel());
        this.fighter = fighter;
    }
    //endregion

    //region methods


    @Override
    public String getClassFeatures() {
        return fighter.getClassFeatures();
    }

    @Override
    public String getDispClassFeats() {
        return fighter.getDispClassFeats();
    }

    @Override
    public void LevelUp() {
        fighter.LevelUp();
        SetLevel(GetLevel()+1);
    }

    @Override
    public void SplitDisplayString() {
        fighter.SplitDisplayString();
    }

    @Override
    public String getSubClassFeatures() {
        return fighter.getSubClassFeatures();
    }

    @Override
    public String getDisplaySubClassFeatures() {
        return fighter.getDisplaySubClassFeatures();
    }

    //endregion

}
