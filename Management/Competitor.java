package Management;

/*
Интерфейс остался неизменённым.
Перемещён в новый пакет.
 */

public interface Competitor {
    void run(int dist);
    void swim(int dist);
    void jump(int height);
    boolean isOnDistance();
    void info();
}