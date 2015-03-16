package com.thescoutingboy.texture;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

import com.thescoutingboy.mcm.item.ItemManager;

public class TextureManager {
	
	//Register Item & Block's Textures
	
	public static void registerItemTextures() {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ItemManager.InfusionTool, 0, new ModelResourceLocation("mcm:InfusionTool", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ItemManager.CTabPH1, 0, new ModelResourceLocation("mcm:CTabPH1", "inventory"));
		
	}
	
	public static void registerBlockTextures() {
		
		
		
	}

}
