
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import io.github.createcn.ohnetstems.world.inventory.InfoGuiMenu;
import io.github.createcn.ohnetstems.world.inventory.CyberIllitetateGUIMenu;
import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, OhnetstemsMod.MODID);
	public static final RegistryObject<MenuType<InfoGuiMenu>> INFO_GUI = REGISTRY.register("info_gui", () -> IForgeMenuType.create(InfoGuiMenu::new));
	public static final RegistryObject<MenuType<CyberIllitetateGUIMenu>> CYBER_ILLITETATE_GUI = REGISTRY.register("cyber_illitetate_gui", () -> IForgeMenuType.create(CyberIllitetateGUIMenu::new));
}
