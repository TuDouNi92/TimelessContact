package net.potatocraft.timelesscontact.items.sapi_iiia;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;


public class SapiIIIA extends TridentItem implements Vanishable {
    private final Multimap<Attribute,AttributeModifier> defaultBuilder;
    public SapiIIIA(Properties properties) {
        super(properties);
        ImmutableMultimap.Builder<Attribute,AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_DAMAGE,new AttributeModifier(BASE_ATTACK_DAMAGE_UUID,"Tool modifier", 4.3f, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED,new AttributeModifier(BASE_ATTACK_SPEED_UUID,"Tool modifier", -3.0f, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ARMOR,new AttributeModifier("Tool modifier",(double)4.3f, AttributeModifier.Operation.ADDITION));

        this.defaultBuilder = builder.build();
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
        return equipmentSlot == EquipmentSlot.MAINHAND?this.defaultBuilder:super.getDefaultAttributeModifiers(equipmentSlot);
    }

}
