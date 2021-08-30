package event.agustus;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.ArmorStand;

import java.util.Random;

public class SpawnStand implements CommandExecutor {
    private final Main plugin;

    public SpawnStand(Main plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof ConsoleCommandSender) {
            if (cmd.getName().equalsIgnoreCase("agustus")) {
                if (args.length < 1) {
                    sender.sendMessage("§aSilahkan masukkan argument!");
                    return false;
                }
                if (args[0].equalsIgnoreCase("stand")) {
                    if (args[1].equalsIgnoreCase("jackpot")) {
                        World world = plugin.getServer().getWorld("new-spawn");
                        Location location = new Location(world, 92, 124, -316, 150, 0F);
                        ArmorStand agustusjackpot = world.spawn(location.add(0, -1.5, 0), ArmorStand.class);
                        agustusjackpot.setGravity(false);
                        agustusjackpot.setHelmet(Main.getHead("jackpot"));
                        agustusjackpot.setCustomName("indonesiajackpot");
                        agustusjackpot.setVisible(false);
                        agustusjackpot.setInvulnerable(true);
                        agustusjackpot.setPersistent(true);

                        Location location1 = new Location(world, 213, 37, -368, 150, 0F);
                        ArmorStand agustusjackpot1 = world.spawn(location1.add(0, -1.5, 0), ArmorStand.class);
                        agustusjackpot1.setGravity(false);
                        agustusjackpot1.setHelmet(Main.getHead("jackpot"));
                        agustusjackpot1.setCustomName("indonesiajackpot");
                        agustusjackpot1.setVisible(false);
                        agustusjackpot1.setInvulnerable(true);
                        agustusjackpot1.setPersistent(true);

                        Location location2 = new Location(world, 120, 63, -437, 150, 0F);
                        ArmorStand agustusjackpot2 = world.spawn(location1.add(0, -1.5, 0), ArmorStand.class);
                        agustusjackpot2.setGravity(false);
                        agustusjackpot2.setHelmet(Main.getHead("jackpot"));
                        agustusjackpot2.setCustomName("indonesiajackpot");
                        agustusjackpot2.setVisible(false);
                        agustusjackpot2.setInvulnerable(true);
                        agustusjackpot2.setPersistent(true);
                    }
                    else{
                        sender.sendMessage("Please input number");
                    }
                    if (args[1].equalsIgnoreCase("1")) {
                        Bukkit.broadcastMessage("");
                        Bukkit.broadcastMessage("§c§lFind the Flags!");
                        Bukkit.broadcastMessage("");
                        Bukkit.broadcastMessage("§aCarilah bendera Indonesia di §e/spawn§a!");
                        Bukkit.broadcastMessage("§akumpulkan sebanyak mungkin agar kalian mendapatkan");
                        Bukkit.broadcastMessage("§apoints dari bendera itu!");
                        Bukkit.broadcastMessage("");
                        Bukkit.broadcastMessage("§c§lIndependence Day Event");
                        Bukkit.broadcastMessage("");
                        Random random = new Random();
                        int randomNumber = random.nextInt(255);
                        World world = plugin.getServer().getWorld("new-spawn");
                        Location location = new Location(world, 176.5, 27, -328, randomNumber, 0F);
                        ArmorStand agustus = world.spawn(location.add(0, -1.5, 0), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);


                        agustus = world.spawn(location.clone().add(2, 0, 1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(3, 0, 2.5), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(0, 0, 3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(4, 0, 0), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);


                        agustus = world.spawn(location.clone().add(-2, 0, 1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(3, 0, -4), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-0.5, 0, 1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-4, 0, 0), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-1, 0, 2), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-2, 0, 3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(1, 0, -2), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(3, 0, -3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(5, 0, -2), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(6, -0.5, -3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-3, 0, 0), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-5, 0, 1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-7, 0, -3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-5, 0, -6), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-3, 0, -4), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-2, 0, -5), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-3, 0, -3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-2, 0, -1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-2, 0, -1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("belanda"));
                        agustus.setCustomName("belanda");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);
                    }
                    else{
                        sender.sendMessage("Jackpot / 1 / 2 / 3");
                    }
                    if (args[1].equalsIgnoreCase("2")) {
                        Random random = new Random();
                        int randomNumber = random.nextInt(255);
                        World world = plugin.getServer().getWorld("new-spawn");
                        Location location = new Location(world, 141, 27, -331, randomNumber, 0F);
                        ArmorStand agustus = world.spawn(location.add(0, -1.5, 0), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);


                        agustus = world.spawn(location.clone().add(2, 0, 1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(3, 0, 2.5), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(0, 0, 3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(4, 0, 0), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);


                        agustus = world.spawn(location.clone().add(-2, 0, 1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(3, 0, -4), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-0.5, 0, 1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-4, 0, 0), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-1, 0, 2), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-2, 0, 3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(1, 0, -2), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(3, 0, -3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(5, 0, -2), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(6, 0, -3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-3, 0, 0), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-5, 0, 1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-7, 0, -3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-5, 0, -6), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-3, 0, -4), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-2, 0, -5), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-3, 0, -3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-2, 0, -1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-2, 0, -1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("belanda"));
                        agustus.setCustomName("belanda");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);
                    }
                    else{
                        sender.sendMessage("Jackpot / 1 / 2 / 3");
                    }
                    if (args[1].equalsIgnoreCase("3")) {
                        Random random = new Random();
                        int randomNumber = random.nextInt(255);
                        World world = plugin.getServer().getWorld("new-spawn");
                        Location location = new Location(world, 133, 14, -396, randomNumber, 0F);
                        ArmorStand agustus = world.spawn(location.add(0, -1.5, 0), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);


                        agustus = world.spawn(location.clone().add(2, 0, 1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(3, 0, 2.5), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(0, 0, 3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(4, 0, 0), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);


                        agustus = world.spawn(location.clone().add(-2, 0, 1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(3, 0, -4), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-0.5, 0, 1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-4, 0, 0), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-1, 0, 2), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-2, 0, 3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(1, 0, -2), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(3, 0, -3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(5, 0, -2), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(6, 0, -3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-3, 0, 0), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-5, 0, 1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-7, 0, -3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-5, 0, -6), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-3, 0, -4), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-2, 0, -5), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-3, 0, -3), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-2, 0, -1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("indonesia"));
                        agustus.setCustomName("indonesia");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);

                        agustus = world.spawn(location.clone().add(-2, 0, -1), ArmorStand.class);
                        agustus.setGravity(false);
                        agustus.setHelmet(Main.getHead("belanda"));
                        agustus.setCustomName("belanda");
                        agustus.setVisible(false);
                        agustus.setInvulnerable(true);
                        agustus.setPersistent(true);
                    }
                    else{
                        sender.sendMessage("Jackpot / 1 / 2 / 3");
                    }
                }else {
                    sender.sendMessage("Please enter the number");
                }
            }
        }
        return true;
    }
}
