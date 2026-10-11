package com.diogodferreira14.diamondhelpermod.event;

import com.diogodferreira14.diamondhelpermod.menu.DiamondHelperMenu;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "diamondhelpermod")
public class DiamondHelperEventHandler {
    @SubscribeEvent
    public static void onPlayerInteract(PlayerInteractEvent.RightClickBlock event) {
        Player player = event.getEntity();
        Level level = event.getLevel();
        InteractionHand hand = event.getHand();

        if (!level.isClientSide && player instanceof ServerPlayer serverPlayer) {
            if (event.getItemStack().getItem() == ModRegistry.DIAMOND_HELPER_ITEM.get()) {
                serverPlayer.openMenu(new DiamondHelperMenu());
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.SUCCESS);
            }
        }
    }
}
