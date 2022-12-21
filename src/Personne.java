import java.util.*;

public class Personne {
    private String nom;
    private String statut;


    private List<Activite> inscriptions;
    private HorairePerso horaire;

    public static Set<Personne> gens = new HashSet<>();

    public Personne(String n,String s){
        nom=n;
        statut=s;
    }

    public Personne(String Nom){
        nom=Nom;
    }



    public void inscription(Activite a){
        inscriptions.add(a);
        a.ajouterMembre(this);
    }

    public String getNom() {
        return nom;
    }
    public static void listerGens(){
        for(Personne p : gens){
            System.out.print(p.getNom()+" ");
        }
    }


}
