package net.potatocraft.timelesscontact.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.potatocraft.timelesscontact.items.NijII;
import net.potatocraft.timelesscontact.items.NijIIA;
import net.potatocraft.timelesscontact.items.SapiIII;
import net.potatocraft.timelesscontact.items.SapiIV;
import net.potatocraft.timelesscontact.items.sapi_iiia.SapiIIIA;
import top.theillusivec4.curios.api.CuriosApi;

import static net.potatocraft.timelesscontact.TimelessContact.MOD_ID;
import static net.potatocraft.timelesscontact.TimelessContact.REGISTRIES;
import static net.potatocraft.timelesscontact.registries.TabsReg.TIMELESSCONTACT_TAB;

public class ItemsReg {

    static Registrar<Item> items = REGISTRIES.get().get(Registries.ITEM);
    static RegistrySupplier<Item> NIJ_IIA = items.register(new ResourceLocation(MOD_ID, "nij_iia"), () -> new NijIIA(new Item.Properties().fireResistant().arch$tab(TIMELESSCONTACT_TAB)));
    static RegistrySupplier<Item> NIJ_II = items.register(new ResourceLocation(MOD_ID, "nij_ii"), () -> new NijII(new Item.Properties().arch$tab(TIMELESSCONTACT_TAB)));
    static RegistrySupplier<Item> SAPI_IIIA = items.register(new ResourceLocation(MOD_ID, "sapi_iiia"), () -> new SapiIIIA(new Item.Properties().durability(4).arch$tab(TIMELESSCONTACT_TAB)));
    static RegistrySupplier<Item> SAPI_III = items.register(new ResourceLocation(MOD_ID, "sapi_iii"), () -> new SapiIII(new Item.Properties().arch$tab(TIMELESSCONTACT_TAB)));
    static RegistrySupplier<Item> SAPI_IV = items.register(new ResourceLocation(MOD_ID, "sapi_iv"), () -> new SapiIV(new Item.Properties().arch$tab(TIMELESSCONTACT_TAB)));
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

}
