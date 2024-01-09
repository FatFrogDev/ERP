package globant.example.erp;


import java.sql.Time;

public class Shift {
    private Type type;
    private Time startHour;
    private Time finishHour;

}

enum Type {
    DAY,
    NIGHT
}
