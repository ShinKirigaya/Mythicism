package net.skm.mythicism.item;

import java.util.List;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.skm.mythicism.Mythicism;
import net.skm.mythicism.util.ModTags;

public class ModToolTiers {

        public static final Tier ADAMANTIUM = TierSortingRegistry.registerTier(
                        new ForgeTier(5, 4200, 12, 6, 25, ModTags.Blocks.NEEDS_ADAMANTIUM_TOOL,
                                        () -> Ingredient.of(ModItems.ADAMANTIUM_INGOT.get())),
                        new ResourceLocation(Mythicism.MODID, "adamantium"), List.of(Tiers.NETHERITE), List.of());

        public static final Tier MITHRIL = TierSortingRegistry.registerTier(
                        new ForgeTier(4, 3500, 11, 5, 20, ModTags.Blocks.NEEDS_MITHRIL_TOOL,
                                        () -> Ingredient.of(ModItems.MITHRIL_INGOT.get())),
                        new ResourceLocation(Mythicism.MODID, "mithril"), List.of(Tiers.DIAMOND),
                        List.of(ModToolTiers.ADAMANTIUM));
        public static final Tier ORICHALCUM = TierSortingRegistry.registerTier(
                        new ForgeTier(3, 2500, 10, 4, 17, ModTags.Blocks.NEEDS_ORICHALCUM_TOOL,
                                        () -> Ingredient.of(ModItems.ORICHALCUM_INGOT.get())),
                        new ResourceLocation(Mythicism.MODID, "orichalcum"), List.of(Tiers.IRON),
                        List.of(Tiers.NETHERITE));

}
