package com.scorpio4938.animalhandbook.service.reader.modules.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.server.world.ServerWorld;

import java.util.ArrayList;
import java.util.List;

public class AnimalDataEventListener {
    public static void register() {
//        ServerEntityEvents.ENTITY_LOAD.register(AnimalDataEventListener::onEntityLoad);
    }

    private static void onEntityLoad(EntityType entityType, ServerWorld world) {
//        if (entityType instanceof AnimalEntity) {
        // Process animal data.
        processAnimalData();
//        }
    }

    private static void processAnimalData() {
        List<String> DataList = new ArrayList<>();

        // Retrieve animal data and convert it.
//        EntityType<?> type = entityType.getType();
//        String entityType = type.toString();
//        String animalName = entityType.getName().getString();
//        double health = entityType.getHealth();
//        String position = entity.getBlockPos().toShortString();
//        List<EntityType>

//        DataList.add(entityType);
    }
}
