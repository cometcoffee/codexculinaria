package com.etcoffee.codexculinaria.item;

import com.etcoffee.codexculinaria.CodexCulinaria;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CodexCulinaria.MOD_ID);

    public static final Supplier<CreativeModeTab> CC_FOODS = CREATIVE_MODE_TAB.register("cc_foods", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TOMATO.get()))
            .title(Component.translatable("creativetab.codexculinaria.cc_foods"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.TOMATO);
            }).build());

    public static final Supplier<CreativeModeTab> CC_TOOLS = CREATIVE_MODE_TAB.register("cc_tools", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TOMATO.get()))
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CodexCulinaria.MOD_ID, "cc_foods"))
            .title(Component.translatable("creativetab.codexculinaria.cc_tools"))
            .displayItems((itemDisplayParameters, output) -> {

            }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
