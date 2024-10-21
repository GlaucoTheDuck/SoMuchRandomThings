package net.pandariin.smrt.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pandariin.smrt.SMRT;
import net.pandariin.smrt.items.custom.ChiselItem;

import java.util.List;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item CHISEL =  registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    public static final Item STARLIGHTASHES = registerItem("starlight_ashes", new Item(new Item.Settings()));
    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponent.CAULIFLOWER)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {

            tooltip.add(Text.translatable("tooltip.smrt.cauliflower.l1"));

            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(SMRT.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SMRT.LOGGER.info("Registering Mod Items for " + SMRT.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);

            entries.add(ModItems.STARLIGHTASHES);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(CAULIFLOWER);
        });
    }
}
