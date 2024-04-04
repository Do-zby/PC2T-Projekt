
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Databaza {
    private Map<String, Kniha> prvkyDatabazy;

    public Databaza() 
    {
        prvkyDatabazy = new HashMap<>();
    }

    public boolean setRomán(String názov, List<String> autori, int rok, String vypozicanie, String žáner) 
    {
        if (prvkyDatabazy.put(názov, new Román(názov, autori, rok, vypozicanie, žáner)) == null)
            return true;
        else
            return false;
    }

    public boolean setUčebnica(String názov, List<String> autori, int rok, String vypozicanie, String ročnik) 
    {
        if (prvkyDatabazy.put(názov, new Učebnica(názov, autori, rok, vypozicanie, ročnik)) == null)
            return true;
        else
            return false;
    }
    public boolean upravaKnihy(String názov, List<String> novíAutori, int novýRok, String novéVypozicanie) 
    {
        Kniha kniha = prvkyDatabazy.get(názov);
        if (kniha != null) 
        {
            kniha.setAutori(novíAutori);
            kniha.setRok(novýRok);
            kniha.setVypozicanie(novéVypozicanie);
            return true;
        } else {
            return false;
        }
    }
    public void vypisDatabázy() {
        Set<Map.Entry<String, Kniha>> záznamy = prvkyDatabazy.entrySet();
        for (Map.Entry<String, Kniha> záznam : záznamy) {
            String názov = záznam.getKey();
            Kniha kniha = záznam.getValue();
            String Dostupnosť = kniha.ZistiDostupnosť(kniha.getVypozicanie());
            System.out.println("Názov: " + kniha.getNázov());
            System.out.println("Autor/autori: " + kniha.getAutor());
            if (kniha instanceof Román) {
                System.out.println("Žáner: " + ((Román) kniha).getŽáner());
            } else if (kniha instanceof Učebnica) {
                System.out.println("Odporúčaný ročník: " + ((Učebnica) kniha).getRočnik());
            }
            System.out.println("Rok vydania: " + kniha.getRok());
            System.out.println("Dostupnosť: " + Dostupnosť);
            System.out.println();

        }
    }
}

