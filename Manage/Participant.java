package Manage;

public class Participant implements NoName{

    String type;
    String name;
    int maxDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public Participant(String type, String name, int maxDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;

    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    @Override
    public boolean getOnDistance() {
        return onDistance;
    }

    @Override
    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }
}
