package net.potatocraft.timelesscontact.items.sapi_iiia;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.level.Level;

public class SapiEntity extends ThrownTrident {
    public SapiEntity(EntityType<? extends ThrownTrident> entityType, Level level) {
        super(entityType, level);
    }
}
