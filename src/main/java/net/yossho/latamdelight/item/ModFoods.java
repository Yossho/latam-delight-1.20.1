package net.yossho.latamdelight.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    //public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(2)
    //      .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100), 0.1f).build();
    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build();
    public static final FoodProperties TORTILLA = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).build();
    public static final FoodProperties TORTILLA_CHIPS = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build();
    public static final FoodProperties ROAST_CHICKEN_CORN = new FoodProperties.Builder().nutrition(10).saturationMod(1.2f).build();
    public static final FoodProperties SHREDDED_BEEF = new FoodProperties.Builder().nutrition(4).saturationMod(0.4f).build();
}
