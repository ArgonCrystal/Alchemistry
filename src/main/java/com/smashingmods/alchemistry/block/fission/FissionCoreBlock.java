package com.smashingmods.alchemistry.block.fission;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class FissionCoreBlock extends Block {

    public FissionCoreBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL).strength(2.0f));
    }
}