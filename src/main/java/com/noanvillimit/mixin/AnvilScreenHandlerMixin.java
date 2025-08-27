package com.noanvillimit.mixin;

import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnvilScreenHandler.class)
public class AnvilScreenHandlerMixin {

    /**
     * Remove the level 40 limit by intercepting the canTakeOutput method
     * and allowing operations regardless of player level
     */
    @Inject(method = "canTakeOutput", at = @At("HEAD"), cancellable = true)
    private void removeAnvilLevelLimit(CallbackInfoReturnable<Boolean> cir) {
        AnvilScreenHandler handler = (AnvilScreenHandler) (Object) this;

        // Check if there's a valid result in the output slot
        if (!handler.getSlot(2).getStack().isEmpty()) {
            // Always allow taking the output, regardless of player level
            cir.setReturnValue(true);
        }
    }
}
