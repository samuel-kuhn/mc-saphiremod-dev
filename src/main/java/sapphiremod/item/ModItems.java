package sapphiremod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sapphiremod.SapphireMod;
import sapphiremod.util.ItemGroupHelper;

import java.util.List;

public class ModItems {
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));

    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new SwordItem(ModToolMaterial.SAPPHIRE, 3, -2.8f, new FabricItemSettings()));

    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
            new PickaxeItem(ModToolMaterial.SAPPHIRE, 1, -3f, new FabricItemSettings()));

    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
            new ShovelItem(ModToolMaterial.SAPPHIRE, 1, -3f, new FabricItemSettings()));

    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            new AxeItem(ModToolMaterial.SAPPHIRE, 5, -3.2f, new FabricItemSettings()));

    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
            new HoeItem(ModToolMaterial.SAPPHIRE, -4, 0f, new FabricItemSettings()));

    static List<Item> sapphireTools = List.of(SAPPHIRE_HOE, SAPPHIRE_SHOVEL, SAPPHIRE_AXE, SAPPHIRE_PICKAXE);

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SapphireMod.MOD_ID, name), item);
    }

    public static void init() {
        SapphireMod.LOGGER.info("Registering Mod Items for " + SapphireMod.MOD_ID);
        ItemGroupHelper.registerItemInGroup(ItemGroups.INGREDIENTS, SAPPHIRE);
        ItemGroupHelper.registerItemInGroup(ItemGroups.COMBAT, SAPPHIRE_SWORD);
        sapphireTools.forEach(item -> ItemGroupHelper.registerItemInGroup(ItemGroups.TOOLS, item));
    }
}
