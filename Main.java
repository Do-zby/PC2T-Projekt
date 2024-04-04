import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Databaza mojaDatabaza=new Databaza();
		int vyber, typ, index, rok;
		String názov, Vypozicanie, Spec;
		List<String> autori;
		boolean run=true;
		while(run)
		{
			System.out.println("Zvoľte požadovaný úkon:");
			System.out.println("1 --- Pridanie novej knihy");
			System.out.println("2 --- Úprava knihy");
			System.out.println("3 --- Výpis všetkých kníh v databáze");
			System.out.println("8 --- Ukončenie programu");

			vyber = sc.nextInt();
			switch (vyber)
			{
			case 1:
				System.out.println("Vyberte typ knihy (1--> Román; 2-->Učebnica)");
				typ = sc.nextInt();
				if (typ ==1)
				{
					System.out.println("Zadajte názov románu: ");
					názov=sc.next();
					System.out.println("Zadajte meno autora/autorov (oddelte čiarkami): ");
					sc.nextLine();
					autori = Arrays.asList(sc.nextLine().split(","));
					System.out.println("Zadajte žáner románu: ");
					Spec=sc.next();
					System.out.println("Zadajte rok vydania knihy: ");
					rok=sc.nextInt();
					System.out.println("Zvoľte stav dostupnosti (Y/N): ");
					Vypozicanie=sc.next();
					if (!mojaDatabaza.setRomán(názov,autori,rok,Vypozicanie,Spec))
						System.out.println("Kniha v databáze už existuje");
					break;
				}
				else
				{
					System.out.println("Zadajte názov učebnice: ");
					názov=sc.next();
					System.out.println("Zadajte meno autora/autorov (oddelte čiarkami: ");
					sc.nextLine();
					autori = Arrays.asList(sc.nextLine().split(","));
					System.out.println("Zadajte vhodný ročník: ");
					Spec=sc.next();
					System.out.println("Zadajte rok vydania knihy: ");
					rok=sc.nextInt();
					System.out.println("Zvoľte stav dostupnosti: ");
					Vypozicanie=sc.next();
					if (!mojaDatabaza.setUčebnica(názov,autori,rok,Vypozicanie,Spec))
						System.out.println("Kniha v databáze už existuje");
					break;
				}
			case 2:
				System.out.println("Zadajte názov knihy, ktorú chcete upraviť");
				názov=sc.next();
				System.out.println("Zadajte nové meno autora/autorov (oddelte čiarkami): ");
				sc.nextLine();
				autori = Arrays.asList(sc.nextLine().split(","));
				System.out.println("Zadajte nový rok vydania knihy: ");
				rok=sc.nextInt();
				System.out.println("Zvoľte nový stav dostupnosti: ");
				Vypozicanie=sc.next();
				mojaDatabaza.upravaKnihy(názov,autori,rok,Vypozicanie);
				break;
			case 3:
				mojaDatabaza.vypisDatabázy();

				break;
			case 8:
				run=false;
				break;
				}
			}
					
		}
			
}
