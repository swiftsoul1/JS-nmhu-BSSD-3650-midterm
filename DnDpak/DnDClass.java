package DnDpak;


public abstract class DnDClass {

    //region variables
    private int level, HP;
    private String classFeatures,dispClassFeats,
            classArchFeats, classArch, uChosenClass, dispArchString;
    //endregion

    //region constructor
    public DnDClass(String uChosenClass) {
        level = 1;
        classFeatures = "";
        classArchFeats = "";
        classArch = "";
        dispArchString = "";
        this.uChosenClass = uChosenClass;
        dispClassFeats = "";
    }
    //endregion

    //region abstract methods
    abstract public void LevelUp(String arch);

    abstract public void SplitDisplayArch();

    abstract public void SplitDisplayClass();
    //endregion

    //region gets/sets
    public int GetLevel(){
        return level;
    }

    public String getClassFeatures() {
        return classFeatures;
    }

    public String getClassArch() {
        return classArch;
    }
    
     public String getClassName(){
        return uChosenClass;
    }

    public int GetiHP(){
        return HP += HP;
    }

    public int GetHD() {
        return 0;
        //return HD;
    }

    public String getDispArchString(){return dispArchString;}

    public String getClassArchFeats() {
        return classArchFeats;
    }

    public String getDispClassFeats() {
        return dispClassFeats;
    }

    //sets
    public void setDispClassFeats(String dispClassFeats) {
        this.dispClassFeats = dispClassFeats;
    }

    public void setClassArchFeats(String classArchFeats) {
        this.classArchFeats = classArchFeats;
    }

    public void setClassArch(String classArch) {
        this.classArch = classArch;
    }

    public void setClassFeatures(String classFeatures) {
        this.classFeatures = classFeatures;
    }

    public void SetLevel(int level){
        this.level = level;
    }

    public void setiHP(int HP){
        this.HP += GetHD();
    }

    public void setDispArchString(String dispArchString) {
        this.dispArchString = dispArchString;
    }
    //endregion

}//class