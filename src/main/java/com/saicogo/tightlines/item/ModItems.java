package com.saicogo.tightlines.item;

import com.saicogo.tightlines.TightLines;
import com.saicogo.tightlines.config.TightLinesConfig;
import com.saicogo.tightlines.item.rod.WoodenRodItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TightLines.MODID);

    public static final DeferredItem<WoodenRodItem> WOODEN_ROD = ITEMS.registerItem(
            "wooden_rod",
            WoodenRodItem::new,
            new Item.Properties().durability(50)
    );

    public static final DeferredItem<WoodenRodItem> TEST_ROD = ITEMS.registerItem(
            "test_rod",
            WoodenRodItem::new,
            new Item.Properties().durability(-1)
    );
}
