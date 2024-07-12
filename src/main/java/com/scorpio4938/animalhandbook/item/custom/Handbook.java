package com.scorpio4938.animalhandbook.item.custom;

import com.scorpio4938.animalhandbook.gui.screen.CustomBookScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.BookScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Handbook extends Item {
    public Handbook(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // Open custom screen here
        if (world.isClient) {
//            MinecraftClient.getInstance().setScreen(new BookScreen());
            MinecraftClient.getInstance().setScreenAndRender(new CustomBookScreen(user.getInventory(), user.getStackInHand(hand)));
//            MinecraftClient.getInstance().setScreenAndRender(new BookScreen());

        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
