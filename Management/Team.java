package Management;

/*
Класс команды. Принимает имя команды, и участников, как аргументы переменной длинны.
Также объявлен метов вывода командного результата о прохождении полосы.
По условиям ТЗ.
 */

public class Team {

    private Competitor[] team;
    String name;

    public Team(String name, Competitor...competitors){
        team = competitors;
        this.name = name;
    }

    Competitor[] getTeam(){
        return team;
    }

    public void showResults(){

        System.out.println("Итог команды '" + name + "' :");
        for (Competitor o: team){
            o.info();
        }
    }

}
