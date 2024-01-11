package net.e2community.tutorialmod.item;

import net.e2community.tutorialmod.TutorialMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public  static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);


//    public  static final DeferredRegister<CreativeModeTab> REGISTER =
//            DeferredRegister.create((ResourceLocation) ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public  static final RegistryObject<Item> BLACK_OPAL = ITEMS.register( "black_opal" ,
            ()-> new Item(new Item.Properties()) );

    public  static final RegistryObject<Item> RAW_BLACK_OPAL = ITEMS.register( "raw_black_opal" ,
            ()-> new Item(new Item.Properties()) );

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
