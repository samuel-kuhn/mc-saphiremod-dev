package sapphiremod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sapphiremod.SapphireMod;
import sapphiremod.block.ModBlocks;

public class ModItemGroups {
    @SuppressWarnings("unused")
    public static final ItemGroup SAPPHIRE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SapphireMod.MOD_ID, "sapphire"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sapphire"))
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);

                        entries.add(ModItems.SAPPHIRE);

                    }).build());
    public static void init() {
        SapphireMod.LOGGER.info("Registering Item Groups for " + SapphireMod.MOD_ID);
    }
}

