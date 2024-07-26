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

import io.github.createcn.ohnetstems.world.inventory.CyberIllitetateGUIMenu;
import io.github.createcn.ohnetstems.network.CyberIllitetateGUIButtonMessage;
import io.github.createcn.ohnetstems.OhnetstemsMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class CyberIllitetateGUIScreen extends AbstractContainerScreen<CyberIllitetateGUIMenu> {
	private final static HashMap<String, Object> guistate = CyberIllitetateGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_close;

	public CyberIllitetateGUIScreen(CyberIllitetateGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("ohnetstems:textures/screens/cyber_illitetate_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 147 && mouseX < leftPos + 171 && mouseY > topPos + -119 && mouseY < topPos + -95)
			guiGraphics.renderTooltip(font, Component.translatable("gui.ohnetstems.cyber_illitetate_gui.tooltip_xiang_jian_bzhan_upzhuang_bu_chun"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("ohnetstems:textures/screens/img_202407269122_544x194.png"), this.leftPos + -127, this.topPos + -103, 0, 0, 272, 97, 272, 97);

		guiGraphics.blit(new ResourceLocation("ohnetstems:textures/screens/wenhao.png"), this.leftPos + 151, this.topPos + -113, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.ohnetstems.cyber_illitetate_gui.label_jing_dian_yong_liu_chuan"), -73, 14, -39322, false);
	}

	@Override
	public void init() {
		super.init();
		button_close = Button.builder(Component.translatable("gui.ohnetstems.cyber_illitetate_gui.button_close"), e -> {
			if (true) {
				OhnetstemsMod.PACKET_HANDLER.sendToServer(new CyberIllitetateGUIButtonMessage(0, x, y, z));
				CyberIllitetateGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -16, this.topPos + 47, 51, 20).build();
		guistate.put("button:button_close", button_close);
		this.addRenderableWidget(button_close);
	}
}
