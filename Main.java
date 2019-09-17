import Manage.*;
import Participants.*;
import Obstructs.*;

public class Main {
    public static void main(String[] args) {

        Team team = new Team(new Robot("igor"), new Human("Ira"), new Dog("Альбус"),
                new Cat("Mussolini"));
        Prep obstruct = new Prep(new Wall(1), new Line(25), new Water(10));

        obstruct.start(team);
        team.info();

    }
}
