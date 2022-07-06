package com.iartur221.greatbeast.block;

import java.util.function.Supplier;

import com.iartur221.greatbeast.GreatBeastMod;
import com.iartur221.greatbeast.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//class registering the blocks ingame
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = 
            DeferredRegister.create(ForgeRegistries.BLOCKS, GreatBeastMod.MOD_ID);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    //Instantiate blocks
    public static final RegistryObject<Block> UKINUM_ORE = registerBlock(
        "ukinum_ore", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(1f)), CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> DEMON_GRASS = registerBlock(
        "demon_grass", () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> DEMON_SAND = registerBlock(
        "demon_sand", () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength(3f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> CURSED_BLOCK = registerBlock(
        "cursed_block", () -> new Block(BlockBehaviour.Properties.of(Material.PORTAL).strength(6f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);

    //whatever T is it must extend block class, registers block as an in-game block
    private static <T extends Block> RegistryObject<T> registerBlock(
        String name, Supplier<T> block, CreativeModeTab tab)
        {
            RegistryObject<T> toReturn = BLOCKS.register(name, block);
            registerBlockItem(name, toReturn, tab);
            return toReturn;
        }

    //registers item associated with a block (in backpack etc)
    private static <T extends Block>RegistryObject<Item> registerBlockItem(
        String name, RegistryObject<T> block, CreativeModeTab tab) 
        {
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), 
                new Item.Properties().tab(tab)));
        }
    
}
