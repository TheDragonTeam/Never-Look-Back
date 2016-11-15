package net.thedragonteam.neverlookback.progression;

public class DefaultProgressionHandler implements IProgressionHandler {

    private int progression;

    private String progressType;

    @Override
    public String getType() {
        int i = getProgression();
        if (i >= 0 && i < 10) {
            return this.progressType = ProgressionType.NONE.getType();
        } else if (i >= 10 && i < 120) {
            return this.progressType = ProgressionType.NORMAL.getType();
        } else if (i >= 120 && i < 500) {
            return this.progressType = ProgressionType.ADVANCED.getType();
        } else if (i == 500) {
            return this.progressType = ProgressionType.EXPERT.getType();
        }
        return this.progressType;
    }

    @Override
    public void setType(String type) {
        this.progressType = type;
    }

    @Override
    public int getProgression() {
        if (progression > 500)
            return this.progression = 500;
        return this.progression;
    }

    @Override
    public void setProgression(int progression) {
        this.progression = progression;
    }

    @Override
    public void addProgression(int progression) {
        this.progression += progression;
    }

    @Override
    public void removeProgression(int progression) {
        this.progression -= progression;

        if (this.progression < 0)
            this.progression = 0;
    }
}
