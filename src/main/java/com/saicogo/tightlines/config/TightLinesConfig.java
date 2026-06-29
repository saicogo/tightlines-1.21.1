package com.saicogo.tightlines.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class TightLinesConfig {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec SPEC;
    //Rod
    public static final ModConfigSpec.IntValue IRON_ROD_RANGE;
    public static final ModConfigSpec.DoubleValue IRON_ROD_TOUGHNESS;
    public static final ModConfigSpec.DoubleValue IRON_ROD_MAXKG;
    public static final ModConfigSpec.IntValue GOLDEN_ROD_RANGE;
    public static final ModConfigSpec.DoubleValue GOLDEN_ROD_TOUGHNESS;
    public static final ModConfigSpec.DoubleValue GOLDEN_ROD_MAXKG;
    public static final ModConfigSpec.IntValue DIAMOND_ROD_RANGE;
    public static final ModConfigSpec.DoubleValue DIAMOND_ROD_TOUGHNESS;
    public static final ModConfigSpec.DoubleValue DIAMOND_ROD_MAXKG;
    public static final ModConfigSpec.IntValue NETHERITE_ROD_RANGE;
    public static final ModConfigSpec.DoubleValue NETHERITE_ROD_TOUGHNESS;
    public static final ModConfigSpec.DoubleValue NETHERITE_ROD_MAXKG;

    //Reel
    public static final ModConfigSpec.DoubleValue IRON_REEL_RANGE_MULTIPLIER;
    public static final ModConfigSpec.DoubleValue IRON_REEL_SPEED_MULTIPLIER;
    public static final ModConfigSpec.DoubleValue GOLDEN_REEL_RANGE_MULTIPLIER;
    public static final ModConfigSpec.DoubleValue GOLDEN_REEL_SPEED_MULTIPLIER;
    public static final ModConfigSpec.DoubleValue DIAMOND_REEL_RANGE_MULTIPLIER;
    public static final ModConfigSpec.DoubleValue DIAMOND_REEL_SPEED_MULTIPLIER;
    public static final ModConfigSpec.DoubleValue NETHERITE_REEL_RANGE_MULTIPLIER;
    public static final ModConfigSpec.DoubleValue NETHERITE_REEL_SPEED_MULTIPLIER;

    //Line

    

    static {
        BUILDER.comment("Tight Lines! config").push("rods");

        IRON_ROD_RANGE = BUILDER.defineInRange("iron_rod_range", 10, 1, 100);
        IRON_ROD_TOUGHNESS = BUILDER.defineInRange("iron_rod_toughness", 1.0, 0.01, 10.0);
        IRON_ROD_MAXKG = BUILDER.defineInRange("iron_rod_maxkg", 5.0, 0.01, 1000.0);

        GOLDEN_ROD_RANGE = BUILDER.defineInRange("golden_rod_range", 20, 5, 100);
        GOLDEN_ROD_TOUGHNESS = BUILDER.defineInRange("golden_rod_toughness", 0.5, 0.01, 10.0);
        GOLDEN_ROD_MAXKG = BUILDER.defineInRange("golden_rod_maxkg", 3.0, 0.01, 1000.0);

        DIAMOND_ROD_RANGE = BUILDER.defineInRange("diamond_rod_range", 14, 5, 100);
        DIAMOND_ROD_TOUGHNESS = BUILDER.defineInRange("diamond_rod_toughness", 1.5, 0.01, 10.0);
        DIAMOND_ROD_MAXKG = BUILDER.defineInRange("diamond_rod_maxkg", 10.0, 0.01, 1000.0);

        NETHERITE_ROD_RANGE = BUILDER.defineInRange("netherite_rod_range", 18, 5, 100);
        NETHERITE_ROD_TOUGHNESS = BUILDER.defineInRange("netherite_rod_toughness", 2.0, 0.01, 10.0);
        NETHERITE_ROD_MAXKG = BUILDER.defineInRange("netherite_rod_maxkg", 15.0, 0.01, 1000.0);

        BUILDER.pop();

        BUILDER.push("reels");

        IRON_REEL_RANGE_MULTIPLIER = BUILDER.defineInRange("iron_reel_range_multiplier", 1.0, 0.01, 10.0);
        IRON_REEL_SPEED_MULTIPLIER = BUILDER.defineInRange("iron_reel_speed_multiplier", 1.0, 0.01, 10.0);

        GOLDEN_REEL_RANGE_MULTIPLIER = BUILDER.defineInRange("golden_reel_range_multiplier", 1.3, 0.01, 10.0);
        GOLDEN_REEL_SPEED_MULTIPLIER = BUILDER.defineInRange("golden_reel_speed_multiplier", 1.8, 0.01, 10.0);

        DIAMOND_REEL_RANGE_MULTIPLIER = BUILDER.defineInRange("diamond_reel_range_multiplier", 1.2, 0.01, 10.0);
        DIAMOND_REEL_SPEED_MULTIPLIER = BUILDER.defineInRange("diamond_reel_speed_multiplier", 1.3, 0.01, 10.0);

        NETHERITE_REEL_RANGE_MULTIPLIER = BUILDER.defineInRange("netherite_reel_range_multiplier", 1.4, 5, 10.0);
        NETHERITE_REEL_SPEED_MULTIPLIER = BUILDER.defineInRange("netherite_reel_speed_multiplier", 1.8, 0.01, 10.0);

        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
