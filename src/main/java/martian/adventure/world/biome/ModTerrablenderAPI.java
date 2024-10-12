package martian.adventure.world.biome;

import martian.adventure.MartianAdventure;
import martian.adventure.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(Identifier.of(MartianAdventure.MOD_ID, "overworld"), 80));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MartianAdventure.MOD_ID, ModMaterialRules.makeRules());
    }
}
