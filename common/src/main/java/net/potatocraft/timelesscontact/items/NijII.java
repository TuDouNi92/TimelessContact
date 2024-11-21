package net.potatocraft.timelesscontact.items;

import net.minecraft.world.item.ArmorItem;
import net.potatocraft.timelesscontact.items.materials.BaseMaterials;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class NijII extends ArmorItem implements ICurioItem {
    public NijII(Properties properties) {
        super(BaseMaterials.KEVLAR,Type.CHESTPLATE,properties);
    }
}