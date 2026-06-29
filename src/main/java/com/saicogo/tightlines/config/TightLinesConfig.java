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
    public static final ModConfigSpec.DoubleValue IRON_REEL_RANGE;
    public static final ModConfigSpec.DoubleValue IRON_REEL_MAXKG;
    public static final ModConfigSpec.DoubleValue IRON_REEL_SPEED;
    public static final ModConfigSpec.DoubleValue GOLDEN_REEL_RANGE;
    public static final ModConfigSpec.DoubleValue GOLDEN_REEL_MAXKG;
    public static final ModConfigSpec.DoubleValue GOLDEN_REEL_SPEED;
    public static final ModConfigSpec.DoubleValue DIAMOND_REEL_RANGE;
    public static final ModConfigSpec.DoubleValue DIAMOND_REEL_MAXKG;
    public static final ModConfigSpec.DoubleValue DIAMOND_REEL_SPEED;
    public static final ModConfigSpec.DoubleValue NETHERITE_REEL_RANGE;
    public static final ModConfigSpec.DoubleValue NETHERITE_REEL_MAXKG;
    public static final ModConfigSpec.DoubleValue NETHERITE_REEL_SPEED;

    //Line

    

    static {
        BUILDER.comment("Tight Lines! config").push("rods");

        IRON_ROD_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        IRON_ROD_TOUGHNESS = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        IRON_ROD_MAXKG = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        GOLDEN_ROD_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("golden_rod_range", 10, 5, 1000);
        GOLDEN_ROD_TOUGHNESS = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("golden_rod_toughness", 1.5, 0.01, 10.0);
        GOLDEN_ROD_MAXKG = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("golden_rod_maxkg", 1.0, 0.01, 1000.0);

        DIAMOND_ROD_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("diamond_rod_range", 10, 5, 1000);
        DIAMOND_ROD_TOUGHNESS = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("diamond_rod_toughness", 1.5, 0.01, 10.0);
        DIAMOND_ROD_MAXKG = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("diamond_rod_maxkg", 1.0, 0.01, 1000.0);

        NETHERITE_ROD_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("netherite_rod_range", 10, 5, 1000);
        NETHERITE_ROD_TOUGHNESS = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("netherite_rod_toughness", 1.5, 0.01, 10.0);
        NETHERITE_ROD_MAXKG = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("netherite_rod_maxkg", 1.0, 0.01, 1000.0);

        BUILDER.pop();

        BUILDER.push("reels");

        IRON_REEL_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        IRON_REEL_MAXKG = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        IRON_REEL_SPEED = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        GOLDEN_REEL_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        GOLDEN_REEL_MAXKG = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        GOLDEN_REEL_SPEED = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        DIAMOND_REEL_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        DIAMOND_REEL_MAXKG = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        DIAMOND_REEL_SPEED = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        NETHERITE_REEL_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        NETHERITE_REEL_MAXKG = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        NETHERITE_REEL_SPEED = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
