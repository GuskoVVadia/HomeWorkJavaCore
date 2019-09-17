package Manage;

public class Prep {

    Obstruct[] prep;

    public Prep(Obstruct...obstruct){
        prep = obstruct;
    }

    public void start(Team team){

        for (NoName o: team.team){
            for (Obstruct a: prep){
                a.start(o);
                if (!o.getOnDistance()) break;
            }
        }
    }
}
