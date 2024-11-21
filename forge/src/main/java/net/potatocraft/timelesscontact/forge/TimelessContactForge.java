package net.potatocraft.timelesscontact.forge;

import dev.architectury.event.events.client.ClientPlayerEvent;
import dev.architectury.event.events.common.PlayerEvent;
import dev.architectury.platform.forge.EventBuses;
import net.minecraft.world.entity.EntityEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.potatocraft.timelesscontact.TimelessContact;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import top.theillusivec4.curios.api.CuriosApi;

import java.util.UUID;


@Mod(TimelessContact.MOD_ID)
public class TimelessContactForge {
    public TimelessContactForge(FMLJavaModLoadingContext context) {
        // Submit our event bus to let architectury register our content on the right time
        PlayerEvent.PLAYER_JOIN.register(this::initSlots);
        EventBuses.registerModEventBus(TimelessContact.MOD_ID, context.getModEventBus());
        TimelessContact.init();
    }
    public void initSlots(LivingEntity lv){
        CuriosApi.getCuriosInventory(lv).ifPresent(inv->{
            System.out.println("trigger");
            if(!inv.getModifiers().containsKey("plate")){
                System.out.println("Adding slots");
                inv.addPermanentSlotModifier("plate", UUID.randomUUID(),"plate_slot",2, AttributeModifier.Operation.ADDITION);
            }
        });
    }
}
