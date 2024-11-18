package net.potatocraft.timelesscontact.forge;

import dev.architectury.platform.forge.EventBuses;
import net.potatocraft.timelesscontact.TimelessContact;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TimelessContact.MOD_ID)
public class TimelessContactForge {
    public TimelessContactForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(TimelessContact.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        TimelessContact.init();
    }
}
