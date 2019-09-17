package Participants;

import Manage.*;

public class Cat extends Participant {

    public Cat(String name) {
        super("Cat ", name, 200, 5, 0);
    }

    public Cat(String name, int maxDistance, int maxJumpHeight, int maxSwimDistance) {
        super("Cat ", name, maxDistance, maxJumpHeight, maxSwimDistance);
    }

}
