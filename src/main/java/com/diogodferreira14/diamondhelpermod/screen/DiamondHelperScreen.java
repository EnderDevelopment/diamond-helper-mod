package com.diogodferreira14.diamondhelpermod.screen;

import com.diogodferreira14.diamondhelpermod.menu.DiamondHelperContainerMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class DiamondHelperScreen extends AbstractContainerScreen<DiamondHelperContainerMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("diamondhelpermod", "textures/gui/diamond_helper_menu.png");

    public DiamondHelperScreen(DiamondHelperContainerMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {
        guiGraphics.blit(TEXTURE, leftPos, topPos, 0, 0, imageWidth, imageHeight);
    }

    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        guiGraphics.drawString(font, title, titleLabelX, titleLabelY, 0x404040);
    }
}
