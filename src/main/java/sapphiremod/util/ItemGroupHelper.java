package sapphiremod.util;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class ItemGroupHelper {
    public static void registerItemInGroup(RegistryKey<ItemGroup> group, ItemConvertible item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(e -> e.add(item));
    }
}
