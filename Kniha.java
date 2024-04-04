import java.util.List;

public class Kniha 
{
	private int rok;
	private String názov;
	private String Vypozicanie;
	private List<String> autori;
	public Kniha (String názov, List<String> autori, int rok, String Vypozicanie)
	{
		this.názov = názov;
		this.autori = autori;
		this.rok = rok;
		this.Vypozicanie = Vypozicanie;
	}
	public String getNázov()
	{
		return názov;
	}
	public  List<String> getAutor()
	{
		return autori;
	}
	public int getRok()
	{
		return rok;
	}
	public String ZistiDostupnosť(String Vypozicanie) 
	{
	    if (Vypozicanie.equals("N")) 
	    {
	        return "Vypozicana";
	    } 
	    else if (Vypozicanie.equals("Y"))
	    {
	        return "Dostupna";
	    }
	    else
	    	return "¯\\_(ツ)_/¯";
	}
		public String getVypozicanie()
		{
			return Vypozicanie;
		
	}
		public void setAutori(List<String> novíAutori) 
		{
			this.autori = novíAutori;
		}
		public void setRok(int novýRok) 
		{
			this.rok = novýRok;
		}
		public void setVypozicanie(String novéVypozicanie) 
		{
			this.Vypozicanie = novéVypozicanie;
		}
}
