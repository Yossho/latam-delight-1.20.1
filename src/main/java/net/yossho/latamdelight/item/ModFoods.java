package net.yossho.latamdelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.yossho.latamdelight.effect.ModEffectsld;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModFoods {

    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(3).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 100), 0.5f).build();
    public static final FoodProperties CHEESE_PIECE = new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build();
    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build();
    public static final FoodProperties TORTILLA = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).build();
    public static final FoodProperties TORTILLA_CHIPS = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build();
    public static final FoodProperties TORTILLA_CHIPS_CHEESE = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).build();
    public static final FoodProperties CHILAQUILES_GREEN = new FoodProperties.Builder().nutrition(4).saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(ModEffectsld.SPICY.get(), 100), 0.2f).build();
    public static final FoodProperties ROAST_CHICKEN_CORN = new FoodProperties.Builder().nutrition(10).saturationMod(1.0f).build();
    public static final FoodProperties SHREDDED_BEEF = new FoodProperties.Builder().nutrition(4).saturationMod(0.4f).build();
    public static final FoodProperties ROPAVIEJA = new FoodProperties.Builder().nutrition(8).saturationMod(1.0f).build();
    public static final FoodProperties JALAPENO = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(ModEffectsld.SPICY.get(), 140), 1.0f).build();
    public static final FoodProperties JALAPENO_BACON = new FoodProperties.Builder().nutrition(5).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(ModEffectsld.SPICY.get(), 100), 0.5f).build();
    public static final FoodProperties JOCON = new FoodProperties.Builder().nutrition(8).saturationMod(0.9f).build();
    public static final FoodProperties GREEN_SAUCE = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffectsld.SPICY.get(), 140), 1.0f).build();
    public static final FoodProperties POZOLE = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 600), 1.0f).build();
    public static final FoodProperties STUFFED_JALAPENO = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 600), 1.0f)
            .effect(() -> new MobEffectInstance(ModEffectsld.SPICY.get(), 100), 0.3f).build();
    public static final FoodProperties GALLOPINTO = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 600), 1.0f).build();
    public static final FoodProperties TOMATICAN = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 600), 1.0f).build();
    public static final FoodProperties CHIMICHURRI = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 0.3f).build();
    public static final FoodProperties TACO_CHICKEN = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 300), 1.0f).build();
    public static final FoodProperties TACO_COD = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 300), 1.0f).build();
    public static final FoodProperties TACO_EGGBACON = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 300), 1.0f).build();
    public static final FoodProperties TACO_GLOW = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200), 0.5f).build();
    public static final FoodProperties TACO_HAM = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 1600), 1.0f).build();
    public static final FoodProperties TACO_MUSH = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 300), 1.0f).build();
    public static final FoodProperties TACO_MUTTON = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 300), 1.0f).build();
    public static final FoodProperties TACO_NETHER = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300), 0.3f).build();
    public static final FoodProperties QUESADILLA = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 100), 1.0f).build();
    public static final FoodProperties TACO_SALMON = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 300), 1.0f).build();
    public static final FoodProperties TACO_SHREDDED = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 300), 1.0f).build();
    public static final FoodProperties TACO_STEAK = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 300), 1.0f).build();
    public static final FoodProperties TACO_VEGETABLES = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 200), 1.0f).build();
    public static final FoodProperties CHORIPAN = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 300), 1.0f).build();
    public static final FoodProperties JALAPENO_SANDWICH = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 100), 1.0f)
            .effect(() -> new MobEffectInstance(ModEffectsld.SPICY.get(), 100), 0.5f).build();
    public static final FoodProperties CACHAPA = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 100), 1.0f).build();
    public static final FoodProperties CEVICHE = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 100), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 300), 0.1f).build();
    public static final FoodProperties AREPA = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 100), 1.0f).build();
    public static final FoodProperties CAUSA = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 100), 1.0f).build();
    public static final FoodProperties STROGANOFF = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 100), 1.0f).build();
    public static final FoodProperties CHIPA_GUAZU = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 100), 1.0f).build();
    public static final FoodProperties MILANESE = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 100), 1.0f).build();

    //
    // DRINKS
    //
    public static final FoodProperties MATE = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 300), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 200), 1.0f).build();
    public static final FoodProperties CHICHEME = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 300), 1.0f).build();
    public static final FoodProperties MASATO = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 300), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1.0f).build();

}