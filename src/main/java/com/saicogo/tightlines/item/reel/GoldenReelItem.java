package com.saicogo.tightlines.item.reel;

import com.saicogo.tightlines.config.TightLinesConfig;
import com.saicogo.tightlines.item.base.ReelItem;

public class GoldenReelItem extends ReelItem {

    public GoldenReelItem(Properties properties) {
        super(properties);
    }

    public Double getRangeMultiplier(){
        return TightLinesConfig.GOLDEN_REEL_RANGE_MULTIPLIER.get();
    }

    public Double getSpeedMultiplier(){
        return TightLinesConfig.GOLDEN_REEL_SPEED_MULTIPLIER.get();
    }

}
