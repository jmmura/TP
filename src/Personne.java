import java.util.*;

public class Personne {
    private String nom;
    private String statut;
    private List<Activite> inscriptions;
    private HorairePerso horaire;

    public Personne(String n,String s){
        nom=n;
        statut=s;
    }

    public Personne(String Nom){
        nom=Nom;
    }

    public void inscription(Activite a){
        inscriptions.add(a);
    }


}
