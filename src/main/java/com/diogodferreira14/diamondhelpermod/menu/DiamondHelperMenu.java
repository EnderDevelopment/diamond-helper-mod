package com.diogodferreira14.diamondhelpermod.menu;

import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;

public class DiamondHelperMenu implements MenuProvider {
    @Override
    public Component getDisplayName() {
        return Component.translatable("gui.diamondhelpermod.menu_title");
    }

    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new DiamondHelperContainerMenu(id, inventory);
    }
}
