package DnDpak;

public class MagicItem implements InventoryItem {

    private String name, useAction;

    public MagicItem(String name, String useAction) {
        this.name = name;
        this.useAction = useAction;
    }

    @Override
    public String use() {
        return ("You use your " + name + " and it " + useAction);
    }
}
