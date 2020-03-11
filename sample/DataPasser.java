package sample;

public class DataPasser {

    private static DataPasser INSTANCE;
    private String name, className, subClassName;

    private DataPasser() {
    }

    public static DataPasser getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DataPasser();
        }
        return INSTANCE;
    }


    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public String getSubClassName() {
        return subClassName;
    }

    public void setSubClassName(String subClassName) {
        this.subClassName = subClassName;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setName(String name) {
        this.name = name;
    }
}
