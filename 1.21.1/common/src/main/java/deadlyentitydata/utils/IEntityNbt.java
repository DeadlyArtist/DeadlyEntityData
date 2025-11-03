package deadlyentitydata.utils;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;

public interface IEntityNbt {
    public NbtCompound Get(Entity entity);
}
