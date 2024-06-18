package net.skm.mythicism.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.skm.mythicism.Mythicism;
import net.skm.mythicism.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, Mythicism.MODID);

    public static final RegistryObject<CreativeModeTab> INGREDIENTS_TAB = CREATIVE_MODE_TABS.register("ingredients_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ADAMANTIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.ingredients_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ADAMANTIUM_ORE_CHUNK.get());
                        pOutput.accept(ModItems.ADAMANTIUM_INGOT.get());
                        pOutput.accept(ModItems.ADAMANTIUM_NUGGET.get());
                        pOutput.accept(ModItems.ADAMANTIUM_SMITHING_TEMPLATE.get());
                        pOutput.accept(ModItems.RAW_MITHRIL.get());
                        pOutput.accept(ModItems.MITHRIL_INGOT.get());
                        pOutput.accept(ModItems.MITHRIL_NUGGET.get());
                        pOutput.accept(ModItems.MITHRIL_SMITHING_TEMPLATE.get());
                        pOutput.accept(ModItems.RAW_ORICHALCUM.get());
                        pOutput.accept(ModItems.ORICHALCUM_INGOT.get());
                        pOutput.accept(ModItems.ORICHALCUM_NUGGET.get());
                        pOutput.accept(ModItems.ORICHALCUM_SMITHING_TEMPLATE.get());
                        pOutput.accept(ModItems.FIRE_CRYSTAL.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.ADAMANTIUM_BLOCK.get()))
                    .title(Component.translatable("creativetab.blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.ADAMANTIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.ADAMANTIUM_ORE_BLOCK.get());
                        pOutput.accept(ModBlocks.ADAMANTIUM_END_ORE_BLOCK.get());
                        pOutput.accept(ModBlocks.MITHRIL_BLOCK.get());
                        pOutput.accept(ModBlocks.MITHRIL_ORE_BLOCK.get());
                        pOutput.accept(ModBlocks.MITHRIL_END_ORE_BLOCK.get());
                        pOutput.accept(ModBlocks.ORICHALCUM_BLOCK.get());
                        pOutput.accept(ModBlocks.ORICHALCUM_ORE_BLOCK.get());
                        pOutput.accept(ModBlocks.ORICHALCUM_END_ORE_BLOCK.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TABS.register("tools_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ADAMANTIUM_SWORD.get()))
                    .title(Component.translatable("creativetab.weapons_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ADAMANTIUM_SWORD.get());
                        pOutput.accept(ModItems.ADAMANTIUM_AXE.get());
                        pOutput.accept(ModItems.ADAMANTIUM_PICKAXE.get());
                        pOutput.accept(ModItems.ADAMANTIUM_SHOVEL.get());
                        pOutput.accept(ModItems.ADAMANTIUM_HOE.get());
                        pOutput.accept(ModItems.MANA_BOW.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
