package net.potatocraft.timelesscontact.fabric;

import net.potatocraft.timelesscontact.TimelessContactExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class TimelessContactExpectPlatformImpl {
    /**
     * This is our actual method to {@link TimelessContactExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
