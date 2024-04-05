import java.util.List;

public class Román extends Kniha
{
	private String Žáner;
	public Román(String názov, List<String> autori,int rok, String Vypozicanie, String Žáner)
	{
		super(názov, autori, rok, Vypozicanie);
		this.Žáner =  Žáner;
	}
	public String getŽáner()
	{
		return Žáner;
	}
	public void setŽáner(String novýRočnik) 
	{
		this.Žáner =  novýRočnik;
	}
}
