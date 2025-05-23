package com.seniors.justlevelingfork.registry;

import com.seniors.justlevelingfork.JustLevelingFork;
import com.seniors.justlevelingfork.handler.HandlerCommonConfig;
import com.seniors.justlevelingfork.handler.HandlerResources;
import com.seniors.justlevelingfork.registry.aptitude.Aptitude;
import com.seniors.justlevelingfork.registry.passive.Passive;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.stream.Collectors;


public class RegistryPassives {
    public static final ResourceKey<Registry<Passive>> PASSIVES_KEY = ResourceKey.createRegistryKey(new ResourceLocation(JustLevelingFork.MOD_ID, "passives"));
    public static final DeferredRegister<Passive> PASSIVES = DeferredRegister.create(PASSIVES_KEY, JustLevelingFork.MOD_ID);
    public static final Supplier<IForgeRegistry<Passive>> PASSIVES_REGISTRY = PASSIVES.makeRegistry(() -> new RegistryBuilder<Passive>().disableSaving());

    public static final RegistryObject<Passive> ATTACK_DAMAGE = PASSIVES.register("attack_damage", () -> register("attack_damage", RegistryAptitudes.STRENGTH.get(), HandlerResources.create("textures/skill/strength/passive_attack_damage.png"), Attributes.ATTACK_DAMAGE, "96a891fe-5919-418d-8205-f50464391500", HandlerCommonConfig.HANDLER.instance().attackDamageValue, HandlerCommonConfig.HANDLER.instance().attackPassiveLevels));

    public static final RegistryObject<Passive> ATTACK_KNOCKBACK = PASSIVES.register("attack_knockback", () -> register("attack_knockback", RegistryAptitudes.STRENGTH.get(), HandlerResources.create("textures/skill/strength/passive_attack_knockback.png"), Attributes.ATTACK_KNOCKBACK, "96a891fe-5919-418d-8205-f50464391501", HandlerCommonConfig.HANDLER.instance().attackKnockbackValue, HandlerCommonConfig.HANDLER.instance().attackKnockbackPassiveLevels));

    public static final RegistryObject<Passive> MAX_HEALTH = PASSIVES.register("max_health", () -> register("max_health", RegistryAptitudes.CONSTITUTION.get(), HandlerResources.create("textures/skill/constitution/passive_max_health.png"), Attributes.MAX_HEALTH, "96a891fe-5919-418d-8205-f50464391502", HandlerCommonConfig.HANDLER.instance().maxHealthValue, HandlerCommonConfig.HANDLER.instance().maxHealthPassiveLevels));

    public static final RegistryObject<Passive> KNOCKBACK_RESISTANCE = PASSIVES.register("knockback_resistance", () -> register("knockback_resistance", RegistryAptitudes.CONSTITUTION.get(), HandlerResources.create("textures/skill/constitution/passive_knockback_resistance.png"), Attributes.KNOCKBACK_RESISTANCE, "96a891fe-5919-418d-8205-f50464391503", HandlerCommonConfig.HANDLER.instance().knockbackResistanceValue, HandlerCommonConfig.HANDLER.instance().knockbackResistancePassiveLevels));

    public static final RegistryObject<Passive> MOVEMENT_SPEED = PASSIVES.register("movement_speed", () -> register("movement_speed", RegistryAptitudes.DEXTERITY.get(), HandlerResources.create("textures/skill/dexterity/passive_movement_speed.png"), Attributes.MOVEMENT_SPEED, "96a891fe-5919-418d-8205-f50464391504", HandlerCommonConfig.HANDLER.instance().movementSpeedValue, HandlerCommonConfig.HANDLER.instance().movementSpeedPassiveLevels));

    public static final RegistryObject<Passive> PROJECTILE_DAMAGE = PASSIVES.register("projectile_damage", () -> register("projectile_damage", RegistryAptitudes.DEXTERITY.get(), HandlerResources.create("textures/skill/dexterity/passive_projectile_damage.png"), RegistryAttributes.PROJECTILE_DAMAGE.get(), "96a891fe-5919-418d-8205-f50464391505", HandlerCommonConfig.HANDLER.instance().projectileDamageValue, HandlerCommonConfig.HANDLER.instance().projectileDamagePassiveLevels));

    public static final RegistryObject<Passive> ARMOR = PASSIVES.register("armor", () -> register("armor", RegistryAptitudes.DEFENSE.get(), HandlerResources.create("textures/skill/defense/passive_armor.png"), Attributes.ARMOR, "96a891fe-5919-418d-8205-f50464391506", HandlerCommonConfig.HANDLER.instance().armorValue, HandlerCommonConfig.HANDLER.instance().armorPassiveLevels));

    public static final RegistryObject<Passive> ARMOR_TOUGHNESS = PASSIVES.register("armor_toughness", () -> register("armor_toughness", RegistryAptitudes.DEFENSE.get(), HandlerResources.create("textures/skill/defense/passive_armor_toughness.png"), Attributes.ARMOR_TOUGHNESS, "96a891fe-5919-418d-8205-f50464391507", HandlerCommonConfig.HANDLER.instance().armorToughnessValue, HandlerCommonConfig.HANDLER.instance().armorToughnessPassiveLevels));

    public static final RegistryObject<Passive> ATTACK_SPEED = PASSIVES.register("attack_speed", () -> register("attack_speed", RegistryAptitudes.INTELLIGENCE.get(), HandlerResources.create("textures/skill/intelligence/passive_attack_speed.png"), Attributes.ATTACK_SPEED, "96a891fe-5919-418d-8205-f50464391508", HandlerCommonConfig.HANDLER.instance().attackSpeedValue, HandlerCommonConfig.HANDLER.instance().attackSpeedPassiveLevels));

    public static final RegistryObject<Passive> ENTITY_REACH = PASSIVES.register("entity_reach", () -> register("entity_reach", RegistryAptitudes.INTELLIGENCE.get(), HandlerResources.create("textures/skill/intelligence/passive_entity_reach.png"), ForgeMod.ENTITY_REACH.get(), "96a891fe-5919-418d-8205-f50464391509", HandlerCommonConfig.HANDLER.instance().entityReachValue, HandlerCommonConfig.HANDLER.instance().entityReachPassiveLevels));

    public static final RegistryObject<Passive> BLOCK_REACH = PASSIVES.register("block_reach", () -> register("block_reach", RegistryAptitudes.BUILDING.get(), HandlerResources.create("textures/skill/building/passive_block_reach.png"), ForgeMod.BLOCK_REACH.get(), "96a891fe-5919-418d-8205-f50464391510", HandlerCommonConfig.HANDLER.instance().blockReachValue, HandlerCommonConfig.HANDLER.instance().blockReachPassiveLevels));

    public static final RegistryObject<Passive> BREAK_SPEED = PASSIVES.register("break_speed", () -> register("break_speed", RegistryAptitudes.BUILDING.get(), HandlerResources.create("textures/skill/building/passive_break_speed.png"), RegistryAttributes.BREAK_SPEED.get(), "96a891fe-5919-418d-8205-f50464391511", HandlerCommonConfig.HANDLER.instance().breakSpeedValue, HandlerCommonConfig.HANDLER.instance().breakSpeedPassiveLevels));

    public static final RegistryObject<Passive> MAGIC_RESIST = PASSIVES.register("magic_resist", () -> register("magic_resist", RegistryAptitudes.MAGIC.get(), HandlerResources.create("textures/skill/magic/passive_magic_resist.png"), RegistryAttributes.MAGIC_RESIST.get(), "96a891fe-5919-418d-8205-f50464391513", HandlerCommonConfig.HANDLER.instance().magicResistValue, HandlerCommonConfig.HANDLER.instance().magicResistPassiveLevels));

    public static final RegistryObject<Passive> CRITICAL_DAMAGE = PASSIVES.register("critical_damage", () -> register("critical_damage", RegistryAptitudes.LUCK.get(), HandlerResources.create("textures/skill/luck/passive_critical_damage.png"), RegistryAttributes.CRITICAL_DAMAGE.get(), "96a891fe-5919-418d-8205-f50464391515", HandlerCommonConfig.HANDLER.instance().criticalDamageValue, HandlerCommonConfig.HANDLER.instance().criticalDamagePassiveLevels));

    public static final RegistryObject<Passive> LUCK = PASSIVES.register("luck", () -> register("luck", RegistryAptitudes.LUCK.get(), HandlerResources.create("textures/skill/luck/passive_luck.png"), Attributes.LUCK, "96a891fe-5919-418d-8205-f50464391514", HandlerCommonConfig.HANDLER.instance().luckValue, HandlerCommonConfig.HANDLER.instance().luckPassiveLevels));

    private static Passive register(String name, Aptitude aptitude, ResourceLocation texture, Attribute attribute, String attributeUuid, Object attributeValue, int... levelsRequired) {
        ResourceLocation key = new ResourceLocation(JustLevelingFork.MOD_ID, name);
        return new Passive(key, aptitude, texture, attribute, attributeUuid, attributeValue, levelsRequired);
    }

    public static void load(IEventBus eventBus) {
        PASSIVES.register(eventBus);
    }

    public static Passive getPassive(String passiveName) {
        return PASSIVES_REGISTRY.get().getValues().stream().collect(Collectors.toMap(Passive::getName, Passive::get)).get(passiveName);
    }
}


