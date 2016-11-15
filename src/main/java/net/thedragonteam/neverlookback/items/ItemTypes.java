package net.thedragonteam.neverlookback.items;

public enum ItemTypes {
    NONE("none"),
    NORMAL("normal"),
    ADVANCED("advanced"),
    EXPERT("expert");

    private final String name;

    ItemTypes(String nameIn) {
        this.name = nameIn;
    }

    public String getName() {
        return "item_" + name;
    }
}
