package net.eevee.hiddenlamps.block;

import net.eevee.hiddenlamps.HiddenLamps;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;


public class ModBlocks {
    public static final Block OAK_WOOD_REDSTONE_LAMP = registerLampPillarBlock("oak_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block STRIPPED_OAK_WOOD_REDSTONE_LAMP = registerLampPillarBlock("stripped_oak_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block OAK_REDSTONE_LAMP = registerLampBlock("oak_redstone_lamp", BlockSoundGroup.WOOD);

    public static final Block SPRUCE_WOOD_REDSTONE_LAMP = registerLampPillarBlock("spruce_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block STRIPPED_SPRUCE_WOOD_REDSTONE_LAMP = registerLampPillarBlock("stripped_spruce_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block SPRUCE_REDSTONE_LAMP = registerLampBlock("spruce_redstone_lamp", BlockSoundGroup.WOOD);

    public static final Block BIRCH_WOOD_REDSTONE_LAMP = registerLampPillarBlock("birch_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block STRIPPED_BIRCH_WOOD_REDSTONE_LAMP = registerLampPillarBlock("stripped_birch_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block BIRCH_REDSTONE_LAMP = registerLampBlock("birch_redstone_lamp", BlockSoundGroup.WOOD);

    public static final Block JUNGLE_WOOD_REDSTONE_LAMP = registerLampPillarBlock("jungle_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block STRIPPED_JUNGLE_WOOD_REDSTONE_LAMP = registerLampPillarBlock("stripped_jungle_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block JUNGLE_REDSTONE_LAMP = registerLampBlock("jungle_redstone_lamp", BlockSoundGroup.WOOD);

    public static final Block ACACIA_WOOD_REDSTONE_LAMP = registerLampPillarBlock("acacia_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block STRIPPED_ACACIA_WOOD_REDSTONE_LAMP = registerLampPillarBlock("stripped_acacia_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block ACACIA_REDSTONE_LAMP = registerLampBlock("acacia_redstone_lamp", BlockSoundGroup.WOOD);

    public static final Block DARK_OAK_WOOD_REDSTONE_LAMP = registerLampPillarBlock("dark_oak_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block STRIPPED_DARK_OAK_WOOD_REDSTONE_LAMP = registerLampPillarBlock("stripped_dark_oak_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block DARK_OAK_REDSTONE_LAMP = registerLampBlock("dark_oak_redstone_lamp", BlockSoundGroup.WOOD);

    public static final Block MANGROVE_WOOD_REDSTONE_LAMP = registerLampPillarBlock("mangrove_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block STRIPPED_MANGROVE_WOOD_REDSTONE_LAMP = registerLampPillarBlock("stripped_mangrove_wood_redstone_lamp", BlockSoundGroup.WOOD);
    public static final Block MANGROVE_REDSTONE_LAMP = registerLampBlock("mangrove_redstone_lamp", BlockSoundGroup.WOOD);

    public static final Block CHERRY_WOOD_REDSTONE_LAMP = registerLampPillarBlock("cherry_wood_redstone_lamp", BlockSoundGroup.CHERRY_WOOD);
    public static final Block STRIPPED_CHERRY_WOOD_REDSTONE_LAMP = registerLampPillarBlock("stripped_cherry_wood_redstone_lamp", BlockSoundGroup.CHERRY_WOOD);
    public static final Block CHERRY_REDSTONE_LAMP = registerLampBlock("cherry_redstone_lamp", BlockSoundGroup.CHERRY_WOOD);

    public static final Block BAMBOO_BLOCK_REDSTONE_LAMP = registerLampPillarBlock("bamboo_block_redstone_lamp", BlockSoundGroup.BAMBOO_WOOD);
    public static final Block STRIPPED_BAMBOO_BLOCK_REDSTONE_LAMP = registerLampPillarBlock("stripped_bamboo_block_redstone_lamp", BlockSoundGroup.BAMBOO_WOOD);
    public static final Block BAMBOO_REDSTONE_LAMP = registerLampBlock("bamboo_redstone_lamp", BlockSoundGroup.BAMBOO_WOOD);
    public static final Block BAMBOO_MOSAIC_REDSTONE_LAMP = registerLampBlock("bamboo_mosaic_redstone_lamp", BlockSoundGroup.BAMBOO_WOOD);

    public static final Block CRIMSON_HYPHAE_REDSTONE_LAMP = registerLampPillarBlock("crimson_hyphae_redstone_lamp", BlockSoundGroup.NETHER_STEM);
    public static final Block STRIPPED_CRIMSON_HYPHAE_REDSTONE_LAMP = registerLampPillarBlock("stripped_crimson_hyphae_redstone_lamp", BlockSoundGroup.NETHER_STEM);
    public static final Block CRIMSON_REDSTONE_LAMP = registerLampBlock("crimson_redstone_lamp", BlockSoundGroup.NETHER_WOOD);

    public static final Block WARPED_HYPHAE_REDSTONE_LAMP = registerLampPillarBlock("warped_hyphae_redstone_lamp", BlockSoundGroup.NETHER_STEM);
    public static final Block STRIPPED_WARPED_HYPHAE_REDSTONE_LAMP = registerLampPillarBlock("stripped_warped_hyphae_redstone_lamp", BlockSoundGroup.NETHER_STEM);
    public static final Block WARPED_REDSTONE_LAMP = registerLampBlock("warped_redstone_lamp", BlockSoundGroup.NETHER_WOOD);

    public static final Block STONE_REDSTONE_LAMP = registerLampBlock("stone_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block COBBLESTONE_REDSTONE_LAMP = registerLampBlock("cobblestone_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block MOSSY_COBBLESTONE_REDSTONE_LAMP = registerLampBlock("mossy_cobblestone_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block SMOOTH_STONE_REDSTONE_LAMP = registerLampBlock("smooth_stone_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block STONE_BRICK_REDSTONE_LAMP = registerLampBlock("stone_brick_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block MOSSY_STONE_BRICK_REDSTONE_LAMP = registerLampBlock("mossy_stone_brick_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block GRANITE_REDSTONE_LAMP = registerLampBlock("granite_redstone_lamp", BlockSoundGroup.STONE);
    public static final Block POLISHED_GRANITE_REDSTONE_LAMP = registerLampBlock("polished_granite_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block DIORITE_REDSTONE_LAMP = registerLampBlock("diorite_redstone_lamp", BlockSoundGroup.STONE);
    public static final Block POLISHED_DIORITE_REDSTONE_LAMP = registerLampBlock("polished_diorite_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block ANDESITE_REDSTONE_LAMP = registerLampBlock("andesite_redstone_lamp", BlockSoundGroup.STONE);
    public static final Block POLISHED_ANDESITE_REDSTONE_LAMP = registerLampBlock("polished_andesite_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block DEEPSLATE_REDSTONE_LAMP = registerLampPillarBlock("deepslate_redstone_lamp", BlockSoundGroup.DEEPSLATE);
    public static final Block COBBLED_DEEPSLATE_REDSTONE_LAMP = registerLampBlock("cobbled_deepslate_redstone_lamp", BlockSoundGroup.DEEPSLATE);
    public static final Block POLISHED_DEEPSLATE_REDSTONE_LAMP = registerLampBlock("polished_deepslate_redstone_lamp", BlockSoundGroup.POLISHED_DEEPSLATE);
    public static final Block DEEPSLATE_BRICK_REDSTONE_LAMP = registerLampBlock("deepslate_brick_redstone_lamp", BlockSoundGroup.DEEPSLATE_BRICKS);

    public static final Block TUFF_REDSTONE_LAMP = registerLampBlock("tuff_redstone_lamp", BlockSoundGroup.TUFF);
    public static final Block POLISHED_TUFF_REDSTONE_LAMP = registerLampBlock("polished_tuff_redstone_lamp", BlockSoundGroup.POLISHED_TUFF);
    public static final Block TUFF_BRICK_REDSTONE_LAMP = registerLampBlock("tuff_brick_redstone_lamp", BlockSoundGroup.TUFF_BRICKS);

    public static final Block BRICK_REDSTONE_LAMP = registerLampBlock("brick_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block MUD_BRICK_REDSTONE_LAMP = registerLampBlock("mud_brick_redstone_lamp", BlockSoundGroup.MUD_BRICKS);

    public static final Block PRISMARINE_BRICK_REDSTONE_LAMP = registerLampBlock("prismarine_brick_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block NETHERRACK_REDSTONE_LAMP = registerLampBlock("netherrack_redstone_lamp", BlockSoundGroup.NETHERRACK);

    public static final Block BASALT_REDSTONE_LAMP = registerLampPillarBlock("basalt_redstone_lamp", BlockSoundGroup.BASALT);
    public static final Block POLISHED_BASALT_REDSTONE_LAMP = registerLampPillarBlock("polished_basalt_redstone_lamp", BlockSoundGroup.BASALT);

    public static final Block BLACKSTONE_REDSTONE_LAMP = registerLampBlock("blackstone_redstone_lamp", BlockSoundGroup.STONE);
    public static final Block POLISHED_BLACKSTONE_REDSTONE_LAMP = registerLampBlock("polished_blackstone_redstone_lamp", BlockSoundGroup.STONE);
    public static final Block POLISHED_BLACKSTONE_BRICK_REDSTONE_LAMP = registerLampBlock("polished_blackstone_brick_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block END_STONE_REDSTONE_LAMP = registerLampBlock("end_stone_redstone_lamp", BlockSoundGroup.STONE);
    public static final Block END_STONE_BRICK_REDSTONE_LAMP = registerLampBlock("end_stone_brick_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block PURPUR_REDSTONE_LAMP = registerLampBlock("purpur_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block QUARTZ_BRICK_REDSTONE_LAMP = registerLampBlock("quartz_brick_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block CALCITE_REDSTONE_LAMP = registerLampBlock("calcite_redstone_lamp", BlockSoundGroup.STONE);

    public static final Block DRIPSTONE_REDSTONE_LAMP = registerLampBlock("dripstone_redstone_lamp", BlockSoundGroup.STONE);

    private static Block registerLampBlock(String name, BlockSoundGroup soundGroup) {
        Block block = new RedstoneLampBlock(Block.Settings.create()
                .strength(0.3f)
                .luminance(createLightLevelFromLitBlockState(15))
                .sounds(soundGroup)
                .allowsSpawning(Blocks::always));
        registerBlockItem(name, block, ItemGroups.REDSTONE);
        return Registry.register(Registries.BLOCK, Identifier.of(HiddenLamps.MOD_ID, name), block);
    }
    private static Block registerLampPillarBlock(String name, BlockSoundGroup soundGroup) {
        Block block = new RedstoneLampPillarBlock(Block.Settings.create()
                .strength(0.3f)
                .luminance(createLightLevelFromLitBlockState(15))
                .sounds(soundGroup)
                .allowsSpawning(Blocks::always));
        registerBlockItem(name, block, ItemGroups.REDSTONE);
        return Registry.register(Registries.BLOCK, Identifier.of(HiddenLamps.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        registerItemInGroup(tab, block);
        Registry.register(Registries.ITEM, Identifier.of(HiddenLamps.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerItemInGroup(RegistryKey<ItemGroup> group, Block block) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> {
            entries.add(block.asItem());
        });
    }
    public static void registerModBlocks() {
        HiddenLamps.LOGGER.debug("Registering Blocks for " + HiddenLamps.MOD_ID);
    }
}
