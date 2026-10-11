package com.diogodferreira14.diamondhelpermod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class DiamondHelperBlock extends Block {
    public DiamondHelperBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE).strength(5.0f, 6.0f));
    }
}
