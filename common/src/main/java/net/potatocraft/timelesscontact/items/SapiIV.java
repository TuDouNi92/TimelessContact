package net.potatocraft.timelesscontact.items;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import dev.architectury.event.events.common.EntityEvent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.potatocraft.timelesscontact.items.materials.BaseMaterials;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.*;

public class SapiIV extends ArmorItem implements ICurioItem {
    Multimap<Attribute,AttributeModifier> attrs = LinkedHashMultimap.create();
    public SapiIV(Properties properties) {
        super(BaseMaterials.TITANIUM_PLATE,Type.CHESTPLATE,properties);
    }
    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        
    }

    @Override
    public ICurio.SoundInfo getEquipSound(SlotContext slotContext, ItemStack stack) {
        return new ICurio.SoundInfo(SoundEvents.ARMOR_EQUIP_IRON,1.0f,0.7f);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid, ItemStack stack) {
        if(!attrs.containsKey(Attributes.ARMOR)) {
            attrs.put(Attributes.ARMOR, new AttributeModifier(uuid.toString(), BaseMaterials.TITANIUM_PLATE.getDefenseForType(Type.CHESTPLATE), AttributeModifier.Operation.ADDITION));
        }
            return attrs;
    }

    @Override
    public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
        System.out.println("unq");
        slotContext.entity().getAttributes().removeAttributeModifiers(attrs);
    }
}