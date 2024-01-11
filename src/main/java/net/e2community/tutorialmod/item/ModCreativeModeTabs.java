package net.e2community.tutorialmod.item;
import net.e2community.tutorialmod.TutorialMod;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID , bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {

//    public static final RegistryObject<CreativeModeTab>   TUTORIAL_TAB = ModItems.REGISTER.register("tutorial_tab", () -> CreativeModeTab.builder()
//            // Set name of tab to display
//            .title(Component.translatable("creativemodetab.tutorial_tab"))
//            // Set icon of creative tab
//            .icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
//            // Add default items to tab
//            .displayItems((params, output) -> {
//                output.accept(ModItems.BLACK_OPAL.get());
//            })
//            .build()
//    );
    @SubscribeEvent()
    public static void registerCreativeModsTabs(BuildCreativeModeTabContentsEvent event){
//      if(event.getTab() == ModCreativeModeTabs.TUTORIAL_TAB.get()){
//            event.accept(ModItems.BLACK_OPAL);
//            event.accept(ModItems.RAW_BLACK_OPAL);
//        }


    }
}
