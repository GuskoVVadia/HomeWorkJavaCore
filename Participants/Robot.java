package Participants;

import Manage.*;

public class Robot extends Participant {

    public Robot(String name, int maxDistance, int maxJumpHeight, int maxSwimDistance) {
        super("robot", name, maxDistance, maxJumpHeight, maxSwimDistance);
    }


    public Robot(String name) {
        super("robot ", name, 100000, 500, 10000);
    }
}
