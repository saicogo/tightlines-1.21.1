package com.saicogo.tightlines.item.base;

import com.saicogo.tightlines.config.TightLinesConfig;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RodItem extends Item {

    public RodItem(Properties properties) {
        super(properties);
    }

    public int getCastRange(){
        return TightLinesConfig.WOODEN_ROD_RANGE.get();
    }

    public Double getToughness(){
        return TightLinesConfig.WOODEN_ROD_TOUGHNESS.get();
    }

    public Double getMaxKg(){
        return TightLinesConfig.WOODEN_ROD_MAXKG.get();
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand){
        ItemStack itemStack = player.getItemInHand(hand);
        if (!level.isClientSide()){
            player.sendSystemMessage(Component.literal("cast"));
        }
        return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide);
    }
}
