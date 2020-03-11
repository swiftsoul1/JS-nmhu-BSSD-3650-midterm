package DnDpak;


public interface DnDClass {

    //region abstract methods
    abstract public void LevelUp();

    abstract public String getSubClassFeatures();

    abstract public void SplitDisplayString();

    abstract String getImgUrl();

    abstract String getSubImgUrl();
    //endregion

    //region accessors
    //gets
    abstract public int GetLevel();

    abstract public String getClassFeatures();

    abstract public String getDispClassFeats();

    abstract public String getDisplaySubClassFeatures();
    //sets
    abstract public void setDispClassFeats(String dispClassFeats);

    abstract public void SetLevel(int level);
    //endregion

}//class