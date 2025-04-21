package net.mcreator.diggysbruhcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.diggysbruhcraft.world.inventory.CokeOvenGuiMenu;
import net.mcreator.diggysbruhcraft.procedures.GetTimerSpriteCokeOvenProcedure;
import net.mcreator.diggysbruhcraft.network.CokeOvenGuiButtonMessage;
import net.mcreator.diggysbruhcraft.DiggysBruhcraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CokeOvenGuiScreen extends AbstractContainerScreen<CokeOvenGuiMenu> {
	private final static HashMap<String, Object> guistate = CokeOvenGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_startup_normal;

	public CokeOvenGuiScreen(CokeOvenGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("diggys_bruhcraft:textures/screens/coke_oven_gui.png");

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
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("diggys_bruhcraft:textures/screens/timer.png"), this.leftPos + 81, this.topPos + 56, Mth.clamp((int) GetTimerSpriteCokeOvenProcedure.execute(world, x, y, z) * 16, 0, 112), 0, 16, 16, 128, 16);

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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.coke_oven_gui.label_coke_oven"), 5, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_startup_normal = new ImageButton(this.leftPos + 81, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("diggys_bruhcraft:textures/screens/atlas/imagebutton_startup_normal.png"), 16, 32, e -> {
			if (true) {
				DiggysBruhcraftMod.PACKET_HANDLER.sendToServer(new CokeOvenGuiButtonMessage(0, x, y, z));
				CokeOvenGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_startup_normal", imagebutton_startup_normal);
		this.addRenderableWidget(imagebutton_startup_normal);
	}
}
