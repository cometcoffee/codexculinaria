package com.etcoffee.codexculinaria.item;

import com.etcoffee.codexculinaria.CodexCulinaria;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CodexCulinaria.MOD_ID);

    public static final DeferredItem<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATO)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
