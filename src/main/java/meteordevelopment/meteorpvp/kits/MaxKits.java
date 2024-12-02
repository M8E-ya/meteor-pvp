package meteordevelopment.meteorpvp.kits;

import meteordevelopment.meteorpvp.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;

import java.util.UUID;

public enum MaxKits {
    Normal(6, false); //Todo: Trusted players

    public final int count;
    public final boolean canHavePublic;

    MaxKits(int count, boolean canHavePublic) {
        this.count = count;
        this.canHavePublic = canHavePublic;
    }

    public static MaxKits get(HumanEntity player) {
        return Normal;
    }

    public static MaxKits get(UUID uuid) {
        Player player = Bukkit.getPlayer(uuid);
        if (player == null) return Normal;
        return get(player);
    }
}
