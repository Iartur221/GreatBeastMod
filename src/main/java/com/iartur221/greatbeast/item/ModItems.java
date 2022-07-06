package com.iartur221.greatbeast.item;

import com.iartur221.greatbeast.GreatBeastMod;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.iartur221.greatbeast.entity.ModEntityTypes;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = 
    DeferredRegister.create(ForgeRegistries.ITEMS, GreatBeastMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    // damage, speed modifier
    public static final RegistryObject<Item> NISZCZYCIEL = ITEMS.register("niszczyciel",
    () -> new SwordItem(Tiers.NETHERITE, 40, 3.0f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> KREMOWKA = ITEMS.register("kremowka",
    () -> new ForgeSpawnEggItem(ModEntityTypes.GREATBEAST, 0xff0000, 0x00ff00, new Item.Properties().stacksTo(1)
        .food(new FoodProperties.Builder().alwaysEat().build()).tab(CreativeModeTab.TAB_FOOD)));

    

}
