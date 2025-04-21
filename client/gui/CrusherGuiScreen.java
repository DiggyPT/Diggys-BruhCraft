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

import net.mcreator.diggysbruhcraft.world.inventory.CrusherGuiMenu;
import net.mcreator.diggysbruhcraft.procedures.GetTimerSpriteProcedure;
import net.mcreator.diggysbruhcraft.procedures.GetEnergyProcedure;
import net.mcreator.diggysbruhcraft.procedures.GetEnergyBarSpriteProcedure;
import net.mcreator.diggysbruhcraft.network.CrusherGuiButtonMessage;
import net.mcreator.diggysbruhcraft.DiggysBruhcraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CrusherGuiScreen extends AbstractContainerScreen<CrusherGuiMenu> {
	private final static HashMap<String, Object> guistate = CrusherGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_startup_normal;

	public CrusherGuiScreen(CrusherGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("diggys_bruhcraft:textures/screens/crusher_gui.png");

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

		guiGraphics.blit(new ResourceLocation("diggys_bruhcraft:textures/screens/arrow_other.png"), this.leftPos + 77, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("diggys_bruhcraft:textures/screens/timer.png"), this.leftPos + 42, this.topPos + 55, Mth.clamp((int) GetTimerSpriteProcedure.execute(world, x, y, z) * 16, 0, 112), 0, 16, 16, 128, 16);

		guiGraphics.blit(new ResourceLocation("diggys_bruhcraft:textures/screens/energy_bar.png"), this.leftPos + 134, this.topPos + 24, Mth.clamp((int) GetEnergyBarSpriteProcedure.execute(world, x, y, z) * 9, 0, 135), 0, 9, 32, 144, 32);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.crusher_gui.label_crusher"), 4, 6, -12829636, false);
		guiGraphics.drawString(this.font,

				GetEnergyProcedure.execute(world, x, y, z), 66, 59, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_startup_normal = new ImageButton(this.leftPos + 31, this.topPos + 30, 16, 16, 0, 0, 16, new ResourceLocation("diggys_bruhcraft:textures/screens/atlas/imagebutton_startup_normal.png"), 16, 32, e -> {
			if (true) {
				DiggysBruhcraftMod.PACKET_HANDLER.sendToServer(new CrusherGuiButtonMessage(0, x, y, z));
				CrusherGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_startup_normal", imagebutton_startup_normal);
		this.addRenderableWidget(imagebutton_startup_normal);
	}
}
