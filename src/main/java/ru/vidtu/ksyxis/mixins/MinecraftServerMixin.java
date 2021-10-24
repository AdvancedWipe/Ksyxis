package ru.vidtu.ksyxis.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.server.ServerChunkProvider;
import ru.vidtu.ksyxis.Ksyxis;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {
	@Redirect(method = "prepareLevels", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/server/ServerChunkProvider;getTickingGenerated()I"))
	public int onPrepareLvls_redirectTickingGenerated(ServerChunkProvider scp) {
		Ksyxis.LOG.info("Not the long loadi-");
		return 441;
	}
}
