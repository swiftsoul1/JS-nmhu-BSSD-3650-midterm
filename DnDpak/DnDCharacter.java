package DnDpak;

import java.util.*;

public class DnDCharacter {

    //region properties
    private String name;
    private int allLevels;
    private List<DnDClass> mClasses;
    private  List<InventoryItem> items;
    //endregion

    //region constructor
    public DnDCharacter(String name, DnDClass first) {
        this.name = name;
        allLevels = 0;
        mClasses = new ArrayList<DnDClass>();
        items = new ArrayList<InventoryItem>();
        AddDnDClass(first);
    }
    //endregion

    //region methods
    public String UseItem(int i) {
        return items.get(i).use();
    }
    public  void DropItem(int i){
        items.remove(i);
    }

    public int getAllLevels() {
        return allLevels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InventoryItem> getItems() {
        return items;
    }

    public void AddItem(InventoryItem item){items.add(item);}

    //multiclassing
    public void LevelUp(DnDClass ddc){
        if(allLevels < 20) {
            AddDnDClass(ddc);
        }
    }
    //level existing class
    public void LevelUp(int i){
        if (allLevels < 20){
        mClasses.get(i).LevelUp();
        SetAllLevels();
        }
    }
    public DnDClass GetClass(int i){
        if(i < mClasses.size()) {
            return mClasses.get(i);
        }
        return null;
    }

    //private methods
    private void AddDnDClass(DnDClass ddc){
        mClasses.add(ddc);
        SetAllLevels();
    }
    private void SetAllLevels() {
        allLevels = 0;
        for (DnDClass mc : mClasses) {
            allLevels += mc.GetLevel();
        }
    }

    public List<DnDClass> getmClasses() {
        return mClasses;
    }
    //endregion
}
