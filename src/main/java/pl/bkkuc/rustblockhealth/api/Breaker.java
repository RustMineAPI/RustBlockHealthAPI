package pl.bkkuc.rustblockhealth.api;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.NotNull;

public interface Breaker {

    /**
     * @return Возвращает игрока который, наносит урон.
     */
    @NotNull Player getPlayer();

    /**
     * @return Возвращает предмет с которым игрок пытается нанести урон.
     */
    @NotNull ItemStack getItemStack();

    @NotNull BukkitTask getBukkitTask();

    void refresh();

    void stop();
}
