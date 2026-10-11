package com.diogodferreira14.diamondhelpermod.menu;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;

public class DiamondHelperContainerMenu extends AbstractContainerMenu {
    public DiamondHelperContainerMenu(int id, Inventory inventory) {
        super(MenuType.GENERIC_9x3, id);
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }
}
