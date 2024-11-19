package net.potatocraft.timelesscontact.items.materials;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import static net.potatocraft.timelesscontact.TimelessContact.MOD_ID;

public enum Nomex implements ArmorMaterial {
    NOMEX_FABRICS("nomex_fabrics");
    private static final int[] BASE_DURABILITY = {0,4};
    private static final int[] PROTECTION_AMOUNT = {0,4};
    private final String name;
    Nomex(String name){
        this.name = name;
    }
    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return PROTECTION_AMOUNT[type.ordinal()];
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
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
