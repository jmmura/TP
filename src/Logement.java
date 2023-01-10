import java.util.HashMap;
import java.util.Map;

public class Logement extends Activite{

    public static Map<String,Activite> logements = new HashMap<>();
    //type = "logement"
    public Logement(String Nom, String type, Horaire h, double prix) {
        super(Nom,type, h,prix);
        logements.put(Nom,this);
    }
}
