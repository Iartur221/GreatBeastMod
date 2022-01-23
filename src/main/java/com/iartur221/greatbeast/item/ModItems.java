package com.iartur221.greatbeast.item;

import com.iartur221.greatbeast.GreatBeastMod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = 
    DeferredRegister.create(ForgeRegistries.ITEMS, GreatBeastMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> KREMOWKA = ITEMS.register("kremowka",
    () -> new Item(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_FOOD)));

}
