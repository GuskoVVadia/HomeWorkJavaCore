package Obstacles;

/*
Перемещён. Остался неизменным.
 */

import Management.*;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}