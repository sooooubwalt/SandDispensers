package com.example;

import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ItemDispenserBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPointer;

public class SandDispenserBehavior extends ItemDispenserBehavior {
    @Override
    protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
        EntityType.FALLING_BLOCK.spawn(pointer.world(), pointer.pos().offset(pointer.state().get(DispenserBlock.FACING)), SpawnReason.DISPENSER);

        stack.decrement(1);
        return stack;
    }
}
