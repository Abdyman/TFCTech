package tfctech;

import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

import net.dries007.tfc.api.util.TFCConstants;
import tfctech.client.ModGuiHandler;

//todo add required dependency TFC-Metallum

@SuppressWarnings("WeakerAccess")
@Mod(modid = TFCTech.MODID, name = TFCTech.NAME, version = TFCTech.VERSION, dependencies = "required-after:" + TFCConstants.MOD_ID)
public class TFCTech
{
    public static final String MODID = "tfctech";
    public static final String NAME = "TFCTech Unofficial";
    public static final String VERSION = "@VERSION@";

    @Mod.Instance
    private static TFCTech instance = null;

    public static SimpleNetworkWrapper getNetwork()
    {
        return instance.network;
    }

    private static Logger logger;

    public static Logger getLog()
    {
        return logger;
    }

    public static TFCTech getInstance()
    {
        return instance;
    }

    private SimpleNetworkWrapper network;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new ModGuiHandler());
        network = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);
        int id = 0;
        //network.registerMessage(new PacketGuiButton.Handler(), PacketGuiButton.class, ++id, Side.SERVER);
    }
}