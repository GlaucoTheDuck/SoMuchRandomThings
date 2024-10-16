package net.pandariin.smrt.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.sound.BlockSoundGroup;
import net.pandariin.smrt.SMRT;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static final Block PINK_GARNET_BLOCK = regiterBlock("pink_garnet_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .pistonBehavior(PistonBehavior.BLOCK)));

    private static final Block RAW_PINK_GARNET_BLOCK = regiterBlock("raw_pink_garnet_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .sounds(BlockSoundGroup.STONE)));

    private static Block regiterBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SMRT.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(SMRT.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SMRT.LOGGER.info("Registering Mod Blocks for " + SMRT.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(PINK_GARNET_BLOCK);
            entries.add(RAW_PINK_GARNET_BLOCK);
        });

    }
}
