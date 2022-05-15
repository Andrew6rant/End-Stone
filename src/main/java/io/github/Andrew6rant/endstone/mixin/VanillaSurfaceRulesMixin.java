package io.github.Andrew6rant.endstone.mixin;

import io.github.Andrew6rant.endstone.Endstone;
import net.minecraft.block.Block;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.surfacebuilder.VanillaSurfaceRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VanillaSurfaceRules.class)
public class VanillaSurfaceRulesMixin {
    @Shadow
    private static MaterialRules.MaterialRule block(Block block) {
        return null;
    }
    @Inject(method = "getEndStoneRule", at = @At("RETURN"), cancellable = true)
    private static void changeEndstone(CallbackInfoReturnable<MaterialRules.MaterialRule> cir) {
        cir.setReturnValue(MaterialRules.sequence(block(Endstone.END_STONE),cir.getReturnValue()));
    }
}
