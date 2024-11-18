package net.potatocraft.timelesscontact.fabric;

import net.potatocraft.timelesscontact.TimelessContact;
import net.fabricmc.api.ModInitializer;

public class TimelessContactFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TimelessContact.init();
    }
}
