package net.zeropercent.oretastic.entity.custom;


import net.minecraft.entity.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.village.VillagerType;
import net.minecraft.world.World;
import net.zeropercent.oretastic.sound.ModSounds;
import net.zeropercent.oretastic.village.ModVillagerType;
import org.jetbrains.annotations.Nullable;

public class StoneVillagerEntity extends VillagerEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public StoneVillagerEntity(EntityType<? extends VillagerEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createStoneVillagerAttributes() {
        return VillagerEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3).
                add(EntityAttributes.GENERIC_MAX_HEALTH, 35.0f);
    }

    protected void updateLimbs(float posDelta) {
        float f;
        if (this.getPose() == EntityPose.STANDING) {
            f = Math.min(posDelta * 6.0F, 1.0F);
        } else {
            f = 0.0F;
        }

        this.limbAnimator.updateLimbs(f, 0.2F);
    }

    private void setupAnimationStates(){
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    public void tick() {
        super.tick();
        if(this.getWorld().isClient()) {
            setupAnimationStates();
        }
    }

    @Nullable
    public StoneVillagerEntity createChild(ServerWorld serverWorld, PassiveEntity passiveEntity) {
        double d = this.random.nextDouble();
        VillagerType villagerType;
        if (d < 0.5) {
            villagerType = VillagerType.forBiome(serverWorld.getBiome(this.getBlockPos()));
        } else if (d < 0.75) {
            villagerType = this.getVillagerData().getType();
        } else {
            villagerType = ((VillagerEntity)passiveEntity).getVillagerData().getType();
        }

        StoneVillagerEntity stoneVillagerEntity = new StoneVillagerEntity(EntityType.VILLAGER, serverWorld);
        stoneVillagerEntity.initialize(serverWorld, serverWorld.getLocalDifficulty(stoneVillagerEntity.getBlockPos()), SpawnReason.BREEDING, (EntityData)null, (NbtCompound)null);
        return stoneVillagerEntity;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_VILLAGER_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.STONE_VILLAGER_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return ModSounds.STONE_VILLAGER_HURT;
    }
}
