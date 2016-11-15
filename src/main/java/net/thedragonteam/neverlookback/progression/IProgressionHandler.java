package net.thedragonteam.neverlookback.progression;

public interface IProgressionHandler {

    String getType();

    void setType(String type);

    int getProgression();

    void setProgression(int progression);

    void addProgression(int progression);

    void removeProgression(int progression);
}