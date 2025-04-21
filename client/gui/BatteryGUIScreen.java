package net.mcreator.diggysbruhcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.diggysbruhcraft.world.inventory.BatteryGUIMenu;
import net.mcreator.diggysbruhcraft.procedures.GetEnergyProcedure;
import net.mcreator.diggysbruhcraft.procedures.GetEnergyBarSpriteProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BatteryGUIScreen extends AbstractContainerScreen<BatteryGUIMenu> {
	private final static HashMap<String, Object> guistate = BatteryGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BatteryGUIScreen(BatteryGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("diggys_bruhcraft:textures/screens/battery_gui.png");

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

		guiGraphics.blit(new ResourceLocation("diggys_bruhcraft:textures/screens/energy_bar.png"), this.leftPos + 89, this.topPos + 33, Mth.clamp((int) GetEnergyBarSpriteProcedure.execute(world, x, y, z) * 9, 0, 135), 0, 9, 32, 144, 32);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.battery_gui.label_battery"), 6, 5, -12829636, false);
		guiGraphics.drawString(this.font,

				GetEnergyProcedure.execute(world, x, y, z), 32, 22, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
