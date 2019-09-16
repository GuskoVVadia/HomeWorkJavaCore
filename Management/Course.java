package Management;

/*
Класс Полосы препятствий. Принимает препятствия как аргументы переменной длинны.
Также включён метод doIt(team).
 */

public class Course {

    private Obstacle[] obstaclesArray;

    public Course(Obstacle...obstacles) {
        obstaclesArray = obstacles;
    }

    public void doIt(Team team){
        for (Competitor o : team.getTeam()){
            for (Obstacle a : obstaclesArray){
                a.doIt(o);
                if (!o.isOnDistance()) break;
            }
        }
    }
}
