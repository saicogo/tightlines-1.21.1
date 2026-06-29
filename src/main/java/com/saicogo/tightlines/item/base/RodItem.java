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
        return 0;
    }

    public Double getToughness(){
        return 0.0;
    }

    public Double getMaxKg(){
        return 0.0;
    }
    /*
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand){
        ItemStack itemStack = player.getItemInHand(hand);
        if (!level.isClientSide()){
            player.sendSystemMessage(Component.literal("cast"));
        }
        return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide);
    }
     */
}
