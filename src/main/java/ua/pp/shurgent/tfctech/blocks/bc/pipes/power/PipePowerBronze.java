package ua.pp.shurgent.tfctech.blocks.bc.pipes.power;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.ForgeDirection;
import ua.pp.shurgent.tfctech.TFCTech;
import ua.pp.shurgent.tfctech.core.ModPipeIconProvider;
import buildcraft.api.core.IIconProvider;
import buildcraft.transport.pipes.PipePowerStone;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PipePowerBronze extends PipePowerStone {

	public PipePowerBronze(Item item) {
		super(item);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIconProvider getIconProvider() {
		return TFCTech.instance.pipeIconProvider;
	}

	@Override
	public int getIconIndex(ForgeDirection direction) {
		return ModPipeIconProvider.TYPE.PipePowerBronze.ordinal();
	}
}