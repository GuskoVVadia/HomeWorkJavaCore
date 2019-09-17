package Participants;

import Manage.*;

public class Human extends Participant {

    public Human(String name, int maxDistance, int maxJumpHeight, int maxSwimDistance) {
        super("humanoid", name, maxDistance, maxJumpHeight, maxSwimDistance);
    }


    public Human(String name) {
        super("humanoid ", name, 1000, 15, 500);
    }
}
