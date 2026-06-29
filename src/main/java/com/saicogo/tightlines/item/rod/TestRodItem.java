package com.saicogo.tightlines.item.rod;

import com.saicogo.tightlines.config.TightLinesConfig;
import com.saicogo.tightlines.item.base.RodItem;

public class TestRodItem extends RodItem {

    public TestRodItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getCastRange(){
        return 100;
    }

    @Override
    public Double getToughness(){
        return 5000.0;
    }

    @Override
    public Double getMaxKg(){
        return 100000.0;
    }

}
