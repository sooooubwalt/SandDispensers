package com.example;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.block.Blocks;
import net.minecraft.block.DispenserBlock;
import com.example.SandDispenserBehavior;

public class ExampleMod implements ModInitializer {
	public static final String MOD_ID = "modid";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// register sand dispenser behavior
		DispenserBlock.registerBehavior(Blocks.SAND, new SandDispenserBehavior());
	}
}
