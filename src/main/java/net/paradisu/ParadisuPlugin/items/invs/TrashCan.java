package net.paradisu.ParadisuPlugin.items.invs;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.paradisu.ParadisuPlugin.ParadisuMain;
import net.paradisu.ParadisuPlugin.items.common.menu.BlankItem;
import net.paradisu.ParadisuPlugin.items.models.ModelItemManager;
import net.paradisu.ParadisuPlugin.util.InventoryGUI;

public class TrashCan implements InventoryGUI{

    String cmdprefix;
    String cmdemph;

    public TrashCan(){
        cmdprefix = ParadisuMain.CommandPrefix();
        cmdemph = ParadisuMain.CommandEmph();
    }

    @Override
    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, 36, "§3✮ §dTRASHCAN §3✮");

        for(int i=27; i<36; i++)
            inv.setItem(i, new BlankItem());

        inv.setItem(35, ModelItemManager.createPropModel(24));
        return inv;
    }

    @Override
    public void onGUIClick(Player whoClicked, int slot, ItemStack clickedItem) {
        
        
    }
}
