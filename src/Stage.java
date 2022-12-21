import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Stage extends Activite{
    private String nom;

    private List<Horaire> horaire = new LinkedList<>();

    private Set<Personne> membres = new HashSet<>();



    public String getNom(){
        return nom;
    }

    public void ajouterHoraire(LocalDate jour, LocalTime debut, LocalTime fin){
        horaire.add(new Horaire(debut,fin,jour));
    }


}
