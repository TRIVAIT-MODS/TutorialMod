package org.trivait.tutorialmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.trivait.tutorialmod.TutorialMod;

public class ModItems {

    public static final Item RED_EMERALD = registerItem("red_emerald", new Item(new Item.Settings()));
    public static final Item CRUSHED_RED_EMERALD = registerItem("crushed_red_emerald", new Item(new Item.Settings()));

    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, id), item);
    }

    public static void register() {
        TutorialMod.LOGGER.info("ModItems has been registered!");
    }
}
