package ella.young;

//Recipes
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

//MyBlocks Imports
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.item.ItemFood;

//MyBlocks
import ella.young.MyBlocks.RubyOre;
import ella.young.MyBlocks.StrawBerryBlock;
//MyItems
import ella.young.MyItems.RubyGem;
import ella.young.MyItems.Strawberry;
import ella.young.MyItems.VanillaIceCream;
import ella.young.MyItems.ChocolateIceCream;
import ella.young.MyItems.StrawberryIceCream;
import ella.young.MyItems.NeopolitanIceCream;
import ella.young.MyItems.CookieBits;

//MyTools
import net.minecraftforge.common.util.EnumHelper;
import ella.young.MyItems.RubySword;

public class MyCode {
	
	//List Blocks Here #setupBLOCK
	public static Block rubyOre;
	public static Block strawBerryBlock;
	
	//List Items Here #setupITEM
	public static Item rubyGem;
	public static Item Strawberry = new ItemFood(32, 10, false);
	public static Item VanillaIceCream = new ItemFood(15, 10, true);
	public static Item ChocolateIceCream = new ItemFood (15, 12, false);
	public static Item StrawberryIceCream = new ItemFood (15, 14, false);
	public static Item NeopolitanIceCream = new ItemFood (18, 16, true);
	public static Item CookieBits = new ItemFood (5, 3, false);

	
	//Tools
	public static Item RubySword;
	public static Item.ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 3, 800, 9.0F, 3.5F, 10);

	
	
	public static void MyBlocks(){		
		
		//Blocks #setupBLOCK
		//RubyOre
			rubyOre = new RubyOre (Material.ground)
			.setHardness(0.9F)
			.setStepSound(Block.soundTypeGravel)
			.setBlockName("rubyOre")
			.setCreativeTab(CreativeTabs.tabBlock)
			.setBlockTextureName("redstone_ore");
			
		//StrawBerry
			strawBerryBlock = new StrawBerryBlock (Material.ground)
			.setHardness(0.9F)
			.setStepSound(Block.soundTypeWood)
			.setBlockName("strawBerryBlock")
			.setCreativeTab(CreativeTabs.tabBlock)
			.setBlockTextureName("ellasmod:StrawBerryBlock");

		//Harvest Level 

		//Register #setupBLOCK
		GameRegistry.registerBlock(rubyOre, "RubyOre");
		GameRegistry.registerBlock(strawBerryBlock, "StrawBerryBlock");
	}


	public static void MyItems(){
		rubyGem = new RubyGem();
		Strawberry = new Strawberry(5015, 10, false).setUnlocalizedName("Strawberry");
		VanillaIceCream = new VanillaIceCream(5015, 10, true).setUnlocalizedName("vanillaicecream");
		ChocolateIceCream = new ChocolateIceCream(5010, 10, false).setUnlocalizedName("chocolateicecream");
		StrawberryIceCream = new StrawberryIceCream(5015, 10, false).setUnlocalizedName("strawberryicecream");
		NeopolitanIceCream = new NeopolitanIceCream(5015,10,false).setUnlocalizedName("neopolitanicecream");
		CookieBits = new CookieBits(5015, 10, false).setUnlocalizedName("cookiebits");
		
		//ruby sword
		RubySword = new RubySword(RUBY);
		
		GameRegistry.registerItem(Strawberry, "Strawberry");		
		GameRegistry.registerItem(rubyGem, "rubyGem");
		GameRegistry.registerItem(VanillaIceCream, "vanillaicecream");
		GameRegistry.registerItem(ChocolateIceCream, "chocolateicecream");
		GameRegistry.registerItem(RubySword, "RubySword");
		GameRegistry.registerItem(StrawberryIceCream, "strawberryicecream");
		GameRegistry.registerItem(NeopolitanIceCream, "neopolitanicecream");
		GameRegistry.registerItem(CookieBits, "cookiebits");
	}


public static void MyRecipes(){
	/*GameRegistry.addShapelessRecipe( new ItemStack(Blocks.brown_mushroom), new Object[] {new ItemStack(Items.cookie)});
	GameRegistry.addShapelessRecipe( new ItemStack(Items.emerald), new Object[] {new ItemStack(Blocks.dirt)});
	ItemStack mosssycobblestone = new ItemStack(Blocks.mossy_cobblestone);
	ItemStack cobblestone = new ItemStack(Blocks.cobblestone);
	ItemStack grass = new ItemStack(Blocks.grass);
	GameRegistry.addShapelessRecipe (mosssycobblestone, grass, cobblestone);*/
	
	
	ItemStack sugar = new ItemStack(Items.sugar);
	ItemStack milk = new ItemStack(Items.milk_bucket);
	ItemStack snow = new ItemStack(Blocks.snow);
	ItemStack cocoa = new ItemStack(Items.dye ,1, 3 );
	ItemStack strawberry = new ItemStack(Strawberry);
	ItemStack chocolateicecream = new ItemStack(ChocolateIceCream);
	ItemStack strawberryicecream = new ItemStack(StrawberryIceCream);
	ItemStack vanillaicecream = new ItemStack(VanillaIceCream);
	ItemStack neopolitan = new ItemStack(NeopolitanIceCream);
	ItemStack cookieb = new ItemStack(CookieBits);
	ItemStack cookie = new ItemStack(Items.cookie);
	GameRegistry.addShapelessRecipe (vanillaicecream, snow, milk, sugar);
	GameRegistry.addShapelessRecipe (chocolateicecream, snow, milk, sugar, cocoa);
	GameRegistry.addShapelessRecipe (chocolateicecream, vanillaicecream, cocoa);
	GameRegistry.addShapelessRecipe (strawberryicecream, vanillaicecream, strawberry);
	GameRegistry.addShapelessRecipe (strawberryicecream, snow, milk, sugar, strawberry);
	GameRegistry.addShapelessRecipe (neopolitan, vanillaicecream, chocolateicecream, strawberryicecream, snow);
	GameRegistry.addShapelessRecipe (cookieb, cookie);
	
	GameRegistry.addRecipe(new ItemStack(Blocks.bedrock), new Object[] {
		"SSS",
		"ODO",
		"EEE",
		'S', Blocks.stone,
		'O', Blocks.obsidian,
		'D', Blocks.diamond_ore,
		'E', Blocks.emerald_block, 
	});	
		GameRegistry.addSmelting(Items.cookie, new ItemStack(Items.cooked_beef,1), 0.01F);
		GameRegistry.addSmelting(Items.feather, new ItemStack(Items.string,1), 0.01F);
		GameRegistry.addSmelting(Blocks.soul_sand, new ItemStack(Blocks.netherrack, 1), 0.01F);
		GameRegistry.addSmelting(Blocks.hardened_clay, new ItemStack(Blocks.brick_block, 1), 0.01F);
	ItemStack newEnchantment = new ItemStack(Items.cooked_beef,1);
	newEnchantment.addEnchantment(Enchantment.knockback, 127);
	GameRegistry.addSmelting(Items.cookie,newEnchantment, 0.01F);
	
	ItemStack stick = new ItemStack(Items.stick,1);
	stick.addEnchantment(Enchantment.knockback, 127);
	GameRegistry.addSmelting(Blocks.brown_mushroom, stick, 0.01F);
}};
	
