import java.util.*;
import java.time.*;

public class Main {

    public static void main(String[] args) {

        Horaire h = new Horaire(LocalTime.now(),LocalTime.now(),LocalDate.now());
        System.out.println(h.toString());

    }
}