package pl.bkkuc.rustblockhealth.api;

import org.bukkit.block.Block;
import org.bukkit.boss.BossBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IBlock {

    void init();

    @NotNull Block getBlock();
    @Nullable Integer getHealth();
    @NotNull BossBar getBossBar();

    /**
     * Нанести урон блоку
     * @param damage Количество урона который нужно нанести.
     */
    void subtract(int damage);
}
