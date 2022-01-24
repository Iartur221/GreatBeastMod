package com.iartur221.greatbeast.events;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.iartur221.greatbeast.GreatBeastMod;
import com.iartur221.greatbeast.entity.ModEntityTypes;
import com.iartur221.greatbeast.entity.custom.GreatBeastEntity;
import com.iartur221.greatbeast.entity.models.GreatBeastModel;
import com.iartur221.greatbeast.entity.render.GreatBeastRender;

@Mod.EventBusSubscriber(modid = GreatBeastMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.GREATBEAST.get(), GreatBeastEntity.prepareattributes().build());
    }
    
    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(GreatBeastModel.LAYER_LOCATION, GreatBeastModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void onRegisterRenderer(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.GREATBEAST.get(), GreatBeastRender::new);
    }
}