package Participants;

import Manage.*;

public class Dog extends Participant {

    public Dog(String name, int maxDistance, int maxJumpHeight, int maxSwimDistance) {
        super("Dog", name, maxDistance, maxJumpHeight, maxSwimDistance);
    }


    public Dog(String name) {
        super("Dog", name, 500, 50, 200);
    }
}
