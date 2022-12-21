import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Activite {
    
    public static Map<String,Activite> listeActivites = new HashMap<>();
    public static Map<String, Set<Personne>> inscrits = new HashMap<>();

    public static Map<String,Set<Horaire>> programme = new HashMap<>();

    

    private String nom;

    private String type;

    private Set<Personne> membres = new HashSet<>();
    private Set<Horaire> horaires = new HashSet<>();


    public Activite(String Nom,String Type,Horaire h){
        nom=Nom;
        type = Type;
        Set<Horaire> hor = programme.get(Nom);
        if(hor==null){
            hor = new HashSet<>();
            Set<Personne> gens = new HashSet<>();
            inscrits.put(Nom,gens);
        }
        hor.add(h);
        programme.put(Nom,hor);
        listeActivites.put(Nom,this);
    }

    public String getNom(){
        return nom;
    }

    public static void ajoutMembre(String nomActivite, Personne p){
        Set<Personne> pers = inscrits.get(nomActivite);
        if(pers==null){
            pers = new HashSet<>();
            inscrits.put(nomActivite,pers);
        }
        pers.add(p);
        listeActivites.get(nomActivite).membres.add(p);
    }
    public void ajouterMembre(Personne p){
        if(membres == null){membres = new HashSet<>();}
        membres.add(p);
        inscrits.get(this.nom).add(p);
    }

    public Set<Horaire> horaireActivite(){
        return this.horaires;
    }
    public Set<Personne> listeMembres(){
        return this.membres;
    }

    public static void afficheActivites(){
        for(String s : programme.keySet()){
            System.out.print(s+" ");
        }
    }

    public static void afficherProgramme(){
        for(String key : programme.keySet()){
            System.out.print(key+" ");
            System.out.println(programme.get(key));
        }
    }

    public static void afficherMembres(){
        for(String key : inscrits.keySet()){
            System.out.print(key+": ");
            for(Personne p : inscrits.get(key)){System.out.print(p.getNom()+" ");}
            System.out.println();
        }
    }
}
