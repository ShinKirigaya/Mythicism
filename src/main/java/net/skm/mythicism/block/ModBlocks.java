package net.skm.mythicism.block;

import java.util.function.Supplier;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.skm.mythicism.Mythicism;
import net.skm.mythicism.item.ModItems;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Mythicism.MODID);

    public static final RegistryObject<Block> ADAMANTIUM_BLOCK = registerBlock("adamantium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> MITHRIL_BLOCK = registerBlock("mithril_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));

    public static final RegistryObject<Block> ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> ADAMANTIUM_ORE_BLOCK = registerBlock("adamantium_ore",
            () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)
                            .strength(75.0f)
                            .requiresCorrectToolForDrops(),
                    UniformInt.of(10, 25)));

    public static final RegistryObject<Block> MITHRIL_ORE_BLOCK = registerBlock("mithril_ore",
            () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)
                            .strength(60.0F)
                            .requiresCorrectToolForDrops(),
                    UniformInt.of(5, 10)));

    public static final RegistryObject<Block> ORICHALCUM_ORE_BLOCK = registerBlock("orichalcum_ore",
            () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                            .strength(3.5F)
                            .requiresCorrectToolForDrops(),
                    UniformInt.of(1, 5)));

    public static final RegistryObject<Block> ADAMANTIUM_END_ORE_BLOCK = registerBlock("adamantium_end_ore",
            () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)
                            .strength(85.0f)
                            .requiresCorrectToolForDrops(),
                    UniformInt.of(10, 25)));

    public static final RegistryObject<Block> MITHRIL_END_ORE_BLOCK = registerBlock("mithril_end_ore",
            () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)
                            .strength(70.0F)
                            .requiresCorrectToolForDrops(),
                    UniformInt.of(5, 10)));

    public static final RegistryObject<Block> ORICHALCUM_END_ORE_BLOCK = registerBlock("orichalcum_end_ore",
            () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                            .strength(4F)
                            .requiresCorrectToolForDrops(),
                    UniformInt.of(1, 5)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    };

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
