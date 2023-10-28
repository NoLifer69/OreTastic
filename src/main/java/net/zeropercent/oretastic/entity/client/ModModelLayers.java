package net.zeropercent.oretastic.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.OreTastic;

public class ModModelLayers {
    public static final EntityModelLayer FROST_ELEMENTAL =
            new EntityModelLayer(new Identifier(OreTastic.MOD_ID, "frost_elemental"), "main");

    public static final EntityModelLayer STONE_VILLAGER =
            new EntityModelLayer(new Identifier(OreTastic.MOD_ID, "stone_villager"), "main");

    public static final EntityModelLayer ICE_GOBLIN =
            new EntityModelLayer(new Identifier(OreTastic.MOD_ID, "ice_goblin"), "main");

    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(OreTastic.MOD_ID, "porcupine"), "main");
}
