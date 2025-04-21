package net.mcreator.diggysbruhcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.diggysbruhcraft.world.inventory.BCRBGui1Menu;
import net.mcreator.diggysbruhcraft.network.BCRBGui1ButtonMessage;
import net.mcreator.diggysbruhcraft.DiggysBruhcraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BCRBGui1Screen extends AbstractContainerScreen<BCRBGui1Menu> {
	private final static HashMap<String, Object> guistate = BCRBGui1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;

	public BCRBGui1Screen(BCRBGui1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("diggys_bruhcraft:textures/screens/bcrb_gui_1.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_overworld_generation"), 8, 7, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_tin_ore"), 7, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_rizzville_dimension_frame"), 12, 35, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_same_as_nether"), 10, 47, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_activate_with_flint_rizz"), 10, 58, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_rizzville_biomes"), 11, 70, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_rizz_plains_rizz_mato"), 11, 82, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_rizz_plains_nutte_rubber_tree"), 11, 92, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_rizz_mato_grain_bales"), 11, 103, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_rizzert_rizz_sand_and_rizz_clay"), 10, 115, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_rizzville_rocks"), 10, 126, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_slate_default_glacite_mccain"), 9, 138, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.label_rizz_sand_and_rizz_clay_spawn_in"), 7, 147, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.diggys_bruhcraft.bcrb_gui_1.button_empty"), e -> {
			if (true) {
				DiggysBruhcraftMod.PACKET_HANDLER.sendToServer(new BCRBGui1ButtonMessage(0, x, y, z));
				BCRBGui1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 169, this.topPos + 166, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
