package com.saicogo.tightlines.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class TightLinesConfig {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec SPEC;
    //Rod
    public static final ModConfigSpec.IntValue WOODEN_ROD_RANGE;
    public static final ModConfigSpec.DoubleValue WOODEN_ROD_TOUGHNESS;
    public static final ModConfigSpec.DoubleValue WOODEN_ROD_MAXKG;
    public static final ModConfigSpec.IntValue COPPER_ROD_RANGE;
    public static final ModConfigSpec.DoubleValue COPPER_ROD_TOUGHNESS;
    public static final ModConfigSpec.DoubleValue COPPER_ROD_MAXKG;
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
    public static final ModConfigSpec.DoubleValue COPPER_REEL_RANGE;
    public static final ModConfigSpec.DoubleValue COPPER_REEL_MAXGK;
    public static final ModConfigSpec.DoubleValue COPPER_REEL_SPEED;
    public static final ModConfigSpec.DoubleValue IRON_REEL_RANGE;
    public static final ModConfigSpec.DoubleValue IRON_REEL_MAXGK;
    public static final ModConfigSpec.DoubleValue IRON_REEL_SPEED;
    public static final ModConfigSpec.DoubleValue GOLDEN_REEL_RANGE;
    public static final ModConfigSpec.DoubleValue GOLDEN_REEL_MAXGK;
    public static final ModConfigSpec.DoubleValue GOLDEN_REEL_SPEED;
    public static final ModConfigSpec.DoubleValue DIAMOND_REEL_RANGE;
    public static final ModConfigSpec.DoubleValue DIAMOND_REEL_MAXGK;
    public static final ModConfigSpec.DoubleValue DIAMOND_REEL_SPEED;
    public static final ModConfigSpec.DoubleValue NETHERITE_REEL_RANGE;
    public static final ModConfigSpec.DoubleValue NETHERITE_REEL_MAXGK;
    public static final ModConfigSpec.DoubleValue NETHERITE_REEL_SPEED;

    //Line

    

    static {
        BUILDER.comment("Tight Lines! config").push("rods");

        WOODEN_ROD_RANGE = BUILDER.comment("default = 5, min = 5, max = 1000").defineInRange("wooden_rod_range", 5, 5, 1000);
        WOODEN_ROD_TOUGHNESS = BUILDER.comment("default = 1.0, min = 0.01, max = 10.0").defineInRange("wooden_rod_toughness", 1.0, 0.01, 10.0);
        WOODEN_ROD_MAXKG = BUILDER.comment("default = 1.0, min = 0.5, max = 1000.0").defineInRange("wooden_rod_maxkg", 1.0, 0.01, 1000.0);

        COPPER_ROD_RANGE = BUILDER.comment("default = 7, min = 5, max = 1000").defineInRange("copper_rod_range", 7, 5, 1000);
        COPPER_ROD_TOUGHNESS = BUILDER.comment("default = 1.2, min = 0.01, max = 10.0").defineInRange("copper_rod_toughness", 1.2, 0.01, 10.0);
        COPPER_ROD_MAXKG = BUILDER.comment("default = 2.5, min = 0.5, max = 1000.0").defineInRange("copper_rod_maxkg", 2.5, 0.01, 1000.0);

        IRON_ROD_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        IRON_ROD_TOUGHNESS = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        IRON_ROD_MAXKG = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        GOLDEN_ROD_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        GOLDEN_ROD_TOUGHNESS = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        GOLDEN_ROD_MAXKG = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        DIAMOND_ROD_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        DIAMOND_ROD_TOUGHNESS = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        DIAMOND_ROD_MAXKG = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        NETHERITE_ROD_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        NETHERITE_ROD_TOUGHNESS = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        NETHERITE_ROD_MAXKG = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        COPPER_REEL_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        COPPER_REEL_MAXGK = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        COPPER_REEL_SPEED = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        IRON_REEL_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        IRON_REEL_MAXGK = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        IRON_REEL_SPEED = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        GOLDEN_REEL_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        GOLDEN_REEL_MAXGK = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        GOLDEN_REEL_SPEED = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        DIAMOND_REEL_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        DIAMOND_REEL_MAXGK = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        DIAMOND_REEL_SPEED = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        NETHERITE_REEL_RANGE = BUILDER.comment("default = 10, min = 5, max = 1000").defineInRange("iron_rod_range", 10, 5, 1000);
        NETHERITE_REEL_MAXGK = BUILDER.comment("default = 1.5, min = 0.01, max = 10.0").defineInRange("iron_rod_toughness", 1.5, 0.01, 10.0);
        NETHERITE_REEL_SPEED = BUILDER.comment("default = 5.0, min = 0.5, max = 1000.0").defineInRange("iron_rod_maxkg", 1.0, 0.01, 1000.0);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
