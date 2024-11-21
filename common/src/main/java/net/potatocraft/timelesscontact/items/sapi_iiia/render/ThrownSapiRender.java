package net.potatocraft.timelesscontact.items.sapi_iiia.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.model.TridentModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.ThrownTridentRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.potatocraft.timelesscontact.items.sapi_iiia.model.SapiModel;

public class ThrownSapiRender extends ThrownTridentRenderer {
    public static final ResourceLocation SAPI_LOCATION = new ResourceLocation("textures/entity/sapi_plate.png");
    private final SapiModel<Entity> model;
    public ThrownSapiRender(EntityRendererProvider.Context context) {
        super(context);
        this.model = new SapiModel<>(context.bakeLayer(ModelLayers.TRIDENT));
    }

    @Override
    public void render(ThrownTrident thrownTrident, float f, float g, PoseStack poseStack, MultiBufferSource multiBufferSource, int i) {
        poseStack.pushPose();
        poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(g, thrownTrident.yRotO, thrownTrident.getYRot()) - 90.0F));
        poseStack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(g, thrownTrident.xRotO, thrownTrident.getXRot()) + 90.0F));
        VertexConsumer vertexConsumer = ItemRenderer.getFoilBufferDirect(multiBufferSource, this.model.renderType(this.getTextureLocation(thrownTrident)), false, thrownTrident.isFoil());
        this.model.renderToBuffer(poseStack, vertexConsumer, i, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        poseStack.popPose();
        super.render(thrownTrident, f, g, poseStack, multiBufferSource, i);
    }

    public ResourceLocation getTextureLocation(ThrownTrident thrownTrident) {
        return SAPI_LOCATION;
    }
}
