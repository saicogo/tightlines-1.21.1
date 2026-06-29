package com.saicogo.tightlines.item.rod;

import com.saicogo.tightlines.config.TightLinesConfig;
import com.saicogo.tightlines.item.base.RodItem;

public class IronRodItem extends RodItem {

    public IronRodItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getCastRange(){
        return TightLinesConfig.IRON_ROD_RANGE.get();
    }

    @Override
    public Double getToughness(){
        return TightLinesConfig.IRON_ROD_TOUGHNESS.get();
    }

    @Override
    public Double getMaxKg(){
        return TightLinesConfig.IRON_ROD_MAXKG.get();
    }

}
