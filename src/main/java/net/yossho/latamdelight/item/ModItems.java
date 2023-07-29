package net.yossho.latamdelight.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yossho.latamdelight.LatamDelight;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LatamDelight.MOD_ID);

    public static final RegistryObject<Item> VINEGAR = ITEMS.register("vinegar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORN_DOUGH = ITEMS.register("corn_dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(ModFoods.CORN)));
    public static final RegistryObject<Item> ROAST_CHICKEN_CORN = ITEMS.register("roast_chicken_corn",
            () -> new Item(new Item.Properties().food(ModFoods.ROAST_CHICKEN_CORN)));
    public static final RegistryObject<Item> TORTILLA = ITEMS.register("tortilla",
            () -> new Item(new Item.Properties().food(ModFoods.TORTILLA)));
    public static final RegistryObject<Item> TORTILLA_CHIPS = ITEMS.register("tortilla_chips",
            () -> new Item(new Item.Properties().food(ModFoods.TORTILLA_CHIPS)));
    public static final RegistryObject<Item> SHREDDED_BEEF = ITEMS.register("shredded_beef",
            () -> new Item(new Item.Properties().food(ModFoods.SHREDDED_BEEF)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
