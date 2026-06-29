package com.saicogo.tightlines.item.rod;

import com.saicogo.tightlines.config.TightLinesConfig;
import com.saicogo.tightlines.item.base.RodItem;

public class DiamondRodItem extends RodItem {

    public DiamondRodItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getCastRange(){
        return TightLinesConfig.DIAMOND_ROD_RANGE.get();
    }

    @Override
    public Double getToughness(){
        return TightLinesConfig.DIAMOND_ROD_TOUGHNESS.get();
    }

    @Override
    public Double getMaxKg(){
        return TightLinesConfig.DIAMOND_ROD_MAXKG.get();
    }

}
