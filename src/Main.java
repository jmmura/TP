import java.sql.SQLOutput;
import java.util.*;
import java.time.*;

public class Main {

    public static void main(String[] args) {

        Stage stage1 = new Stage("stage1","stage",new Horaire(LocalTime.now(),LocalTime.now(),LocalDate.now()));
        Stage stage2 = new Stage("stage2","stage",new Horaire(LocalTime.now(),LocalTime.now(),LocalDate.now()));
        Stage stage3 = new Stage("stage3","stage",new Horaire(LocalTime.now(),LocalTime.now(),LocalDate.now()));
        Stage stage4 = new Stage("stage4","stage",new Horaire(LocalTime.now(),LocalTime.now(),LocalDate.now()));
        new Activite("stage2","stage", new Horaire(LocalTime.of(2,2,2),LocalTime.of(3,3,3),LocalDate.of(2023,5,12)));
        boolean prog = true;
        System.out.printf("Nouvelle personne %n Entrer nom%n");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Personne p = new Personne(s);
        Activite.afficherProgramme();
        System.out.println("A quelles activité voulez-vous vous inscrire?");
        Activite.afficheActivites();
        String[] choix = sc.nextLine().split(",",0);
        for(String str : choix){
            Activite.ajoutMembre(str,p);
        }
        System.out.println("Membres par activité: ");
        Activite.afficherMembres();


    }
}