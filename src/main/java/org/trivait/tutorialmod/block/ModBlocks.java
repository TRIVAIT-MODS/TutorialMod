package org.trivait.tutorialmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.trivait.tutorialmod.TutorialMod;

public class ModBlocks {

    public static Block RED_EMERALD_BLOCK = registerBlock("red_emerald_block", new Block(AbstractBlock.Settings.create()
            .strength(1f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static Block RAW_RED_EMERALD_BLOCK = registerBlock("raw_red_emerald_block", new Block(AbstractBlock.Settings.create()
            .strength(1f)
            .sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String id, Block block) {
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, id), block);
    }

    private static void registerBlockItem(String id, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }

    public static void register() {
        TutorialMod.LOGGER.info("ModBlocks has been registered!");
    }
}
