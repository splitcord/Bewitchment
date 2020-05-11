package com.bewitchment.common.integration;

import c4.consecration.common.init.ConsecrationItems;
import c4.consecration.common.init.ConsecrationPotions;
import com.bewitchment.Bewitchment;
import com.bewitchment.Util;
import com.bewitchment.api.registry.AltarUpgrade;
import com.bewitchment.api.registry.Brew;
import com.bewitchment.api.registry.CauldronRecipe;
import com.bewitchment.common.integration.thaumcraft.ThaumcraftCompat;
import com.bobmowzie.mowziesmobs.server.item.ItemHandler;
import com.bobmowzie.mowziesmobs.server.potion.PotionHandler;
import com.miskatonicmysteries.registry.ModObjects;
import com.miskatonicmysteries.registry.ModPotions;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import vazkii.quark.base.module.ModuleLoader;
import vazkii.quark.world.feature.*;

import java.util.Arrays;

import static vazkii.quark.misc.feature.ExtraPotions.dangerSight;
import static vazkii.quark.misc.feature.ExtraPotions.enableDangerSight;
import static vazkii.quark.world.feature.Biotite.biotite;
import static vazkii.quark.world.feature.CaveRoots.*;
import static vazkii.quark.world.feature.Crabs.crabShell;
import static vazkii.quark.world.feature.Crabs.resilience;
import static vazkii.quark.world.feature.Frogs.gildedFrogLeg;
import static vazkii.quark.world.feature.UndergroundBiomes.glowceliumEnabled;
import static vazkii.quark.world.feature.UndergroundBiomes.glowshroom;

public class Compat {
	public static void init() {
		if (Loader.isModLoaded("betteranimalsplus")) {
			BAPCompat.registerBAPHeadAlter();
		}
		if (Loader.isModLoaded("thaumcraft")) {
			ThaumcraftCompat.init();
		}
		if (Loader.isModLoaded("elementaristics")) {
			ElementaristicsCompat.registerElementaristicsStuff();
		}
		if (Loader.isModLoaded("miskatonicmysteries")) {
			MiskatonicMysteriesCompat.registerMiskatonicMysteriesStuff();
		}
	}
	
	//Todo: Find out why this isn't working
	@Optional.Method(modid = "miskatonicmysteries")
	@SubscribeEvent
	public static void registerManiaBrews(RegistryEvent.Register<Brew> event) {
		event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "a_poem_for_byzantium"), Util.get(ModObjects.infested_wheat), new PotionEffect(ModPotions.mania, (600))));
	}
	
	//Todo: Find out why the hell this isn't working.
	@Optional.Method(modid = "covetedmobs")
	@SubscribeEvent
	public static void registerCMBrews(RegistryEvent.Register<Brew> event) {
		event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "eye_of_newt_sight"), Util.get(com.covetedmobs.registry.ModObjects.eye_of_newt), new PotionEffect(MobEffects.NIGHT_VISION, (20 * 120))));
		event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "sting"), Util.get(com.covetedmobs.registry.ModObjects.blindworms_sting), new PotionEffect(MobEffects.POISON, (20 * 20))));
	}
	
	//Todo: Find out why the hell this isn't working.
	@Optional.Method(modid = "covetedmobs")
	@SubscribeEvent
	public static void registerCMRecipes(RegistryEvent.Register<CauldronRecipe> event) {
		//Alts that don't use lizard legs
		event.getRegistry().register(new CauldronRecipe(new ResourceLocation(Bewitchment.MODID, "stew_of_the_grotesque_alt_1"), Arrays.asList(Util.get(com.bewitchment.registry.ModObjects.demonic_elixir), Util.get(com.bewitchment.registry.ModObjects.heart), Util.get(Items.MUTTON), Util.get(Items.SLIME_BALL), Util.get(com.bewitchment.registry.ModObjects.toe_of_frog), Util.get(com.covetedmobs.registry.ModObjects.blindworms_sting), Util.get(com.bewitchment.registry.ModObjects.adders_fork), Util.get(com.bewitchment.registry.ModObjects.belladonna), Util.get(com.bewitchment.registry.ModObjects.hellebore)), Arrays.asList(new ItemStack(com.bewitchment.registry.ModObjects.stew_of_the_grotesque), new ItemStack(com.bewitchment.registry.ModObjects.empty_jar))));
		event.getRegistry().register(new CauldronRecipe(new ResourceLocation(Bewitchment.MODID, "stew_of_the_grotesque_alt_2"), Arrays.asList(Util.get(com.bewitchment.registry.ModObjects.demonic_elixir), Util.get(com.bewitchment.registry.ModObjects.heart), Util.get(Items.MUTTON), Util.get(Items.SLIME_BALL), Util.get(com.bewitchment.registry.ModObjects.toe_of_frog), Util.get(com.covetedmobs.registry.ModObjects.eye_of_newt), Util.get(com.bewitchment.registry.ModObjects.adders_fork), Util.get(com.bewitchment.registry.ModObjects.belladonna), Util.get(com.bewitchment.registry.ModObjects.hellebore)), Arrays.asList(new ItemStack(com.bewitchment.registry.ModObjects.stew_of_the_grotesque), new ItemStack(com.bewitchment.registry.ModObjects.empty_jar))));
	}
	
	@Optional.Method(modid = "mowziesmobs")
	@SubscribeEvent
	public void registerMowziesBrew(RegistryEvent.Register<Brew> event) {
		Util.registerAltarUpgradeItem(ItemHandler.ICE_CRYSTAL, new AltarUpgrade(AltarUpgrade.Type.PENTACLE, 2, 0));
		event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "poison_resistance"), Util.get(ItemHandler.NAGA_FANG), new PotionEffect(PotionHandler.POISON_RESIST, (600))));
		event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "mowzie_vision"), Util.get(ItemHandler.GLOWING_JELLY), new PotionEffect(MobEffects.NIGHT_VISION, (20 * 120))));
	}
	
	@Optional.Method(modid = "consecration")
	@SubscribeEvent
	public void registerConsecrationBrew(RegistryEvent.Register<Brew> event) {
		event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "consecrated_water"), Util.get(ConsecrationItems.blessedDust), new PotionEffect(ConsecrationPotions.HOLY_POTION, 1)));
	}
	
	@Optional.Method(modid = "quark")
	@SubscribeEvent
	public void registerQuarkBrew(RegistryEvent.Register<Brew> event) {
		event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "prismarine_haste"), Util.get(Items.PRISMARINE_CRYSTALS), new PotionEffect(MobEffects.HASTE, (20 * 30))));
		if (ModuleLoader.isFeatureEnabled(Frogs.class)) event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "frog_boost"), Util.get(gildedFrogLeg), new PotionEffect(MobEffects.JUMP_BOOST, (20 * 30))));
		if (ModuleLoader.isFeatureEnabled(Biotite.class)) event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "biotite_resistance"), Util.get(biotite), new PotionEffect(MobEffects.RESISTANCE, (20 * 30))));
		if (ModuleLoader.isFeatureEnabled(UndergroundBiomes.class) && enableDangerSight && glowceliumEnabled)
			event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "danger_sight"), Util.get(glowshroom), new PotionEffect(dangerSight, (20 * 30))));
		if (ModuleLoader.isFeatureEnabled(CaveRoots.class) && enableFlowers) {
			event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "blueberry"), Util.get(new ItemStack(root_flower, 1, 0)), new PotionEffect(blue_effect, (20 * 30))));
			event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "blackening"), Util.get(new ItemStack(root_flower, 1, 1)), new PotionEffect(black_effect, (20 * 30))));
			event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "whitening"), Util.get(new ItemStack(root_flower, 1, 2)), new PotionEffect(white_effect, (20 * 30))));
		}
		if (ModuleLoader.isFeatureEnabled(Crabs.class)) event.getRegistry().register(new Brew(new ResourceLocation(Bewitchment.MODID, "stability"), Util.get(crabShell), new PotionEffect(resilience, (20 * 30))));
	}
}
