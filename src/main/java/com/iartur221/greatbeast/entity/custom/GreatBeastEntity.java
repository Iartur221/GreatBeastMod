package com.iartur221.greatbeast.entity.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;


public class GreatBeastEntity extends Zombie{

    public GreatBeastEntity(EntityType<? extends Zombie> type, Level worldIn) {
        super(type, worldIn);
    }
    //how strong is the monster
    public static AttributeSupplier.Builder prepareattributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.ATTACK_DAMAGE, 10.0)
            .add(Attributes.MAX_HEALTH, 500.0)
            .add(Attributes.MOVEMENT_SPEED, 2.0)
            .add(Attributes.ARMOR, 10.0D)
            .add(Attributes.ARMOR_TOUGHNESS, 10.0D)
            .add(Attributes.FOLLOW_RANGE, 120.0D)
            .add(Attributes.SPAWN_REINFORCEMENTS_CHANCE, 0.0D);
    }

    //what is the monster going to do; act like a zombie
    @Override
    protected void registerGoals() {
        super.registerGoals();    
    }

    @Override
    protected void addBehaviourGoals() {
        super.addBehaviourGoals();
    }

    @Override
    protected int getExperienceReward(Player player) {
        return 2137;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.PIG_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource p_34327_) {
        return SoundEvents.COW_HURT;
    }

    @Override
    protected boolean convertsInWater() {
        return false;
    }

    @Override
    protected boolean isSunSensitive() {
        return false;
    }

    @Override
    public boolean hurt(DamageSource p_34288_, float p_34289_) {
        return super.hurt(p_34288_, p_34289_);
    }
    
}
