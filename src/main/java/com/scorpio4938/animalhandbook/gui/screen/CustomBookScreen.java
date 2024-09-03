package com.scorpio4938.animalhandbook.gui.screen;

import com.scorpio4938.animalhandbook.service.debug.DebugHandler;
import com.scorpio4938.animalhandbook.service.reader.EntityTypeReader;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.BookScreen;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.registry.Registries;

import java.util.Map;

@Environment(EnvType.CLIENT)
public class CustomBookScreen extends BookScreen {
    private final int largerWidth = 256; // Custom width

    private final int largerHeight = 180; // Custom height

    private final int customBackgroundWidth = 230; // Custom background size

    private final int customBackgroundHeight = 200;

    private static final String BOOK_AUTHOR = "Author";

    private static final String BOOK_TITLE = "Custom Book";

    private static final String DEFAULT_TEXT_1 = "This is a Animal Handbook, where you can find every and any animals in the game. Here we include values and settings of these animals.";

    private static final String DEFAULT_TEXT_2 = "Default Text page 2 :D";

    private ItemStack book;

    public CustomBookScreen(PlayerInventory playerInventory, ItemStack book) {
        super(new WrittenBookContents(book));
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
         * Solved
         * Bug: This return '* invalid book tag *'
         */

        // [ai's way] Create the NBT compound to store the book data.
//        NbtCompound bookTag = new NbtCompound();
        NbtCompound nbt = book.getOrCreateNbt();

        // Set the title, and author of the book.
        nbt.putString("author", BOOK_AUTHOR);
        nbt.putString("title", BOOK_TITLE);
//        nbt.putString("pages", "[{\"text\":\"" + DEFAULT_TEXT_1 + "\"}]");

        // Create a list for the pages.
        NbtList pages = new NbtList();
        pages.add(NbtString.of(DEFAULT_TEXT_1));
//        pages.add(NbtString.of(DEFAULT_TEXT_2));
        setContent(pages);

        // Add the pages to the book tag.
        nbt.put("pages", pages);

        // Set Nbt.
        book.setNbt(nbt);
    }

    private void setContent(NbtList pages) {
        for (Map.Entry<String, EntityType<?>> entityInfo : EntityTypeReader.getEntityTypes().entrySet()) {
            pages.add(NbtString.of(entityInfo.getKey() + entityInfo.getValue().getName().getString()));
        }
        DebugHandler.printDebug("Content Set");
    }
}
