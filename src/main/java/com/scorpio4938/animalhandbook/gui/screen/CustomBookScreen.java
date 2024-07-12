package com.scorpio4938.animalhandbook.gui.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.BookScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;

public class CustomBookScreen extends BookScreen {
    private static final String DEFAULT_TEXT_1 = "Default Text";

    public CustomBookScreen(Text title, ItemStack book) {
        super(new WrittenBookContents(book));
        setDefaultText(book);
    }

//    @Override
//    protected void init() {
//        super.init();
//    }

//    @Override
//    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
//        super.render(context, mouseX, mouseY, delta);
//        context.drawCenteredTextWithShadow(this.textRenderer, DEFAULT_TEXT_1, this.width / 2, this.height, 0xFFFFFF);
//    }

    private void setDefaultText(ItemStack book) {
        /*
         * Bug: This return '* invalid book tag *'
         */
        NbtCompound nbt = book.getOrCreateNbt();
        nbt.putString("author", "Author");
        nbt.putString("title", "Custom Book");
//        nbt.putString("pages", "[{\"text\":\"" + DEFAULT_TEXT_1 + "\"}]");
        nbt.putString("content", DEFAULT_TEXT_1);
        book.setNbt(nbt);
    }

}
