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
		if (Vypozicanie.equals("N")) 
	    {
	        this.Vypozicanie = "Vypozicana";
	    } 
		else if (Vypozicanie.equals("Y"))
	    {
	        this.Vypozicanie = "Dostupna";
	    }
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
