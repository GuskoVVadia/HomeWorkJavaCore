package EnumTest;

public enum DayOfWeek {

    Monday ("Понедельник", 40),
    Tuesday ("Вторник", 32),
    Wednesday ("Среда", 24),
    Thursday ("Четверг", 16),
    Friday ("Пятница", 8),
    Saturday ("Суббота", 0),
    Sunday ("Воскресенье", 0);

    String rusDay;
    int hour;

    DayOfWeek(String rusDay, int hour){
        this.rusDay = rusDay;
        this.hour = hour;
    }

    public static String getWorkingHours(DayOfWeek Day){
        return "День недели: " + Day.rusDay + ", а до конца рабочей недели осталось: " + Day.hour + " часов.";
    }
}