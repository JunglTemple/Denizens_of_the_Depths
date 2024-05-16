package io.github.jungltemple.denizens_of_the_depths;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DenizensOfTheDepths implements ModInitializer {
    @Override
    public void onInitialize() {
        // Initialization code goes here
        Registry.register(Registries.ITEM, new Identifier("denizens", "test_item"), TEST_ITEM);

    }

    public static final Item TEST_ITEM = new Item(new FabricItemSettings());
}
