package net.potatocraft.timelesscontact.items;


import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.potatocraft.timelesscontact.items.materials.BaseMaterials;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class NijIIA extends ArmorItem implements ICurioItem {
    public NijIIA(Properties properties) {
        super(BaseMaterials.NOMEX_FABRICS,Type.CHESTPLATE , properties);
    }
}