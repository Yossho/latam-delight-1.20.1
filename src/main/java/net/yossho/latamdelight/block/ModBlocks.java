package net.yossho.latamdelight.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yossho.latamdelight.LatamDelight;
import net.yossho.latamdelight.block.custom.BeansCropBlock;
import net.yossho.latamdelight.block.custom.CornCropBlock;
import net.yossho.latamdelight.block.custom.GarlicCropBlock;
import net.yossho.latamdelight.block.custom.JalapenoCropBlock;
import net.yossho.latamdelight.item.ModItems;
import vectorwing.farmersdelight.common.block.WildCropBlock;
import vectorwing.farmersdelight.common.block.WildRiceBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LatamDelight.MOD_ID);
    //
    //BLOCKS
    //
    public static final RegistryObject<Block> CORN_CRATE = registerBlock("corn_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> JALAPENO_CRATE = registerBlock("jalapeno_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> BEANS_BAG = registerBlock("beans_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL).strength(0.5F, 3.0F)));
    public static final RegistryObject<Block> GARLIC_CRATE = registerBlock("garlic_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(2.0F, 3.0F)));
    //
    //CROPS
    //
    public static final RegistryObject<Block> JALAPENO_CROP = BLOCKS.register("jalapeno_crop",
            () -> new JalapenoCropBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> BEANS_CROP = BLOCKS.register("beans_crop",
            () -> new BeansCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> GARLIC_CROP = BLOCKS.register("garlic_crop",
            () -> new GarlicCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> CORN_CROP = BLOCKS.register("corn_crop",
            () -> new CornCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    //
    // WILD CROPS
    //
    public static final RegistryObject<Block> WILD_JALAPENO = registerBlock("wild_jalapeno",
            () -> new WildCropBlock(MobEffects.POISON, 6,
                    BlockBehaviour.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> WILD_BEANS = registerBlock("wild_beans",
            () -> new WildCropBlock(MobEffects.HUNGER, 6,
                    BlockBehaviour.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> WILD_GARLIC = registerBlock("wild_garlic",
            () -> new WildCropBlock(MobEffects.WEAKNESS, 6,
                    BlockBehaviour.Properties.copy(Blocks.TALL_GRASS)));

    // REGISTERS

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name,  block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
