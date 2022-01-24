package com.iartur221.greatbeast.entity;

import com.iartur221.greatbeast.GreatBeastMod;
import com.iartur221.greatbeast.entity.custom.GreatBeastEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModEntityTypes {
    //adding mobs to registry
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES 
    = DeferredRegister.create(ForgeRegistries.ENTITIES, GreatBeastMod.MOD_ID);

    public static final RegistryObject<EntityType<GreatBeastEntity>> GREATBEAST = 
        ENTITY_TYPES.register("greatbeast", () -> EntityType.Builder.of(GreatBeastEntity::new, 
                MobCategory.MONSTER).sized(3f, 3f)
                    .build(new ResourceLocation(GreatBeastMod.MOD_ID, "greatbeast").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
