package revilo.gnome.common;

import net.minecraftforge.common.config.Config;
import revilo.gnome.Tags;

@Config(modid = Tags.MOD_ID)
public class GConfig {
    public static Util util = new Util();

    public static class Util {
        public boolean test;
    }
}
