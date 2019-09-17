package Manage;

public interface NoName {

    String getType();
    String getName();
    int getMaxDistance();
    int getMaxJumpHeight();
    int getMaxSwimDistance();
    boolean getOnDistance();
    void setOnDistance(boolean check);

    default void run(int dist) {
        if (dist <= getMaxDistance()) {
            System.out.println(getType() + " " + getName() + " хорошо справился с кроссом");
        } else {
            System.out.println(getType() + " " + getName() + " не справился с кроссом");
            setOnDistance(false);
        }
    }

    default void jump(int height) {
        if (height <= getMaxJumpHeight()) {
            System.out.println(getType() + " " + getName() + " удачно перепрыгнул через стену");
            setOnDistance(true);
        } else {
            System.out.println(getType() + " " + getName() + " не смог перепрыгнуть стену");
            setOnDistance(false);
        }
    }

    default void swim(int dist) {
        if (getMaxSwimDistance() == 0) {
            System.out.println(getType() + " " + getName() + " не умеет плавать");
            setOnDistance(false);
            return;
        }
        if (dist <= getMaxSwimDistance()) {
            System.out.println(getType() + " " + getName() + " отлично проплыл");
        } else {
            System.out.println(getType() + " " + getName() + " не смог проплыть");
            setOnDistance(false);
        }
    }

    default void info() {
        System.out.println(getType() + " " + getName() + " - " + getOnDistance());
    }
}
