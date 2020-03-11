package DnDpak;

public class Weapon implements InventoryItem {

    private String name;
    private int dieAmount, dieType;

    public Weapon(String name, int dieAmount, int dieType) {
        this.name = name;
        this.dieAmount = dieAmount;
        this.dieType = dieType;
    }

    @Override
    public String use() {
        return swing();
    }

    @Override
    public String getName() {
        return name;
    }

    public String swing(){
        return ("You swing your " + name + " for " + dieAmount+"d"+dieType);
    }
}
