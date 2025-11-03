package deadlyentitydata.api;

import deadlyentitydata.utils.IEntityNbt;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;

public class EntityNbt {
    public static IEntityNbt _impl;

    public static NbtCompound Get(Entity entity) {
        return _impl.Get(entity);
    }
}
