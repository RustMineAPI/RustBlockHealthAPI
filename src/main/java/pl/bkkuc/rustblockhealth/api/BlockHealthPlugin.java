package pl.bkkuc.rustblockhealth.api;

import org.bukkit.Material;

import java.util.Map;

public interface BlockHealthPlugin {

    BlockManager getBlockManager();

    /**
     * {@code key} - Материал который может нанести урон.
     * {@code value} - Урон который наносит.
     */
    Map<Material, Integer> getItems();
}
