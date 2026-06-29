package com.saicogo.tightlines;

import com.saicogo.tightlines.config.TightLinesConfig;
import com.saicogo.tightlines.item.ModItems;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(TightLines.MODID)
public class TightLines {
    public static final String MODID = "tightlines";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TIGHT_LINES = CREATIVE_MODE_TABS.register("tight_lines", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.tightlines"))
            .icon(() -> ModItems.TEST_ROD.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.TEST_ROD.get());
            }).build());


    public TightLines(IEventBus modEventBus, ModContainer modContainer) {
        ModItems.ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
        modContainer.registerConfig(ModConfig.Type.COMMON, TightLinesConfig.SPEC, "tightlines-common.toml");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }
}
