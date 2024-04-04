import java.util.List;

public class Učebnica extends Kniha
{
	private String Ročnik;
	public Učebnica(String názov,List<String> autori,int rok, String Vypozicanie, String Ročnik)
	{
		super(názov, autori, rok, Vypozicanie);
		this. Ročnik =  Ročnik;
	}
	public String getRočnik()
	{
		return Ročnik;
	}
	public void setRočnik(String novýRočnik) 
	{
		
	}
}
