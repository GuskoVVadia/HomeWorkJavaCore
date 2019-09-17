package Obstructs;

import Manage.*;

public class Wall implements Obstruct {

    int distance;

    public Wall(int distance) {
        this.distance = distance;
    }

    @Override
    public void start(NoName noName) {
        noName.jump(distance);
    }
}
