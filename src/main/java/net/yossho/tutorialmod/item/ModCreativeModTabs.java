package net.yossho.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yossho.tutorialmod.TutorialMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VINEGAR.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.VINEGAR.get());
                        pOutput.accept(ModItems.CORN_DOUGH.get());
                        pOutput.accept(ModItems.CORN.get());
                        pOutput.accept(ModItems.TORTILLA.get());


                    })
            )
                    .build());


    public static  void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
