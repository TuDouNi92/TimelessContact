package net.potatocraft.timelesscontact.registries;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static net.potatocraft.timelesscontact.TimelessContact.MOD_ID;
import static net.potatocraft.timelesscontact.registries.ItemsReg.NIJ_II;

public class TabsReg {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static RegistrySupplier<CreativeModeTab> TIMELESSCONTACT_TAB = TABS.register("timelesscontact_tab", () ->
            CreativeTabRegistry.create(Component.translatable("itemGroup." + MOD_ID + ".timelesscontact_tab"),
                    () -> new ItemStack(NIJ_II.get())));
}
