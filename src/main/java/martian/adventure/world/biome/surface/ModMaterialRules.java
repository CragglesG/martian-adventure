package martian.adventure.world.biome.surface;

import martian.adventure.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule BASALT = makeStateRule(Blocks.BASALT);
    private static final MaterialRules.MaterialRule FLOOR_BLOCK = makeStateRule(Blocks.RED_SAND);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, FLOOR_BLOCK), BASALT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.MARS_BIOME),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)))
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
