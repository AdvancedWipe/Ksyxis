package ru.vidtu.ksyxis.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.chunk.listener.IChunkStatusListener;
import ru.vidtu.ksyxis.Ksyxis;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {
	@Inject(method = "prepareLevels", at = @At("HEAD"), cancellable = true)
	public void onPrepareLvls(IChunkStatusListener icsl, CallbackInfo ci) {
		Ksyxis.LOG.info("Not the long loadi-");
		ci.cancel();
	}
}
