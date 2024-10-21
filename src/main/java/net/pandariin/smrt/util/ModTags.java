package net.pandariin.smrt.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.pandariin.smrt.SMRT;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(SMRT.MOD_ID, name));
        }

    }

    public static class Items {
        public static final TagKey<Item> TRASFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(SMRT.MOD_ID, name));
        }
    }


}