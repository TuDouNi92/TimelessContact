package net.potatocraft.timelesscontact.items.sapi_iiia.render;

import net.minecraft.client.model.TridentModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ThrownTridentRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.projectile.ThrownTrident;

public class ThrownSapiIIIARender extends ThrownTridentRenderer {
    public static final ResourceLocation SAPI_LOCATION = new ResourceLocation("textures/entity/sapi_plate.png");
    private final TridentModel model;
    public ThrownSapiIIIARender(EntityRendererProvider.Context context) {
        super(context);
        this.model = new TridentModel(context.bakeLayer(ModelLayers.TRIDENT));
    }
    public ResourceLocation getTextureLocation(ThrownTrident thrownTrident) {
        return SAPI_LOCATION;
    }
}
