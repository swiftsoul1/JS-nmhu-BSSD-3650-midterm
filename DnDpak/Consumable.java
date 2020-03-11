package DnDpak;

public class Consumable implements InventoryItem {
    private int uses;
    private String name, useAction;

    public Consumable(String name, String useAction, int uses) {
        this.name = name;
        this.useAction = useAction;
        this.uses = uses;
    }

    @Override
    public String use() {
        String outStr ="";
        if(uses >= 1) {
            outStr = "You use the " + name + " and it " + useAction;
            uses--;
            if(uses == 0){
                outStr += "The item was used up.";
            }
        }
        if(uses == 0){
            outStr =  "The item was used up.";
        }
        return outStr;
    }
    @Override
    public String getName() {
        return name;
    }

}
