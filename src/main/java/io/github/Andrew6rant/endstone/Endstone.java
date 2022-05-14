package io.github.Andrew6rant.endstone;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Endstone implements ModInitializer {
	public static final Block END_STONE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("endstone", "end_stone"), END_STONE);
		Registry.register(Registry.ITEM, new Identifier("endstone", "end_stone"), new BlockItem(END_STONE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
