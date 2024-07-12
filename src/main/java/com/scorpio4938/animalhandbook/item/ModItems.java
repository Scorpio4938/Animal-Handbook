package com.scorpio4938.animalhandbook.item;

import com.scorpio4938.animalhandbook.AnimalHandbook;
import com.scorpio4938.animalhandbook.item.custom.Handbook;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ANIMAL_HANDBOOK = registerItems("animal_handbook", new Handbook(new FabricItemSettings().maxCount(1)));

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
