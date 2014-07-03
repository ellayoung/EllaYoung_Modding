package ella.young.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.util.IIcon;

public class ChocolateIceCream  extends ItemFood{
	
	public ChocolateIceCream(int i, int j, boolean b) {
		super(j,b);
		setUnlocalizedName("chocolateicecream");

	}
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon("ellasmod:" + (this.getUnlocalizedName().substring(5)));
	}

}

