package net.yossho.tutorialmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    //public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(2)
    //      .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100), 0.1f).build();
    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build();
        public static final FoodProperties TORTILLA = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).build();

}