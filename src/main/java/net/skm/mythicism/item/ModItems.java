package net.skm.mythicism.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.skm.mythicism.Mythicism;
import net.skm.mythicism.item.AdvancedItems.FuelItem;

public class ModItems {
        // DeferredRegistry for Items
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        Mythicism.MODID);

        // Registry of Material Items
        public static final RegistryObject<Item> ADAMANTIUM_INGOT = ITEMS.register("adamantium_ingot",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ADAMANTIUM_NUGGET = ITEMS.register("adamantium_nugget",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ORICHALCUM_NUGGET = ITEMS.register("orichalcum_nugget",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ADAMANTIUM_ORE_CHUNK = ITEMS.register("adamantium_ore_chunk",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RAW_ORICHALCUM = ITEMS.register("raw_orichalcum",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ADAMANTIUM_SMITHING_TEMPLATE = ITEMS.register(
                        "adamantium_smithing_template",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ORICHALCUM_SMITHING_TEMPLATE = ITEMS.register(
                        "orichalcum_smithing_template",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MITHRIL_SMITHING_TEMPLATE = ITEMS.register("mithril_smithing_template",
                        () -> new Item(new Item.Properties()));

        // Registry of Food Items

        // Creates a new food item with the id "mythicism:example_food", nutrition 1 and
        // saturation 2
        public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_food",
                        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                                        .alwaysEat().nutrition(1).saturationMod(2f).build())));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }

        // Registry of FuelItems

        public static final RegistryObject<Item> FIRE_CRYSTAL = ITEMS.register("fire_crystal",
                        () -> new FuelItem(new Item.Properties(), 2400));

        // Registry of ToolItems

        public static final RegistryObject<Item> ADAMANTIUM_SWORD = ITEMS.register("adamantium_sword",
                        () -> new SwordItem(ModToolTiers.ADAMANTIUM, 4, 1.8f, new Item.Properties()));

        public static final RegistryObject<Item> ADAMANTIUM_AXE = ITEMS.register("adamantium_axe",
                        () -> new AxeItem(ModToolTiers.ADAMANTIUM, 5, 1.2f, new Item.Properties()));

        public static final RegistryObject<Item> ADAMANTIUM_PICKAXE = ITEMS.register("adamantium_pickaxe",
                        () -> new PickaxeItem(ModToolTiers.ADAMANTIUM, 1, 1, new Item.Properties()));

        public static final RegistryObject<Item> ADAMANTIUM_SHOVEL = ITEMS.register("adamantium_shovel",
                        () -> new ShovelItem(ModToolTiers.ADAMANTIUM, 1.5f, 1, new Item.Properties()));

        public static final RegistryObject<Item> ADAMANTIUM_HOE = ITEMS.register("adamantium_hoe",
                        () -> new HoeItem(ModToolTiers.ADAMANTIUM, 1, 2, new Item.Properties()));

        public static final RegistryObject<Item> MANA_BOW = ITEMS.register("mana_bow",
                        () -> new BowItem(new Item.Properties()));

        public static final RegistryObject<Item> MANA_ARROW = ITEMS.register("mana_essence",
                        () -> new ArrowItem(new Item.Properties()));

        public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword",
                        () -> new SwordItem(ModToolTiers.MITHRIL, 4, 1.8f, new Item.Properties()));

        public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe",
                        () -> new AxeItem(ModToolTiers.MITHRIL, 5, 1.2f, new Item.Properties()));

        public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
                        () -> new PickaxeItem(ModToolTiers.MITHRIL, 1, 1, new Item.Properties()));

        public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
                        () -> new ShovelItem(ModToolTiers.MITHRIL, 1.5f, 1, new Item.Properties()));

        public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe",
                        () -> new HoeItem(ModToolTiers.MITHRIL, 1, 2, new Item.Properties()));

        public static final RegistryObject<Item> ELVEN_BOW = ITEMS.register("elven_bow",
                        () -> new BowItem(new Item.Properties()));

        public static final RegistryObject<Item> ORICHALCUM_SWORD = ITEMS.register("orichalcum_sword",
                        () -> new SwordItem(ModToolTiers.ORICHALCUM, 4, 1.8f, new Item.Properties()));

        public static final RegistryObject<Item> ORICHALCUM_AXE = ITEMS.register("orichalcum_axe",
                        () -> new AxeItem(ModToolTiers.ORICHALCUM, 5, 1.2f, new Item.Properties()));

        public static final RegistryObject<Item> ORICHALCUM_PICKAXE = ITEMS.register("orichalcum_pickaxe",
                        () -> new PickaxeItem(ModToolTiers.ORICHALCUM, 1, 1, new Item.Properties()));

        public static final RegistryObject<Item> ORICHALCUM_SHOVEL = ITEMS.register("orichalcum_shovel",
                        () -> new ShovelItem(ModToolTiers.ORICHALCUM, 1.5f, 1, new Item.Properties()));

        public static final RegistryObject<Item> ORICHALCUM_HOE = ITEMS.register("orichalcum_hoe",
                        () -> new HoeItem(ModToolTiers.ORICHALCUM, 1, 2, new Item.Properties()));

        public static final RegistryObject<Item> COMPOUND_BOW = ITEMS.register("compound_bow",
                        () -> new BowItem(new Item.Properties()));

        // Registry of ArmorItems

}