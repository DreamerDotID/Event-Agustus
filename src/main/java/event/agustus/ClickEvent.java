package event.agustus;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.stream.Stream;

public class ClickEvent implements Listener {
    private Main plugin;

    public ClickEvent(Main plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void ClickIndonesia(PlayerArmorStandManipulateEvent e) {
        ArmorStand armorStand = e.getRightClicked();
        if (armorStand == null)
            return;
        if (armorStand.isValid() && Stream.of("§a+1 Points")
                .anyMatch(n -> n.equalsIgnoreCase(armorStand.getCustomName()))) {
            e.setCancelled(true);
        }
        if (armorStand.isValid() && Stream.of("indonesia")
                .anyMatch(n -> n.equalsIgnoreCase(armorStand.getCustomName()))) {
            e.setCancelled(true);
            rewardUp(armorStand, e.getPlayer());
        }
        if (armorStand.isValid() && Stream.of("belanda")
                .anyMatch(n -> n.equalsIgnoreCase(armorStand.getCustomName()))) {
            e.setCancelled(true);
            rewardPoop(armorStand, e.getPlayer());
        }
        if (armorStand.isValid() && Stream.of("indonesiajackpot")
                .anyMatch(n -> n.equalsIgnoreCase(armorStand.getCustomName()))) {
            e.setCancelled(true);
            rewardJackpot(armorStand, e.getPlayer());

        }
    }
    private void rewardUp(ArmorStand indonesia, Player e) {
        indonesia.getLocation().getWorld().playSound(indonesia.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 8, 1);
        new BukkitRunnable() {
            private boolean goingUp = true;
            Location loc = indonesia.getLocation();
            private final int maximumHeight = loc.getBlockY() + 2;
            private final int minimumHeight = loc.getBlockY();


            @Override
            public void run() {
                if (indonesia.isDead()) {
                    indonesia.remove();
                    cancel();
                    return;
                }
                if (goingUp) {
                    if (indonesia.getLocation().getY() > maximumHeight) {
                        goingUp = false;
                    } else {
                        loc.setYaw(loc.getYaw() + (float) 20);
                        indonesia.teleport(loc.add(0, 0.07, 0));
                    }
                } else {
                    if (indonesia.getLocation().getY() < minimumHeight) {
                        goingUp = true;
                    } else {
                        indonesia.remove();
                        ArmorStand hologram = indonesia.getLocation().getWorld().spawn(indonesia.getLocation().add(0, 0.5, 0), ArmorStand.class);
                        hologram.setCustomName("§a+1 Points");
                        hologram.setCustomNameVisible(true);
                        hologram.setVisible(false);
                        hologram.setInvulnerable(true);
                        hologram.setPersistent(true);
                        hologram.setGravity(false);
                        indonesia.getLocation().getWorld().playSound(indonesia.getLocation(), Sound.ENTITY_CHICKEN_EGG, 8, 0);
                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
                            hologram.remove();
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "independence " +e.getName()+ " add 1");
                        }, 60);
                    }
                }
            }
        }.runTaskTimer(plugin, 1, 1);
    }
    private void rewardPoop(ArmorStand belanda, Player e) {
        belanda.getLocation().getWorld().playSound(belanda.getLocation(), Sound.ENTITY_EVOKER_PREPARE_WOLOLO, 8, 2);
        new BukkitRunnable() {
            private boolean goingUp = true;
            Location loc = belanda.getLocation();
            private final int maximumHeight = loc.getBlockY() + 2;
            private final int minimumHeight = loc.getBlockY();


            @Override
            public void run() {
                if (belanda.isDead()) {
                    belanda.remove();
                    cancel();
                    return;
                }
                if (goingUp) {
                    if (belanda.getLocation().getY() > maximumHeight) {
                        goingUp = false;
                    } else {
                        loc.setYaw(loc.getYaw() + (float) 20);
                        belanda.teleport(loc.add(0, 0.07, 0));
                    }
                } else {
                    if (belanda.getLocation().getY() < minimumHeight) {
                        goingUp = true;
                    } else {
                        belanda.remove();
                        belanda.getLocation().getWorld().playSound(belanda.getLocation(), Sound.ENTITY_CHICKEN_EGG, 8, 0);
                        ArmorStand hologram = belanda.getLocation().getWorld().spawn(belanda.getLocation().add(0, 0.5, 0), ArmorStand.class);
                        hologram.setCustomName("§c-1 Points");
                        hologram.setCustomNameVisible(true);
                        hologram.setVisible(false);
                        hologram.setInvulnerable(true);
                        hologram.setPersistent(true);
                        hologram.setGravity(false);
                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
                            hologram.remove();
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "independence " +e.getName()+ " remove 1");
                        }, 60);

                    }
                }
            }
        }.runTaskTimer(plugin, 1, 1);
    }
    private void rewardJackpot(ArmorStand jackpot, Player e) {
        Bukkit.broadcastMessage("§c§lIndependence Day! §aSelamat §e" +e.getName()+ " §atelah mendapatkan §a§lJackpot§a!");
        jackpot.getLocation().getWorld().playSound(jackpot.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 100, 0);
        new BukkitRunnable() {
            private boolean goingUp = true;
            Location loc = jackpot.getLocation();
            private final int maximumHeight = loc.getBlockY() + 2;
            private final int minimumHeight = loc.getBlockY();


            @Override
            public void run() {
                if (jackpot.isDead()) {
                    jackpot.remove();
                    cancel();
                    return;
                }
                if (goingUp) {
                    if (jackpot.getLocation().getY() > maximumHeight) {
                        goingUp = false;
                    } else {
                        loc.setYaw(loc.getYaw() + (float) 20);
                        jackpot.teleport(loc.add(0, 0.07, 0));
                    }
                } else {
                    if (jackpot.getLocation().getY() < minimumHeight) {
                        goingUp = true;
                    } else {
                        jackpot.remove();
                        jackpot.getLocation().getWorld().playSound(jackpot.getLocation(), Sound.ENTITY_CHICKEN_EGG, 8, 0);
                        ArmorStand hologram = jackpot.getLocation().getWorld().spawn(jackpot.getLocation().add(0, 0.5, 0), ArmorStand.class);
                        hologram.setCustomName("§a§lJACKPOT ! §a+10 Points");
                        hologram.setCustomNameVisible(true);
                        hologram.setVisible(false);
                        hologram.setInvulnerable(true);
                        hologram.setPersistent(true);
                        hologram.setGravity(false);
                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> {
                            hologram.remove();
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "independence " +e.getName()+ " get 10");
                        }, 60);

                    }
                }
            }
        }.runTaskTimer(plugin, 1, 1);
    }
}
