package DnDpak;


public interface DnDClass {


    //region abstract methods
    abstract public void LevelUp();

    abstract public void SplitDisplayString();
    //endregion

    //region accessors
    //gets
    abstract public int GetLevel();

    abstract public String getClassFeatures();

    abstract public String getDispClassFeats();

    abstract public String getSubClassFeatures();

    abstract public String getDisplaySubClassFeatures();
    //sets
    abstract public void setDispClassFeats(String dispClassFeats);

    abstract public void SetLevel(int level);
    //endregion

}//class