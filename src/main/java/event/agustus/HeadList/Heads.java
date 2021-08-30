package event.agustus.HeadList;

import event.agustus.Main;
import org.bukkit.inventory.ItemStack;

public enum Heads {
    DUNGEON("YWVhMDM0MDc2Y2ExMDk1OWRlOWQ1NDFjODE3Y2QyOGQyYThiMGFhZDdkOGE4YWZjMmI1NDI1M2Y2ZjBmZWQzIn19fQ==","dungeon"),
    MOB("YTEyMDBjNDcwYzY3MjhkZDY1N2IyNDVjMmRiYzAzMTg5MWUzY2RkOWQ5OTc5MDk4NDU2YjMzZjgxMmFmZGMzZiJ9fX0=","mob"),
    OWOFLUX("ODQ4NTlkMGFkZmM5M2JlMTliYjQ0MWU2ZWRmZDQzZjZiZmU2OTEyNzIzMDMzZjk2M2QwMDlhMTFjNDgyNDUxMCJ9fX0=","owoflux"),
    SPIRIT("ZTY3OTkxOGU1MmYzZjhmMmNhYmJiZWFjNmE5NzY4MWYyZjhhYTEwYzBiMmU4MTg1OTI4ODVhNGEwZTlkMjI3In19fQ==","spirit"),
    LIGHTBLUE("ZjA1MmJlMWMwNmE0YTMyNTEyOWQ2ZjQxYmI4NGYwZWExY2E2ZjlmNjllYmRmZmY0MzE2ZTc0MjQ1MWM3OWMyMSJ9fX0=","lightblue"),
    BLUE("Zjg2OGU2YTVjNGE0NDVkNjBhMzA1MGI1YmVjMWQzN2FmMWIyNTk0Mzc0NWQyZDQ3OTgwMGM4NDM2NDg4MDY1YSJ9fX0=","blue"),
    LIME("N2EyZGYzMTViNDM1ODNiMTg5NjIzMWI3N2JhZTFhNTA3ZGJkN2U0M2FkODZjMWNmYmUzYjJiOGVmMzQzMGU5ZSJ9fX0=","lime"),
    GREEN("YTI2ZWM3Y2QzYjZhZTI0OTk5NzEzN2MxYjk0ODY3YzY2ZTk3NDk5ZGEwNzFiZjUwYWRmZDM3MDM0MTMyZmEwMyJ9fX0=","green"),
    ORANGE("ZWVmMTYyZGVmODQ1YWEzZGM3ZDQ2Y2QwOGE3YmY5NWJiZGZkMzJkMzgxMjE1YWE0MWJmZmFkNTIyNDI5ODcyOCJ9fX0=","orange"),
    JACKPOT("NDI0ODZmMjg1OTE2OWM4YmZiNjZhNjg3YmNmNGM2OTkzNDE3ZjU4NGI1OGJiZmRiMzM2NDY0ZDUyMDcxY2NkNyJ9fX0=","jackpot"),
    BELANDA("YzIzY2YyMTBlZGVhMzk2ZjJmNWRmYmNlZDY5ODQ4NDM0ZjkzNDA0ZWVmZWFiZjU0YjIzYzA3M2IwOTBhZGYifX19", "belanda"),
    INDONESIA("Y2JlNjNmY2FhMDIwM2Y4MDQ2ZmI5NjM3NWQwNzlhNWMwOWI0MTYxZDAxMTlkNzE5NDU2NmU2ODljYWIxOGY2OCJ9fX0=", "indonesia");

    private ItemStack item;
    private String idTag;
    private String prefix = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUv";

    private Heads(String texture, String id){
        item = Main.createSkull(prefix + texture, id);
        idTag = id;

    }
    public ItemStack getItemStack() {
        return item;
    }
    public String getName() {
        return idTag;
    }
}
