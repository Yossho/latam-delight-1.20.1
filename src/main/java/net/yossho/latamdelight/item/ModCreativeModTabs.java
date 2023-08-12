package net.yossho.latamdelight.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yossho.latamdelight.LatamDelight;
import net.yossho.latamdelight.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LatamDelight.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("latamdelight_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VINEGAR.get()))
                    .title(Component.translatable("creativetab.latamdelight_tab"))
                    .displayItems(((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.CORN_CRATE.get());
                        pOutput.accept(ModBlocks.JALAPENO_CRATE.get());
                        pOutput.accept(ModBlocks.GARLIC_CRATE.get());
                        pOutput.accept(ModBlocks.BEANS_BAG.get());

                        pOutput.accept(ModBlocks.WILD_JALAPENO.get());
                        pOutput.accept(ModBlocks.WILD_BEANS.get());
                        pOutput.accept(ModBlocks.WILD_GARLIC.get());

                        pOutput.accept(ModItems.CORN.get());
                        pOutput.accept(ModItems.JALAPENO.get());
                        pOutput.accept(ModItems.GARLIC.get());
                        pOutput.accept(ModItems.BEANS.get());
                        pOutput.accept(ModItems.CORN_SEEDS.get());
                        pOutput.accept(ModItems.GARLIC_CLOVE.get());
                        pOutput.accept(ModItems.LEAF_MATE.get());
                        pOutput.accept(ModItems.VINEGAR.get());
                        pOutput.accept(ModItems.MATE.get());
                        pOutput.accept(ModItems.CHICHEME.get());
                        pOutput.accept(ModItems.MASATO.get());
                        pOutput.accept(ModItems.BEETROOT_JUICE.get());
                        pOutput.accept(ModItems.CORN_DOUGH.get());
                        pOutput.accept(ModItems.TORTILLA.get());
                        pOutput.accept(ModItems.SHREDDED_BEEF.get());
                        pOutput.accept(ModItems.CHEESE.get());
                        pOutput.accept(ModItems.CHEESE_PIECE.get());
                        pOutput.accept(ModItems.GREEN_SAUCE.get());
                        pOutput.accept(ModItems.CHIMICHURRI.get());
                        pOutput.accept(ModItems.JALAPENO_BACON.get());
                        pOutput.accept(ModItems.TORTILLA_CHIPS.get());
                        pOutput.accept(ModItems.TORTILLA_CHIPS_CHEESE.get());
                        pOutput.accept(ModItems.TACO_CHICKEN.get());
                        pOutput.accept(ModItems.TACO_COD.get());
                        pOutput.accept(ModItems.TACO_EGGBACON.get());
                        pOutput.accept(ModItems.TACO_GLOW.get());
                        pOutput.accept(ModItems.TACO_HAM.get());
                        pOutput.accept(ModItems.TACO_MUSH.get());
                        pOutput.accept(ModItems.TACO_MUTTON.get());
                        pOutput.accept(ModItems.TACO_NETHER.get());
                        pOutput.accept(ModItems.QUESADILLA.get());
                        pOutput.accept(ModItems.TACO_SALMON.get());
                        pOutput.accept(ModItems.TACO_SHREDDED.get());
                        pOutput.accept(ModItems.TACO_STEAK.get());
                        pOutput.accept(ModItems.TACO_VEGETABLES.get());
                        pOutput.accept(ModItems.CACHAPA.get());
                        pOutput.accept(ModItems.AREPA.get());
                        pOutput.accept(ModItems.CHIPA_GUAZU.get());
                        pOutput.accept(ModItems.CAUSA.get());
                        pOutput.accept(ModItems.CHORIPAN.get());
                        pOutput.accept(ModItems.JALAPENO_SANDWICH.get());
                        pOutput.accept(ModItems.CHILAQUILES_GREEN.get());
                        pOutput.accept(ModItems.MILANESE.get());
                        pOutput.accept(ModItems.ROPAVIEJA.get());
                        pOutput.accept(ModItems.JOCON.get());
                        pOutput.accept(ModItems.POZOLE.get());
                        pOutput.accept(ModItems.EGG_BEETS.get());
                        pOutput.accept(ModItems.STUFFED_JALAPENO.get());
                        pOutput.accept(ModItems.GALLOPINTO.get());
                        pOutput.accept(ModItems.CEVICHE.get());
                        pOutput.accept(ModItems.ROAST_CHICKEN_CORN.get());
                        pOutput.accept(ModItems.TOMATICAN.get());
                        pOutput.accept(ModItems.STROGANOFF.get());
                        pOutput.accept(ModItems.PERNIL.get());

                    })
            )
                    .build());


    public static  void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
