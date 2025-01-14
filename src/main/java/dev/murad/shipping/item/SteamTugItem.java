package dev.murad.shipping.item;

import dev.murad.shipping.entity.custom.tug.SteamTugEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class SteamTugItem extends AbstractEntityAddItem {
    public SteamTugItem(Properties p_i48526_2_) {
        super(p_i48526_2_);
    }

    protected Entity getEntity(World world, RayTraceResult raytraceresult) {
        return new SteamTugEntity(world, raytraceresult.getLocation().x, raytraceresult.getLocation().y, raytraceresult.getLocation().z);
    }

}
