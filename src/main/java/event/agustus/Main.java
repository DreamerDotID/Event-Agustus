package event.agustus;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import event.agustus.HeadList.Heads;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;
import java.util.UUID;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("§a===========================");
        System.out.println("§aEvent 17 Agustus by Mornov");
        System.out.println("§a===========================");
        getCommand("agustus").setExecutor(new SpawnStand(this));
        Bukkit.getPluginManager().registerEvents(new ClickEvent(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static ItemStack createSkull(String url, String name) {
        ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
        if (url.isEmpty()) return head;

        SkullMeta headMeta = (SkullMeta) head.getItemMeta();
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        profile.getProperties().put("textures", new Property("textures", url));

        try {
            Field profileField = headMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(headMeta, profile);
        } catch (IllegalArgumentException | NoSuchFieldException | SecurityException | IllegalAccessException error) {
            error.printStackTrace();
        }
        head.setItemMeta(headMeta);
        return head;
    }

    public static ItemStack getHead(String name) {
        for (Heads head : Heads.values()) {
            if (head.getName().equals(name)) {
                return head.getItemStack();
            }
        }
        return null;

    }



}
