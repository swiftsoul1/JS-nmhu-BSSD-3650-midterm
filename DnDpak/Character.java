package DnDpak;

import java.util.*;

public class Character {
    
    //region properties
    private String name;
    private int allLevels;
    private List<DnDClass> mClasses;
    private  List<InventoryItem> items;
    //endregion

    //region constructor
    public Character(String name, DnDClass first) {
        this.name = name;
        allLevels = 0;
        mClasses = new ArrayList<DnDClass>();
        items = new ArrayList<InventoryItem>();
        AddDnDClass(first);
    }
    //endregion

    //region methods
    public String useItem(int i) {
        return items.get(i).use();
    }
    public  void dropItem(int i){
        items.remove(i);
    }

    //multiclassing
    public void LevelUp(DnDClass ddc){
        AddDnDClass(ddc);
    }
    //level existing class
    public void LevelUp(int i){
        mClasses.get(i).LevelUp();
    }

    //private methods
    private void AddDnDClass(DnDClass ddc){
        mClasses.add(ddc);
        SetAllLevels();
    }
    private void SetAllLevels(){
        allLevels = 0;
        for (DnDClass mc:mClasses) {
            allLevels += mc.GetLevel();
        }
    }
    //endregion
}
