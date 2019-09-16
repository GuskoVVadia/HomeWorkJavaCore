import Management.*;
import Obstacles.*;
import Participants.*;

public class Main {
    public static void main(String[] args) {

        Team team = new Team("Имя команды", new Human("Jack"), new Cat("Bob"), new Dog("Dog"));
        Course course = new Course(new Cross(80), new Wall(20), new Water(0));

        course.doIt(team);
        team.showResults();
    }
}
