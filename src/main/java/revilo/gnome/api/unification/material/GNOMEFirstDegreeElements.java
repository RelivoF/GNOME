package revilo.gnome.api.unification.material;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.properties.ToolProperty;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;

import static revilo.gnome.api.unification.material.GNOMEMaterials.*;
import static revilo.gnome.api.util.GNOMEUtil.gnomeId;


public class GNOMEFirstDegreeElements {

    public static void init() {
        Mythril = new Material.Builder(22501, gnomeId("mythril"))
                .ingot().fluid()
                .color(0xdfe6e0).iconSet(MaterialIconSet.BRIGHT)
                .flags(EXT_METAL, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD,
                        GENERATE_DOUBLE_PLATE)
                .components(Palladium, 5, Silicon, 6, Osmium, 2, Gold, 8, Oxygen, 1)
                .toolStats(ToolProperty.Builder.of(14.0f, 20.0f, 32550, 6)
                        .attackSpeed(0.9f).enchantability(28).magnetic().build())
                .build();

    }

}
