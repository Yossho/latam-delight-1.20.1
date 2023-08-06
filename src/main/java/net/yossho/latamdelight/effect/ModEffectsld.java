package net.yossho.latamdelight.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yossho.latamdelight.LatamDelight;

public class ModEffectsld {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, LatamDelight.MOD_ID);

    public static final RegistryObject<MobEffect> SPICY = MOB_EFFECTS.register("spicy",
            () -> new SpicyEffect(MobEffectCategory.HARMFUL, 255130));
    public static void register(IEventBus eventBus) {MOB_EFFECTS.register(eventBus);
    }


}
