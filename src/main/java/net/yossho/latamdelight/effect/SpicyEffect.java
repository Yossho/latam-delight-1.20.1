package net.yossho.latamdelight.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class SpicyEffect extends MobEffect {
    public SpicyEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }
    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier){
        if (!pLivingEntity.level().isClientSide()) {
            pLivingEntity.hurt(pLivingEntity.damageSources().magic(), 0.1F);
        }
    }


    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
