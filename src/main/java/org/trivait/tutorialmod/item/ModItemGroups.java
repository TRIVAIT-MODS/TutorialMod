package org.trivait.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.trivait.tutorialmod.TutorialMod;
import org.trivait.tutorialmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "item_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.RED_EMERALD))
                    .displayName(Text.translatable("itemgroup.tutorialmod.item_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_EMERALD);
                        entries.add(ModItems.CRUSHED_RED_EMERALD);
                        entries.add(Items.IRON_INGOT);
                        entries.add(ModBlocks.RAW_RED_EMERALD_BLOCK);
                        entries.add(ModBlocks.RED_EMERALD_BLOCK);
                    }).build());

    public static void register() {
        TutorialMod.LOGGER.info("ModItemGroups has been registered!");
    }
}
