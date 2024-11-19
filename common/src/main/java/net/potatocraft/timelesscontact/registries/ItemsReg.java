package net.potatocraft.timelesscontact.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.potatocraft.timelesscontact.TimelessContact;

import static net.potatocraft.timelesscontact.TimelessContact.MOD_ID;
import static net.potatocraft.timelesscontact.TimelessContact.REGISTRIES;

public class ItemReg {
    static Registrar<Item> items = REGISTRIES.get().get(Registries.ITEM);
    static RegistrySupplier<Item> SAPI_IIA = items.register(new ResourceLocation(MOD_ID, "sapi_iia"), () -> new Item(new Item.Properties().arch$tab(TimelessContact.TIMELESSCONTACT_TAB)));
    public static RegistrySupplier<Item> SAPI_II = items.register(new ResourceLocation(MOD_ID, "sapi_ii"), () -> new Item(new Item.Properties().arch$tab(TimelessContact.TIMELESSCONTACT_TAB)));
    static RegistrySupplier<Item> SAPI_IIIA = items.register(new ResourceLocation(MOD_ID, "sapi_iiia"), () -> new Item(new Item.Properties().arch$tab(TimelessContact.TIMELESSCONTACT_TAB)));
    static RegistrySupplier<Item> SAPI_III = items.register(new ResourceLocation(MOD_ID, "sapi_iii"), () -> new Item(new Item.Properties().arch$tab(TimelessContact.TIMELESSCONTACT_TAB)));
    static RegistrySupplier<Item> SAPI_IV = items.register(new ResourceLocation(MOD_ID, "sapi_iv"), () -> new Item(new Item.Properties().arch$tab(TimelessContact.TIMELESSCONTACT_TAB)));
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public void init() {

    }
}
