package com.saicogo.tightlines.item.reel;

import com.saicogo.tightlines.config.TightLinesConfig;
import com.saicogo.tightlines.item.base.ReelItem;

public class NetheriteReelItem extends ReelItem {

    public NetheriteReelItem(Properties properties) {
        super(properties);
    }

    public Double getRangeMultiplier(){
        return TightLinesConfig.NETHERITE_REEL_RANGE_MULTIPLIER.get();
    }

    public Double getSpeedMultiplier(){
        return TightLinesConfig.NETHERITE_REEL_SPEED_MULTIPLIER.get();
    }

}
