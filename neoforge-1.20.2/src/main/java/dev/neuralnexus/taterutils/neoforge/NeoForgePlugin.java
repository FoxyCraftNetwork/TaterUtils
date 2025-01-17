package dev.neuralnexus.taterutils.neoforge;

import com.mojang.logging.LogUtils;
import dev.neuralnexus.taterlib.common.event.api.ServerEvents;
import dev.neuralnexus.taterlib.neoforge.logger.NeoForgeLogger;
import dev.neuralnexus.taterutils.common.TaterUtils;
import dev.neuralnexus.taterutils.common.TaterUtilsPlugin;
import net.neoforged.fml.common.Mod;

/**
 * NeoForge entry point.
 */
@Mod(TaterUtils.Constants.PROJECT_ID)
public class NeoForgePlugin implements TaterUtilsPlugin {
    public NeoForgePlugin() {
        ServerEvents.STOPPED.register(event -> pluginStop());
        pluginStart(this, new NeoForgeLogger(LogUtils.getLogger()));
    }
}
