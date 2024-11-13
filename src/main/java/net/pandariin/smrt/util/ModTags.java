package net.pandariin.smrt.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.pandariin.smrt.SMRT;

public class ModTags {
    public static class Blocks {
        public static TagKey<Block> NEED_PINK_GARNET_TOOL = createTag("need_pink_garnet_tool");
        public static TagKey<Block> INCORRECT_FOR_PINK_GARNET_TOOL = createTag("incorrect_for_pink_garnet_tool");

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
