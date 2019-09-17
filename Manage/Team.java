package Manage;

public class Team {

    NoName[] team;

    public Team (NoName...noName){
        team = noName;
    }

    public void info(){

        for (NoName o: team) o.info();
    }


}
