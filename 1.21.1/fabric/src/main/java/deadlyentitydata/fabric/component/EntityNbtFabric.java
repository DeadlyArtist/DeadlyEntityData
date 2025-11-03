package deadlyentitydata.fabric.component;

import deadlyentitydata.utils.IEntityNbt;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;

public class EntityNbtFabric implements IEntityNbt {

    @Override
    public NbtCompound Get(Entity entity) {
        return ModComponentEntry.NBT.get(entity).nbtCompound;
    }
}
