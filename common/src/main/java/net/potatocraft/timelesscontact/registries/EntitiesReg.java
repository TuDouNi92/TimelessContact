package net.potatocraft.timelesscontact.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.potatocraft.timelesscontact.items.sapi_iiia.SapiEntity;

import static net.potatocraft.timelesscontact.TimelessContact.MOD_ID;

public class EntitiesReg {
    public static DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(MOD_ID, Registries.ENTITY_TYPE);
    public static final RegistrySupplier<EntityType<SapiEntity>> SAPI_PLATE =  ENTITIES.register(MOD_ID,
            () -> EntityType.Builder.of(
                    SapiEntity::new,
                    MobCategory.MISC
                    )
                    .sized(0.5F, 0.5F)
                    .build(new ResourceLocation(
                            MOD_ID,
                            "sapi_plate")
                            .toString()));
    public static void regisiter(){
        ENTITIES.register();
    }
}
