package io.github.createcn.ohnetstems.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import io.github.createcn.ohnetstems.world.inventory.InfoGuiMenu;
import io.github.createcn.ohnetstems.network.InfoGuiButtonMessage;
import io.github.createcn.ohnetstems.OhnetstemsMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class InfoGuiScreen extends AbstractContainerScreen<InfoGuiMenu> {
	private final static HashMap<String, Object> guistate = InfoGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_close;

	public InfoGuiScreen(InfoGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("ohnetstems:textures/screens/img_202407132604_540x135.png"), this.leftPos + -136, this.topPos + -112, 0, 0, 270, 67, 270, 67);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.ohnetstems.info_gui.label_mod_auther"), -60, -61, -16711681, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ohnetstems.info_gui.label_mod_version_04beta"), -208, 104, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ohnetstems.info_gui.label_open_source_adress_githubcomc"), -136, -40, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ohnetstems.info_gui.label_or_giteecomcreatecnohnetstems"), -46, -22, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ohnetstems.info_gui.label_program_adress_modrinthcommod"), -136, -4, -205, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ohnetstems.info_gui.label_find_a_problem"), 129, 70, -52429, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ohnetstems.info_gui.label_please_issue_on"), 125, 86, -52429, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ohnetstems.info_gui.label_githubcomcreatecnohnetstemsi"), 24, 96, -52429, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ohnetstems.info_gui.label_or_giteecomcreatecnohnetstems1"), 14, 107, -52429, false);
	}

	@Override
	public void init() {
		super.init();
		button_close = Button.builder(Component.translatable("gui.ohnetstems.info_gui.button_close"), e -> {
			if (true) {
				OhnetstemsMod.PACKET_HANDLER.sendToServer(new InfoGuiButtonMessage(0, x, y, z));
				InfoGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -26, this.topPos + 54, 51, 20).build();
		guistate.put("button:button_close", button_close);
		this.addRenderableWidget(button_close);
	}
}
