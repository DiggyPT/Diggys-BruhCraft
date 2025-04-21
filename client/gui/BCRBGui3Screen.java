package net.mcreator.diggysbruhcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.diggysbruhcraft.world.inventory.BCRBGui3Menu;
import net.mcreator.diggysbruhcraft.network.BCRBGui3ButtonMessage;
import net.mcreator.diggysbruhcraft.DiggysBruhcraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BCRBGui3Screen extends AbstractContainerScreen<BCRBGui3Menu> {
	private final static HashMap<String, Object> guistate = BCRBGui3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;

	public BCRBGui3Screen(BCRBGui3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("diggys_bruhcraft:textures/screens/bcrb_gui_3.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_goofy_trader_trades"), 5, 4, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_peanut_butter_jelly"), 6, 15, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_hyper_nexus_guardian"), 6, 30, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_the_boss_spawnable_in_nexus_r"), 5, 42, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_to_spawn_it_break_the_hyper_nex"), 5, 53, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_coke_oven_recipes"), 6, 66, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_coal_coke"), 6, 77, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_objective"), 7, 139, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_get_a_pbj_lol"), 6, 148, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_empty_rubber_logs"), 6, 89, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_empty_rubber_logs_eventually_tur"), 7, 100, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_aquamarine"), 5, 112, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_aquamarine_is_dropped_in_aquamar"), 8, 122, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.label_eel_dungeons_that_spawn_in_rizze"), 7, 131, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.diggys_bruhcraft.bcrb_gui_3.button_empty"), e -> {
			if (true) {
				DiggysBruhcraftMod.PACKET_HANDLER.sendToServer(new BCRBGui3ButtonMessage(0, x, y, z));
				BCRBGui3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 141, this.topPos + 162, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
