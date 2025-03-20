package sapphiremod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import sapphiremod.SapphireMod;

public class ModBlocks {
    public static void init() {
        SapphireMod.logInfo("Registering ModBlocks for: " + SapphireMod.MOD_ID);
        registerBlockInItemGroup(ItemGroups.BUILDING_BLOCKS, SAPPHIRE_BLOCK);
        registerBlockInItemGroup(ItemGroups.NATURAL, DEEPSLATE_SAPPHIRE_ORE);
    }

    private static void registerBlockInItemGroup(RegistryKey<ItemGroup> group, Block block) {
        ItemGroupEvents.modifyEntriesEvent(group).register(e -> e.add(block));
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SapphireMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SapphireMod.MOD_ID, name), block);
    }

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
}
