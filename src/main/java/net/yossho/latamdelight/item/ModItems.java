package net.yossho.latamdelight.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yossho.latamdelight.LatamDelight;
import net.yossho.latamdelight.block.ModBlocks;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LatamDelight.MOD_ID);

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return (new Item.Properties()).food(food).craftRemainder(Items.BOWL).stacksTo(16);}
    public static Item.Properties bottleFoodItem(FoodProperties food) {
        return (new Item.Properties()).food(food).craftRemainder(Items.GLASS_BOTTLE).stacksTo(64);

    }

//
//
//

    public static final RegistryObject<Item> VINEGAR = ITEMS.register("vinegar",
            () -> new Item(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE)));
    public static final RegistryObject<Item> CORN_DOUGH = ITEMS.register("corn_dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAF_MATE = ITEMS.register("leaf_mate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEANS = ITEMS.register("beans",
            () -> new ItemNameBlockItem(ModBlocks.BEANS_CROP.get(),
                    new Item.Properties()));
    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new Item(new Item.Properties()));

    //
    // CONSUMABLES
    //
    public static final RegistryObject<Item> JALAPENO = ITEMS.register("jalapeno",
            () -> new ItemNameBlockItem(ModBlocks.JALAPENO_CROP.get(),
                    new Item.Properties().food(ModFoods.JALAPENO)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE)));
    public static final RegistryObject<Item> CHEESE_PIECE = ITEMS.register("cheese_piece",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE_PIECE)));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(ModFoods.CORN)));
    public static final RegistryObject<Item> TORTILLA = ITEMS.register("tortilla",
            () -> new Item(new Item.Properties().food(ModFoods.TORTILLA)));
    public static final RegistryObject<Item> TORTILLA_CHIPS = ITEMS.register("tortilla_chips",
            () -> new Item(new Item.Properties().food(ModFoods.TORTILLA_CHIPS)));
    public static final RegistryObject<Item> TORTILLA_CHIPS_CHEESE = ITEMS.register("tortilla_chips_cheese",
            () -> new Item(new Item.Properties().food(ModFoods.TORTILLA_CHIPS_CHEESE)));
    public static final RegistryObject<Item> SHREDDED_BEEF = ITEMS.register("shredded_beef",
            () -> new Item(new Item.Properties().food(ModFoods.SHREDDED_BEEF)));
    public static final RegistryObject<Item> JALAPENO_BACON = ITEMS.register("jalapeno_bacon",
            () -> new Item(new Item.Properties().food(ModFoods.JALAPENO_BACON)));
    public static final RegistryObject<Item> CHIMICHURRI;
    static {
        CHIMICHURRI = ITEMS.register("chimichurri",() -> new ConsumableItem(bowlFoodItem(ModFoods.CHIMICHURRI), false));}
    public static final RegistryObject<Item> GREEN_SAUCE;
    static {
        GREEN_SAUCE = ITEMS.register("green_sauce",() -> new ConsumableItem(bowlFoodItem(ModFoods.GREEN_SAUCE), true));}
    public static final RegistryObject<Item> JOCON;
    static {
        JOCON = ITEMS.register("jocon",() -> new ConsumableItem(bowlFoodItem(ModFoods.JOCON), true));}
    public static final RegistryObject<Item> ROPAVIEJA;
    static {
        ROPAVIEJA = ITEMS.register("ropavieja",() -> new ConsumableItem(bowlFoodItem(ModFoods.ROPAVIEJA), true));}
    public static final RegistryObject<Item> ROAST_CHICKEN_CORN;
    static {
        ROAST_CHICKEN_CORN = ITEMS.register("roast_chicken_corn",() -> new ConsumableItem(bowlFoodItem(ModFoods.ROAST_CHICKEN_CORN), true));}
    public static final RegistryObject<Item> CHILAQUILES_GREEN;
    static {
        CHILAQUILES_GREEN = ITEMS.register("chilaquiles_green",() -> new ConsumableItem(bowlFoodItem(ModFoods.CHILAQUILES_GREEN), true));}
    public static final RegistryObject<Item> POZOLE;
    static {
        POZOLE = ITEMS.register("pozole",() -> new ConsumableItem(bowlFoodItem(ModFoods.POZOLE), true));}
    public static final RegistryObject<Item> STUFFED_JALAPENO;
    static {
        STUFFED_JALAPENO = ITEMS.register("stuffed_jalapeno",() -> new ConsumableItem(bowlFoodItem(ModFoods.STUFFED_JALAPENO), true));}
    public static final RegistryObject<Item> GALLOPINTO;
    static {
        GALLOPINTO = ITEMS.register("gallopinto",() -> new ConsumableItem(bowlFoodItem(ModFoods.GALLOPINTO), true));}
    public static final RegistryObject<Item> TOMATICAN;
    static {
        TOMATICAN = ITEMS.register("tomatican",() -> new ConsumableItem(bowlFoodItem(ModFoods.TOMATICAN), true));}
    public static final RegistryObject<Item> CEVICHE;
    static {
        CEVICHE = ITEMS.register("ceviche",() -> new ConsumableItem(bowlFoodItem(ModFoods.CEVICHE), true));}
    public static final RegistryObject<Item> TACO_CHICKEN = ITEMS.register("taco_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.TACO_CHICKEN)));
    public static final RegistryObject<Item> TACO_COD = ITEMS.register("taco_cod",
            () -> new Item(new Item.Properties().food(ModFoods.TACO_COD)));
    public static final RegistryObject<Item> TACO_EGGBACON = ITEMS.register("taco_eggbacon",
            () -> new Item(new Item.Properties().food(ModFoods.TACO_EGGBACON)));
    public static final RegistryObject<Item> TACO_GLOW = ITEMS.register("taco_glow",
            () -> new Item(new Item.Properties().food(ModFoods.TACO_GLOW)));
    public static final RegistryObject<Item> TACO_HAM = ITEMS.register("taco_ham",
            () -> new Item(new Item.Properties().food(ModFoods.TACO_HAM)));
    public static final RegistryObject<Item> TACO_MUSH = ITEMS.register("taco_mush",
            () -> new Item(new Item.Properties().food(ModFoods.TACO_MUSH)));
    public static final RegistryObject<Item> TACO_MUTTON = ITEMS.register("taco_mutton",
            () -> new Item(new Item.Properties().food(ModFoods.TACO_MUTTON)));
    public static final RegistryObject<Item> TACO_NETHER = ITEMS.register("taco_nether",
            () -> new Item(new Item.Properties().food(ModFoods.TACO_NETHER)));
    public static final RegistryObject<Item> QUESADILLA = ITEMS.register("quesadilla",
            () -> new Item(new Item.Properties().food(ModFoods.QUESADILLA)));
    public static final RegistryObject<Item> TACO_SALMON = ITEMS.register("taco_salmon",
            () -> new Item(new Item.Properties().food(ModFoods.TACO_SALMON)));
    public static final RegistryObject<Item> TACO_SHREDDED = ITEMS.register("taco_shredded",
            () -> new Item(new Item.Properties().food(ModFoods.TACO_SHREDDED)));
    public static final RegistryObject<Item> TACO_STEAK = ITEMS.register("taco_steak",
            () -> new Item(new Item.Properties().food(ModFoods.TACO_STEAK)));
    public static final RegistryObject<Item> TACO_VEGETABLES = ITEMS.register("taco_vegetables",
            () -> new Item(new Item.Properties().food(ModFoods.TACO_VEGETABLES)));
    public static final RegistryObject<Item> CHORIPAN = ITEMS.register("choripan",
            () -> new Item(new Item.Properties().food(ModFoods.CHORIPAN)));
    public static final RegistryObject<Item> JALAPENO_SANDWICH = ITEMS.register("jalapeno_sandwich",
            () -> new Item(new Item.Properties().food(ModFoods.JALAPENO_SANDWICH)));
    public static final RegistryObject<Item> CACHAPA = ITEMS.register("cachapa",
            () -> new Item(new Item.Properties().food(ModFoods.CACHAPA)));
    public static final RegistryObject<Item> AREPA = ITEMS.register("arepa",
            () -> new Item(new Item.Properties().food(ModFoods.AREPA)));
    public static final RegistryObject<Item> CAUSA = ITEMS.register("causa",
            () -> new Item(new Item.Properties().food(ModFoods.CAUSA)));
    public static final RegistryObject<Item> MATE;
    static {
        MATE = ITEMS.register("mate",() -> new DrinkableItem(bottleFoodItem(ModFoods.MATE), true));}
    public static final RegistryObject<Item> CHICHEME;
    static {
        CHICHEME = ITEMS.register("chicheme",() -> new DrinkableItem(bottleFoodItem(ModFoods.CHICHEME), true));}
    public static final RegistryObject<Item> MASATO;
    static {
        MASATO = ITEMS.register("masato",() -> new DrinkableItem(bottleFoodItem(ModFoods.MASATO), true));}


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
