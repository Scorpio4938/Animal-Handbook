package com.scorpio4938.animalhandbook.item;

import com.scorpio4938.animalhandbook.AnimalHandbook;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ANIMALHANDBOOK_TOOLS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AnimalHandbook.MOD_ID, "animalhandbook_tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.animalhandbook_tools"))
                    .icon(() -> new ItemStack(ModItems.ANIMAL_HANDBOOK)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.ANIMAL_HANDBOOK);
                    })).build());

    public static void registerModItemGroup() {
        
    }
}
