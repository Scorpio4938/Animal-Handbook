package com.scorpio4938.animalhandbook.service.reader;

import com.scorpio4938.animalhandbook.service.debug.DebugHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;

import java.util.ArrayList;
import java.util.List;

public class EntityTypeReader {
    public static void init() {
        reader();

    }

    public static void reader() {
        List<String> entityInfoList = new ArrayList<>();

        // Iterate over all registered entity types
        for (EntityType<?> entityType : Registries.ENTITY_TYPE) {
            // Convert entity information to string
//            String entityInfo = "ID: " + Registry.ENTITY_TYPE.getId(entityType) +
//                    ", Name: " + entityType.getName().getString() +
//                    ", Class: " + entityType.getBaseClass().getSimpleName();

            // Add to the list
//            entityInfoList.add(entityInfo);

            // Debug info
            DebugHandler.printDebug(Registries.ENTITY_TYPE.getId(entityType).toString());
            DebugHandler.printDebug(entityType.getName().getString());
            DebugHandler.printDebug(entityType.getBaseClass().getSimpleName());
        }
    }
}
