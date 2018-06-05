package net.larryworm.equipments.util;

public enum TypeUtil {

    TOOL("tools"),
    ARMOR("armors"),
    MATERIALS("materials"),
    CRAFTING("crafting");

    public final String name;

    TypeUtil(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
