package com.saicogo.tightlines.item;

import com.saicogo.tightlines.TightLines;
import com.saicogo.tightlines.item.reel.DiamondReelItem;
import com.saicogo.tightlines.item.reel.GoldenReelItem;
import com.saicogo.tightlines.item.reel.IronReelItem;
import com.saicogo.tightlines.item.reel.NetheriteReelItem;
import com.saicogo.tightlines.item.rod.*;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TightLines.MODID);

    public static final DeferredItem<IronRodItem> IRON_ROD = ITEMS.registerItem(
            "iron_rod",
            IronRodItem::new,
            new Item.Properties()
                    .durability(250)
                    .stacksTo(1)
    );

    public static final DeferredItem<GoldenRodItem> GOLDEN_ROD = ITEMS.registerItem(
            "golden_rod",
            GoldenRodItem::new,
            new Item.Properties()
                    .durability(32)
                    .stacksTo(1)
    );

    public static final DeferredItem<DiamondRodItem> DIAMOND_ROD = ITEMS.registerItem(
            "diamond_rod",
            DiamondRodItem::new,
            new Item.Properties()
                    .durability(768)
                    .stacksTo(1)
    );

    public static final DeferredItem<NetheriteRodItem> NETHERITE_ROD = ITEMS.registerItem(
            "netherite_rod",
            NetheriteRodItem::new,
            new Item.Properties()
                    .durability(1536)
                    .stacksTo(1)
    );

    public static final DeferredItem<TestRodItem> TEST_ROD = ITEMS.registerItem(
            "test_rod",
            TestRodItem::new,
            new Item.Properties()
                    .durability(-1)
                    .stacksTo(1)
    );

    public static final DeferredItem<IronReelItem> IRON_REEL = ITEMS.registerItem(
            "iron_reel",
            IronReelItem::new,
            new Item.Properties()
                    .durability(250)
                    .stacksTo(1)
    );

    public static final DeferredItem<GoldenReelItem> GOLDEN_REEL = ITEMS.registerItem(
            "golden_reel",
            GoldenReelItem::new,
            new Item.Properties()
                    .durability(32)
                    .stacksTo(1)
    );

    public static final DeferredItem<DiamondReelItem> DIAMOND_REEL = ITEMS.registerItem(
            "diamond_reel",
            DiamondReelItem::new,
            new Item.Properties()
                    .durability(768)
                    .stacksTo(1)
    );

    public static final DeferredItem<NetheriteReelItem> NETHERITE_REEL = ITEMS.registerItem(
            "netherite_reel",
            NetheriteReelItem::new,
            new Item.Properties()
                    .durability(32)
                    .stacksTo(1)
    );
}
