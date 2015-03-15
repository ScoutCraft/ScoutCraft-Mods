package com.thescoutingboy.mcm.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.thescoutingboy.mcm.refstrings.RefStrings;

public class MCM_Items {
	
	//Making Item (I Think!)
	public static Item infusion_item;
	
	//Initialization Method
	public static void init() {
		
		infusion_item = new Item().setUnlocalizedName("infusion_item");
		
	}

	//Register Method
	public static void register() {
		
		GameRegistry.registerItem(infusion_item, infusion_item.getUnlocalizedName().substring(5));
		
	}
	
	//Register Render(s) Methods
	public static void registerRenders() {
		
		registerRender(infusion_item);
		
	}
	
	public static void registerRender(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(RefStrings.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
	

}
