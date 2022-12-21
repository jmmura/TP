import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Horaire {
    private LocalTime debut;
    private LocalTime fin;
    private LocalDate jour;

    public Horaire(LocalTime d, LocalTime f, LocalDate j){
        debut = d;
        fin = f;
        jour = j;
    }

    public String toString(){
        return "le "+jour+" de "+debut+" à "+fin;
    }
}

