package DnDpak;

import java.util.List;

public class ItemMaker {
    private InventoryItem healingPotion, scroll, greatsword, longsword, staffOfFire, ringOfInvisibility;

    public ItemMaker() {
        healingPotion = new Consumable("Potion of Healing", "restores 1d4+4 health as you drink it", 3);
        scroll = new Consumable("Scroll of Witchbolt", "Casts Level 1 Witchbolt for 1d12 damage", 1);
        greatsword = new Weapon("Greatsword",2,6);
        longsword = new Weapon("Longsword",1,8);
        staffOfFire = new MagicItem("Staff of Fire", " hits a target for 8d6 fire damage on a failed save, or half as much damage on a successful one.");
        ringOfInvisibility = new MagicItem("Ring of Invisibility", "Makes you turn invisible while you are wearing it.");
    }

    public InventoryItem MakeHealingPotion(){
        return healingPotion;
    }
    public InventoryItem MakeScroll(){
        return scroll;
    }
    public InventoryItem MakeGreatsword(){
        return greatsword;
    }
    public InventoryItem MakeLongsword(){
        return longsword;
    }
    public InventoryItem MakeStaffOfFire(){
        return staffOfFire;
    }
    public InventoryItem MakeRingOfInvisibility(){
        return ringOfInvisibility;
    }
}
