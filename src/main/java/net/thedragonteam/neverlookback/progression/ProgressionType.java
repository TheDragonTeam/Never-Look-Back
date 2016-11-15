package net.thedragonteam.neverlookback.progression;

public enum ProgressionType {
    NONE(0, "none"),
    NORMAL(1, "normal"),
    ADVANCED(2, "advanced"),
    EXPERT(3, "expert");

    private final int progression;

    private final String type;

    ProgressionType(int progressionIn, String typeIn) {
        progression = progressionIn;
        type = typeIn;
    }

    public int getProgress() {
        return progression;
    }

    public String getType() {
        return type;
    }

    public ProgressionType getProgressionType() {
        return this;
    }
}