package com.scorpio4938.animalhandbook.gui.screen.tries;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import org.jetbrains.annotations.Nullable;

public class CustomBookScreenHandler extends ScreenHandler {


    protected CustomBookScreenHandler(int syncId, PlayerInventory inventory) {
//        super(type, syncId);
        super(ScreenHandlerType.GENERIC_9X3, syncId);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }
}
