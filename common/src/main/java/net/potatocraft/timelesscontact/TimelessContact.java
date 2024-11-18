package net.potatocraft.timelesscontact;

import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class TimelessContact {
    public static final String MOD_ID = "timelesscontact";
    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<RegistrarManager> REGISTRIES = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));

    // Registering a new creative tab
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final RegistrySupplier<CreativeModeTab> TIMELESSCONTACT_TAB = TABS.register("timelesscontact_tab", () ->
            CreativeTabRegistry.create(Component.translatable("itemGroup." + MOD_ID + ".timelesscontact_tab"),
                    () -> new ItemStack(TimelessContact.TIMELESSCONTACT_ITEM.get())));
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Item> TIMELESSCONTACT_ITEM = ITEMS.register("timelesscontact_item", () ->
            new Item(new Item.Properties().arch$tab(TimelessContact.TIMELESSCONTACT_TAB)));
    
    public static void init() {
        TABS.register();
        ITEMS.register();
        
        System.out.println(TimelessContactExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
