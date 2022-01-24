package com.iartur221.greatbeast.entity.render;

import com.iartur221.greatbeast.GreatBeastMod;
import com.iartur221.greatbeast.entity.custom.GreatBeastEntity;
import com.iartur221.greatbeast.entity.models.GreatBeastModel;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GreatBeastRender extends MobRenderer<GreatBeastEntity, GreatBeastModel<GreatBeastEntity>> {
    protected static final ResourceLocation TEXTURE =
        new ResourceLocation(GreatBeastMod.MOD_ID, "textures/entity/greatbeast.png");

    public GreatBeastRender(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn, new GreatBeastModel(renderManagerIn.bakeLayer(GreatBeastModel.LAYER_LOCATION)), 4f);
    }

    @Override
    public ResourceLocation getTextureLocation(GreatBeastEntity entity) {
        return TEXTURE;
    }

}
