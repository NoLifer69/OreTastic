package net.zeropercent.oretastic.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.zeropercent.oretastic.OreTastic;

public class ModSounds {
    public static final SoundEvent METAL_DETECTOR_FOUND_ORE = registerSoundEvent(
            "metal_detector_found_ore");
    public static final SoundEvent STONE_VILLAGER_DEATH = registerSoundEvent(
            "stone_villager_death");
    public static final SoundEvent STONE_VILLAGER_HURT = registerSoundEvent(
            "stone_villager_hurt");


    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(OreTastic.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        OreTastic.LOGGER.debug("Registering ModSounds for " + OreTastic.MOD_ID);
    }
}
