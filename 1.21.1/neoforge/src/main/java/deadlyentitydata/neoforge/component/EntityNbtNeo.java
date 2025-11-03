package deadlyentitydata.neoforge.component;

import deadlyentitydata.utils.IEntityNbt;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;

public class EntityNbtNeo implements IEntityNbt {

    @Override
    public NbtCompound Get(Entity entity) {
        return entity.getData(ModAttachments.NBT);
    }
}
