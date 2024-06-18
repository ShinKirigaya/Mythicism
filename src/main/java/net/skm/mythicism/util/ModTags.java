package net.skm.mythicism.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.skm.mythicism.Mythicism;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> NEEDS_ADAMANTIUM_TOOL = tag("needs_adamantium_tool");
        public static final TagKey<Block> NEEDS_MITHRIL_TOOL = tag("needs_mithril_tool");
        public static final TagKey<Block> NEEDS_ORICHALCUM_TOOL = tag("needs_orichalcum_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Mythicism.MODID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Mythicism.MODID, name));
        }
    }

}
