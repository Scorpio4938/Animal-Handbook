package com.scorpio4938.animalhandbook.gui.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.BookScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.text.Text;

public class CustomBookScreen extends BookScreen {
    private static final String DEFAULT_TEXT_1 = "Default Text";
    private ItemStack book;

    public CustomBookScreen(PlayerInventory playerInventory, ItemStack book) {
        super(new WrittenBookContents(book));
//        super(new CustomBook);
        this.book = book;
        setDefaultText(book);
    }

    @Override
    protected void init() {
        super.init();
        this.setPageProvider(new WrittenBookContents(this.book));
    }

//    @Override
//    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
//        super.render(context, mouseX, mouseY, delta);
//    }


    private void setDefaultText(ItemStack book) {
        /*
         * Bug: This return '* invalid book tag *'
         */
        NbtCompound nbt = book.getOrCreateNbt();
        nbt.putString("author", "Author");
        nbt.putString("title", "Custom Book");
//        nbt.putString("pages", "[{\"text\":\"" + DEFAULT_TEXT_1 + "\"}]");
//        nbt.putString("content", DEFAULT_TEXT_1);

        // Create a list for the pages
        NbtList pages = new NbtList();
        pages.add(NbtString.of(Text.Serializer.toJson(Text.of("This is page 2"))));

        // Add the pages to the book tag
        nbt.put("pages", pages);
        book.setNbt(nbt);
    }

}
