package revilo.gnome.api.util;

import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import revilo.gnome.Tags;

public class GNOMEUtil {
    public static ResourceLocation gnomeId(@NotNull String path) {
        return new ResourceLocation(Tags.MOD_ID, path);
    }
}
