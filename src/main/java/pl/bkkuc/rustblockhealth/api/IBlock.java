package pl.bkkuc.rustblockhealth.api;

import org.bukkit.block.Block;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface IBlock {

    void init();

    /**
     * @return Возвращает список игроков которые ломали, и с помощью какого предмета.
     */
    List<Breaker> getBreakers();

    @NotNull Block getBlock();
    @Nullable Integer getHealth();
    @NotNull BossBar getBossBar();

    void addBreaker(@NotNull Player player, @NotNull ItemStack item);
    Breaker getBreakerByPlayer(@NotNull Player player);

    /**
     * Нанести урон блоку
     * @param damage Количество урона который нужно нанести.
     */
    void subtract(int damage);
}
