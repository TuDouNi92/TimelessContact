package net.potatocraft.timelesscontact.forge;

import net.potatocraft.timelesscontact.TimelessContactExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class TimelessContactExpectPlatformImpl {
    /**
     * This is our actual method to {@link TimelessContactExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
