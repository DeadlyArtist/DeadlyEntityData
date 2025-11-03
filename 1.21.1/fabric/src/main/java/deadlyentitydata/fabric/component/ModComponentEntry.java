package deadlyentitydata.fabric.component;

import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;

public class ModComponentEntry implements EntityComponentInitializer {
    public static final ComponentKey<EntityNbtComponent> NBT = ComponentRegistry.getOrCreate(Identifier.of("deadlyentitydata", "nbt"), EntityNbtComponent.class);

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerFor(Entity.class, NBT, EntityNbtComponent::new);
        registry.registerForPlayers(NBT, EntityNbtComponent::new, RespawnCopyStrategy.ALWAYS_COPY);
    }
}
