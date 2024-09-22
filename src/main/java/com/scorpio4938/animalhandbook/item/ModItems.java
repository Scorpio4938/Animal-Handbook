package com.scorpio4938.animalhandbook.item;

import com.scorpio4938.animalhandbook.AnimalHandbook;
import com.scorpio4938.animalhandbook.item.custom.HandbookItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // This will return a error message when running datagen, as it prints:
    // 'Caused by: java.lang.ExceptionInInitializerError
    // Caused by: java.lang.RuntimeException: Cannot load class net.minecraft.client.gui.screen.Screen in environment type SERVER',
    // which is probably caused by the call for the custom screen (although I've specified 'isClient' yet it somehow did not work, no idea what caused this).
    // For future action to runDatagen, it is insofar recommend to ture the following 'new HandBook()' to 'new Item()'.
    // Hoping to fix this issue.
    public static final Item ANIMAL_HANDBOOK = registerItems("animal_handbook", new HandbookItem(new FabricItemSettings().maxCount(1)));

    private static void addItemsToItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(ANIMAL_HANDBOOK);
    }

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AnimalHandbook.MOD_ID, name), item);
    }

    public static void registerModItems() {
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToItemGroup);
    }
}
