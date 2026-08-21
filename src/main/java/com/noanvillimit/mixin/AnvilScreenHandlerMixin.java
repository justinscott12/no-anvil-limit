package com.noanvillimit.mixin;

import net.minecraft.world.inventory.AnvilMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnvilMenu.class)
public class AnvilScreenHandlerMixin {

    /**
     * Remove the anvil "Too Expensive!" level limit by intercepting the output
     * slot's mayPickup check (yarn: canTakeOutput) and always allowing the
     * player to take the result when one exists.
     */
    @Inject(method = "mayPickup", at = @At("HEAD"), cancellable = true)
    private void removeAnvilLevelLimit(CallbackInfoReturnable<Boolean> cir) {
        AnvilMenu handler = (AnvilMenu) (Object) this;

        // Slot 2 is the anvil output slot. If it holds a result, allow taking it.
        if (!handler.getSlot(2).getItem().isEmpty()) {
            cir.setReturnValue(true);
        }
    }
}
