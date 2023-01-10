import java.util.*;
import java.time.*;
import java.lang.*;



public class Main {

    public static void main(String[] args) {


        Stage stage1 = new Stage("stage1","stage",new Horaire(LocalTime.of(10,0),LocalTime.of(11,0),Semaine.lundi),50);
        Stage stage2 = new Stage("stage2","stage",new Horaire(LocalTime.of(13,0),LocalTime.of(14,0), Semaine.mardi),30);
        Repas repas1 = new Repas("repas1","repas",new Horaire(LocalTime.of(17,0),LocalTime.of(19,0),Semaine.mardi),40);
        Stage stage4 = new Stage("stage4","stage",new Horaire(LocalTime.of(10,10),LocalTime.of(11,0),Semaine.mercredi),30);
        new Activite("stage2","repas", new Horaire(LocalTime.of(9,0),LocalTime.of(10,0),Semaine.vendredi),20);

        starter.init();

    }
}
