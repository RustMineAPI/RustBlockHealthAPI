package pl.bkkuc.rustblockhealth.api.handlers;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl.bkkuc.rustblockhealth.api.Breaker;

@lombok.Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BlockDamageEvent extends Event {

    HandlerList handlerList = new HandlerList();

    /**
     * Пострадавший блок.
     */
    @NotNull Block block;

    /**
     * Игрок, который наносит урон.
     * Возвращает {@code null} тогда когда наносится урон принудительно.
     */
    @Nullable Breaker breaker;

    int damage;

    public BlockDamageEvent(@NotNull Block block, @Nullable Breaker breaker, int damage) {
        this.block = block;
        this.breaker = breaker;
        this.damage = damage;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlerList;
    }
}
