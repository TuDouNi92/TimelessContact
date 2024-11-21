package net.potatocraft.timelesscontact.items.materials;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.CuriosCapability;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.type.capability.ICuriosItemHandler;

import java.util.UUID;

import static net.potatocraft.timelesscontact.TimelessContact.MOD_ID;

public enum BaseMaterials implements ArmorMaterial, ICurioItem {
    NOMEX_FABRICS("nomex_fabrics",1,new int[]{0,2,0,0},0),
    KEVLAR("kevlar_fabrics",1,new int[]{0,4,0,0},4),
    STEEL_PLATE("steel_plate",2,new int[]{0,7,0,0},0),
    CERAMIC_PLATE("ceramic_plate",1,new int[]{0,14,0,0},3),
    TITANIUM_PLATE("titanium_plate",4,new int[]{0,18,0,0},6),
    POLYETHYLENE_PLATE("polyethylene_plate",1,new int[]{0,18,0,0},0);
    private static final int[] BASE_DURABILITY = {0,4,0,0};
    private static final int[] PROTECTION_AMOUNT = {0,0,0,0};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final float toughness;
    BaseMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, float toughness){
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.toughness = toughness;
    }
    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()]+durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return PROTECTION_AMOUNT[type.ordinal()]+protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return MOD_ID+":"+this.name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }

}
