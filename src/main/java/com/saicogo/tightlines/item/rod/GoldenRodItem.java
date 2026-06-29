package com.saicogo.tightlines.item.rod;

import com.saicogo.tightlines.config.TightLinesConfig;
import com.saicogo.tightlines.item.base.RodItem;

public class GoldenRodItem extends RodItem {

    public GoldenRodItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getCastRange(){
        return TightLinesConfig.GOLDEN_ROD_RANGE.get();
    }

    @Override
    public Double getToughness(){
        return TightLinesConfig.GOLDEN_ROD_TOUGHNESS.get();
    }

    @Override
    public Double getMaxKg(){
        return TightLinesConfig.GOLDEN_ROD_MAXKG.get();
    }

}
