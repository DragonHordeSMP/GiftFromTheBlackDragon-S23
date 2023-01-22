package plus.dragons.gftbd23.mixin;

import com.github.alexthe668.cloudstorage.block.StaticCloudChestBlockEntity;
import net.minecraft.core.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import javax.annotation.Nullable;

@Mixin(StaticCloudChestBlockEntity.class)
public class StaticCloudChestBlockEntityMixin {

    @SuppressWarnings("all")
    @Inject(method = "getCapability", at = @At("HEAD"))
    private <T> void injected(Capability<T> capability, @Nullable Direction facing, CallbackInfoReturnable<LazyOptional<T>> cir) {
        // Just give it whatever direction. No impact.
        if(facing==null)
            facing = Direction.UP;
    }
}
