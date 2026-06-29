package com.saicogo.tightlines.item.reel;

import com.saicogo.tightlines.config.TightLinesConfig;
import com.saicogo.tightlines.item.base.ReelItem;

public class DiamondReelItem extends ReelItem {

    public DiamondReelItem(Properties properties) {
        super(properties);
    }

    public Double getRangeMultiplier(){
        return TightLinesConfig.DIAMOND_REEL_RANGE_MULTIPLIER.get();
    }

    public Double getSpeedMultiplier(){
        return TightLinesConfig.DIAMOND_REEL_SPEED_MULTIPLIER.get();
    }

}
