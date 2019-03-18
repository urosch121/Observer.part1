package observer_db;

public class StockObserver implements Observer
{

	private double fiatCena;
	private double mbCena;
	private double infCena;
	
	private static int observerIDgenerator = 1;
	private int id;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber)
	{
		this.stockGrabber = stockGrabber;
		this.id = id;
		
		this.stockGrabber.register(this);
		
	}
		
	@Override
	public void update(double fiatCena, double mbCena, double InfCena) 
	{
		this.fiatCena = fiatCena;
		this.mbCena = mbCena;
		this.infCena = mbCena;
		
		PrintCene();
	}
	
	private void PrintCene()
	{
		System.out.println("fiatCena = cena " + this.fiatCena);
		System.out.println("mbCena = cena " + this.mbCena);
		System.out.println("infCena = cena " + this.infCena);
	}
}
