package com.scorpio4938.animalhandbook.gui.screen.tries;

import com.scorpio4938.animalhandbook.service.debug.DebugHandler;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;

public class CustomBookScreen2 extends HandledScreen<ScreenHandler> {

    public CustomBookScreen2(ScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        // Initialize your custom screen (buttons, layout, etc.)
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {

    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        // Handle mouse clicks, like turning pages
        DebugHandler.printDebug(this.getClass().getName() + " Clicked");
        return super.mouseClicked(mouseX, mouseY, button);
    }
}
