package net.potatocraft.timelesscontact.items;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.potatocraft.timelesscontact.items.materials.BaseMaterials;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class SapiIII extends ArmorItem implements ICurioItem {
    public SapiIII(Properties properties) {
        super(BaseMaterials.CERAMIC_PLATE,Type.CHESTPLATE,properties);
    }
}
