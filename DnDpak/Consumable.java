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
    public void use() {
        if(uses >= 1) {
            System.out.println("You use the " + name + " and it " + useAction);
            uses--;
        }
        if(uses == 0){
            System.out.println("The item was used up.");
        }
    }
}
