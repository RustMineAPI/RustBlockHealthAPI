package pl.bkkuc.rustblockhealth.api;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface BlockManager {

    /**
     * Список блоков которых ломали.
     * @return Возвращает список сессии.
     */
    List<IBlock> getSessions();

    /**
     * Наносит принудительно урон блоку от имени плагина.
     * @block Блок которому нужно нанести урон.
     * @amount Урон который нужно нанести.
     */
    void damageBlock(@NotNull Block block, int amount);

    /**
     * Наносит урон блоку от имени игрока.
     * @param block Блок которому нужно нанести урон
     * @param player Исполнитель
     * @param item С помощью предмета
     */
    void damageBlock(@NotNull Block block, @NotNull Player player, @NotNull ItemStack item);

    IBlock loadIBlock(@NotNull Block block);

    /**
     * @return Возвращает текущую сессию игрока.
     */
    @Nullable IBlock getPlayerSession(@NotNull Player player);

    /**
     * @return Возвращает {@code IBlock} объект, если есть.
     */
    @Nullable IBlock getIBlockByBlock(@NotNull Block block);

    /**
     * @return Возвращает здоровье блока, может вернуть {@code null} если он нет в ломаемых блоках.
     */
    @Nullable Integer getBlockHealth(@NotNull Block block);
}
