package com.scorpio4938.animalhandbook.service.reader;

import com.scorpio4938.animalhandbook.service.debug.DebugHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EntityTypeReader {
    private static Map<String, EntityType<?>> entityInfoList = new HashMap<>();
    private static final String[] BLACK_LIST = {"minecraft:armor_stand"};

    public static void init() {
        read();
//        DebugHandler.printDebug(entityInfoList.toString());
    }

    private static void read() {

        // Iterate over all registered entity types
        for (EntityType<?> entityType : Registries.ENTITY_TYPE) {
            // Convert entity information to string
//            String entityInfo = "ID: " + Registry.ENTITY_TYPE.getId(entityType) +
//                    ", Name: " + entityType.getName().getString() +
//                    ", Class: " + entityType.getBaseClass().getSimpleName();

            // Add to the list (id, entityType class)
            entityInfoList.put(Registries.ENTITY_TYPE.getId(entityType).toString(), entityType);

            // Debug info
//            DebugHandler.printDebug(Registries.ENTITY_TYPE.getId(entityType).toString());
//            DebugHandler.printDebug(entityType.getName().getString());
//            DebugHandler.printDebug(entityType.getRequiredFeatures().getClass().getName());
//            DebugHandler.printDebug(entityType.getBaseClass().getSimpleName());
        }
        DebugHandler.printDebug("Added all entity types");
    }

    private static boolean isInBlackList(String id) {
        for (String e : BLACK_LIST) {
            if (Objects.equals(id, e)) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, EntityType<?>> getEntityTypes() {
        return entityInfoList;
    }
}
