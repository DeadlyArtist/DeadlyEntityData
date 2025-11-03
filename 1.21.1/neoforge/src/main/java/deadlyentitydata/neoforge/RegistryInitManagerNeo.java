package deadlyentitydata.neoforge;

import deadlyentitydata.ModEntry;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class RegistryInitManagerNeo {
    public static final DeferredRegister<ComponentType<?>> DATA_COMPONENT_TYPES = DeferredRegister.createDataComponents((RegistryKey<Registry<ComponentType<?>>>) Registries.DATA_COMPONENT_TYPE.getKey(), ModEntry.MOD_ID);
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, ModEntry.MOD_ID);


    public static void registerComponents() {
//        KPComponents.data.forEach((id, component) -> {
//            Supplier<ComponentType<?>> sup = () -> component;
//            DATA_COMPONENT_TYPES.register(id.getPath(), sup);
//        });
    }

    public static void init() {
        registerComponents();
    }

    public static void register(IEventBus eventBus) {
        DATA_COMPONENT_TYPES.register(eventBus);
        ATTACHMENT_TYPES.register(eventBus);
    }
}
