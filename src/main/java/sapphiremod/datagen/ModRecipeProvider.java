package sapphiremod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import sapphiremod.block.ModBlocks;
import sapphiremod.item.ModItems;


import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {

        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.SAPPHIRE, RecipeCategory.DECORATIONS, ModBlocks.SAPPHIRE_BLOCK,
                "sapphiremod:sapphireb_block_from_sapphire",  null, "sapphiremod:sapphire_from_sapphire_block",  null);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_AXE, 1)
                .pattern("XX ")
                .pattern("XO ")
                .pattern(" O ")
                .input('X', ModItems.SAPPHIRE)
                .input('O', Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.SAPPHIRE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_PICKAXE, 1)
                .pattern("XXX")
                .pattern(" O ")
                .pattern(" O ")
                .input('X', ModItems.SAPPHIRE)
                .input('O', Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.SAPPHIRE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_SHOVEL, 1)
                .pattern(" X ")
                .pattern(" O ")
                .pattern(" O ")
                .input('X', ModItems.SAPPHIRE)
                .input('O', Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.SAPPHIRE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_SWORD, 1)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" O ")
                .input('X', ModItems.SAPPHIRE)
                .input('O', Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.SAPPHIRE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_HOE, 1)
                .pattern("XX ")
                .pattern(" O ")
                .pattern(" O ")
                .input('X', ModItems.SAPPHIRE)
                .input('O', Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.SAPPHIRE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_HELMET, 1)
                .pattern("XXX")
                .pattern("X X")
                .input('X', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.SAPPHIRE_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_CHESTPLATE, 1)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.SAPPHIRE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_LEGGINGS, 1)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.SAPPHIRE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_BOOTS, 1)
                .pattern("X X")
                .pattern("X X")
                .input('X', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.SAPPHIRE_BOOTS)));
    }
}
