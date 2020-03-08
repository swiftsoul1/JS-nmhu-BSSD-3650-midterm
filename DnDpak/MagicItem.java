package DnDpak;

public class MagicItem implements InventoryItem {

    private String name, useAction;

    public MagicItem(String name, String useAction) {
        this.name = name;
        this.useAction = useAction;
    }

    @Override
    public void use() {
        System.out.println("You use your " + name + " and it " + useAction);
    }
}
