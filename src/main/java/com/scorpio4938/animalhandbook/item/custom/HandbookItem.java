package com.scorpio4938.animalhandbook.item.custom;

import com.scorpio4938.animalhandbook.gui.screen.CustomBookScreen;
import com.scorpio4938.animalhandbook.gui.screen.tries.CustomBookScreenHandlerFactory;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class HandbookItem extends Item {
    public HandbookItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // Open custom screen here
        if (world.isClient) {
//            MinecraftClient.getInstance().setScreen(new BookScreen());
//            MinecraftClient.getInstance().setScreenAndRender(new CustomBookScreen(user.getInventory(), user.getStackInHand(hand))); // 1st screen
//            MinecraftClient.getInstance().setScreenAndRender(new BookScreen());
            user.openHandledScreen(new CustomBookScreenHandlerFactory()); // 2nd screen
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
