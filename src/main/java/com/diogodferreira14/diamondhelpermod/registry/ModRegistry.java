package com.diogodferreira14.diamondhelpermod.registry;

import com.diogodferreira14.diamondhelpermod.block.DiamondHelperBlock;
import com.diogodferreira14.diamondhelpermod.item.DiamondHelperItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "diamondhelpermod");
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "diamondhelpermod");

    public static final RegistryObject<Block> DIAMOND_HELPER_BLOCK = BLOCKS.register("diamond_helper_block", DiamondHelperBlock::new);
    public static final RegistryObject<Item> DIAMOND_HELPER_ITEM = ITEMS.register("diamond_helper_item", () -> new BlockItem(DIAMOND_HELPER_BLOCK.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
