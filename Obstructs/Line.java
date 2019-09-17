package Obstructs;

import Manage.*;

public class Line implements Obstruct {

    int distance;

    public Line(int distance) {
        this.distance = distance;
    }

    @Override
    public void start(NoName noName) {
        noName.run(distance);
    }
}
