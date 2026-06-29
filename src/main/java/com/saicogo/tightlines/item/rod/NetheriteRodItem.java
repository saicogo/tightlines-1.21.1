package com.saicogo.tightlines.item.rod;

import com.saicogo.tightlines.config.TightLinesConfig;
import com.saicogo.tightlines.item.base.RodItem;

public class NetheriteRodItem extends RodItem {

    public NetheriteRodItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getCastRange(){
        return TightLinesConfig.NETHERITE_ROD_RANGE.get();
    }

    @Override
    public Double getToughness(){
        return TightLinesConfig.NETHERITE_ROD_TOUGHNESS.get();
    }

    @Override
    public Double getMaxKg(){
        return TightLinesConfig.NETHERITE_ROD_MAXKG.get();
    }

}
