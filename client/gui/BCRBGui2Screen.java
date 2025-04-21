package net.mcreator.diggysbruhcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.diggysbruhcraft.world.inventory.BCRBGui2Menu;
import net.mcreator.diggysbruhcraft.network.BCRBGui2ButtonMessage;
import net.mcreator.diggysbruhcraft.DiggysBruhcraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BCRBGui2Screen extends AbstractContainerScreen<BCRBGui2Menu> {
	private final static HashMap<String, Object> guistate = BCRBGui2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;

	public BCRBGui2Screen(BCRBGui2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("diggys_bruhcraft:textures/screens/bcrb_gui_2.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 3 && mouseX < leftPos + 27 && mouseY > topPos + 111 && mouseY < topPos + 135) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_d"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 35 && mouseX < leftPos + 59 && mouseY > topPos + 110 && mouseY < topPos + 134) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_glacite_dust"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 63 && mouseX < leftPos + 87 && mouseY > topPos + 111 && mouseY < topPos + 135) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_rubber_log"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 96 && mouseX < leftPos + 120 && mouseY > topPos + 110 && mouseY < topPos + 134) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_rubber_pulp"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 124 && mouseX < leftPos + 148 && mouseY > topPos + 111 && mouseY < topPos + 135) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_resom"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 158 && mouseX < leftPos + 182 && mouseY > topPos + 111 && mouseY < topPos + 135) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_rubber_pulp1"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 188 && mouseX < leftPos + 212 && mouseY > topPos + 110 && mouseY < topPos + 134) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_ruby"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 220 && mouseX < leftPos + 244 && mouseY > topPos + 111 && mouseY < topPos + 135) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_ruby_dust"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 251 && mouseX < leftPos + 275 && mouseY > topPos + 110 && mouseY < topPos + 134) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_nutte"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 283 && mouseX < leftPos + 307 && mouseY > topPos + 111 && mouseY < topPos + 135) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_peanut_butter"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 1 && mouseX < leftPos + 25 && mouseY > topPos + 143 && mouseY < topPos + 167) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_glacite"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 24 && mouseX < leftPos + 48 && mouseY > topPos + 144 && mouseY < topPos + 168) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_mccainite"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 52 && mouseX < leftPos + 76 && mouseY > topPos + 144 && mouseY < topPos + 168) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_epikrok"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 79 && mouseX < leftPos + 103 && mouseY > topPos + 144 && mouseY < topPos + 168) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_iron_ingiot"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 102 && mouseX < leftPos + 126 && mouseY > topPos + 144 && mouseY < topPos + 168) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_coke"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 133 && mouseX < leftPos + 157 && mouseY > topPos + 144 && mouseY < topPos + 168) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_steel_ingot"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 158 && mouseX < leftPos + 182 && mouseY > topPos + 145 && mouseY < topPos + 169) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_steel_ingot1"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 183 && mouseX < leftPos + 207 && mouseY > topPos + 144 && mouseY < topPos + 168) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_coke1"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 212 && mouseX < leftPos + 236 && mouseY > topPos + 143 && mouseY < topPos + 167) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_cast_iron_ingot"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 238 && mouseX < leftPos + 262 && mouseY > topPos + 143 && mouseY < topPos + 167) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_glass_bottle"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 262 && mouseX < leftPos + 286 && mouseY > topPos + 144 && mouseY < topPos + 168) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_jelly"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 292 && mouseX < leftPos + 316 && mouseY > topPos + 143 && mouseY < topPos + 167) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.tooltip_grimace_shake"), mouseX, mouseY);
		}
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("diggys_bruhcraft:textures/screens/crusher_recipes.png"), this.leftPos + 6, this.topPos + 114, 0, 0, 298, 18, 298, 18);

		guiGraphics.blit(new ResourceLocation("diggys_bruhcraft:textures/screens/alloy_smelter_recipes.png"), this.leftPos + 6, this.topPos + 147, 0, 0, 307, 18, 307, 18);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.label_mob"), 7, 8, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.label_gug_spawns_in_rizz_plains_and_sl"), 8, 20, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.label_death_eels_spawn_in_their"), 8, 31, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.label_goofy_traders_spawn_in_their_sha"), 7, 52, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.label_bords_spawn_in_rizz_plains"), 7, 62, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.label_death_eel_structures_spawn_in_ri"), 7, 41, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.label_electric_smelter"), 6, 81, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.label_smelts_any_smeltable_item"), 5, 91, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.label_electric_crusher"), 7, 103, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.label_alloy_smelter_recipes"), 6, 135, -65536, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.button_empty"), e -> {
			if (true) {
				DiggysBruhcraftMod.PACKET_HANDLER.sendToServer(new BCRBGui2ButtonMessage(0, x, y, z));
				BCRBGui2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 128, this.topPos + 173, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.diggys_bruhcraft.bcrb_gui_2.button_empty1"), e -> {
			if (true) {
				DiggysBruhcraftMod.PACKET_HANDLER.sendToServer(new BCRBGui2ButtonMessage(1, x, y, z));
				BCRBGui2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 241, this.topPos + 174, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
