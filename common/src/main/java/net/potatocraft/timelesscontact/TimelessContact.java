package net.potatocraft.timelesscontact;
import com.google.common.base.Suppliers;
import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.EntityEvent;
import dev.architectury.registry.registries.RegistrarManager;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.potatocraft.timelesscontact.items.NijIIA;

import static net.potatocraft.timelesscontact.registries.ItemsReg.*;
import static net.potatocraft.timelesscontact.registries.TabsReg.TABS;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public class TimelessContact {
    public static final String MOD_ID = "timelesscontact";
    public static final Supplier<RegistrarManager> REGISTRIES = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));
    static final AttributeModifier attrMdfrAdd = new AttributeModifier("modifiy armor", 20.0f, AttributeModifier.Operation.ADDITION);
    static final AttributeModifier attrMdfrDcrs = new AttributeModifier("modifiy armor", -5.0f, AttributeModifier.Operation.ADDITION);
    public static void init() {
        TABS.register();
        ITEMS.register();
        System.out.println(TimelessContactExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }

}
