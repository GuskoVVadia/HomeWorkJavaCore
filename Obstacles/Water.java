package Obstacles;

/*
Перемещён. Остался неизменным.
 */

import Management.*;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}