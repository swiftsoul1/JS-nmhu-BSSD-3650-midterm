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
    public void use() {
        swing();
    }

    public void swing(){
        System.out.println("You swing your " + name + " for " + dieAmount+"d"+dieType);
    }
}
