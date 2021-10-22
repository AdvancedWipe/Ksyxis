package ru.vidtu.ksyxis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;

@Mod("ksyxis")
public class Ksyxis {
	public static final Logger LOG = LogManager.getLogger("Ksyxis");
	public Ksyxis() {
		LOG.warn("Ksyxis will speedup your world loading. :P");
		LOG.warn("BUT IT MAY CAUSE ISSUES (INCLUDING COMPAT). DON'T ASK OTHER MODS' AUTHORS FOR COMPAT!");
		try {
			Class.forName("org.spongepowered.asm.mixin.Mixins");
		} catch (Throwable t) {
			LOG.error("======== Ksyxis ========");
			LOG.error("MIXIN IS NOT FOUND!");
			LOG.error("THIS IS NOT A MOD ERROR!");
			LOG.error("YOU MUST INSTALL ONE OF:");
			LOG.error("https://github.com/LXGaming/MixinBootstrap/releases");
			LOG.error("https://github.com/IzzelAliz/MixinLoader/releases");
			LOG.error("(or another Mixin library)");
			throw new RuntimeException("Mixin is not loaded. Install MixinBootstrap/MixinLoader.");
		}
	}
}
