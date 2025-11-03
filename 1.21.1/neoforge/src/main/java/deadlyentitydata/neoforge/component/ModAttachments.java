package deadlyentitydata.neoforge.component;

import deadlyentitydata.neoforge.RegistryInitManagerNeo;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.codec.PacketCodecs;
import net.neoforged.neoforge.attachment.AttachmentType;

import java.util.function.Supplier;

public class ModAttachments {

    public static final Supplier<AttachmentType<NbtCompound>> NBT = RegistryInitManagerNeo.ATTACHMENT_TYPES.register("nbt", () -> AttachmentType.builder(() -> new NbtCompound()).sync(PacketCodecs.NBT_COMPOUND).copyOnDeath().serialize(NbtCompound.CODEC).build());
}
