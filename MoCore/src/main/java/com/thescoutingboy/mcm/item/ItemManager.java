package com.thescoutingboy.mcm.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemManager {
	
	
	//Making Items
	
	public static Item InfusionTool;
	public static Item CTabPH1;
	
	//Register Items
	
	public static void registerItems() {
		
		GameRegistry.registerItem(InfusionTool, "InfusionTool");
		GameRegistry.registerItem(CTabPH1, "CTabPH1");
		
	}
	
	//Define Items
	
	public static void defineItems() {
		
		InfusionTool = new ItemInfusionTool();
		CTabPH1 = new ItemCTabPH1();
		
	}

}
