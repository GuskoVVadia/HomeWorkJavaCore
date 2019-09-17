package Obstructs;

import Manage.*;

public class Water implements Obstruct{

    int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void start(NoName noName) {
        noName.swim(distance);
    }
}
