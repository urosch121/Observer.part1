package observer_db;

import java.util.ArrayList;

public class StockGrabber implements Subject 
{
	private ArrayList<Observer> observers;
	private double fiatCena;
	private double infCena;
	private double mbCena;
	
	public StockGrabber() 
	{
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer ob) 
	{
		this.observers.add(ob);
		
	}

	@Override
	public void unregister(Observer ob) 
	{
		int index = this.observers.indexOf(ob);
		System.out.println("Obrisali smo observer sa indeksom " + index);
		this.observers.remove(index);
	}
	
	@Override
	public void notifyObservers()
	{
		for(Observer observer : this.observers)
			observer.update(this.fiatCena, this.mbCena, this.infCena);
	}
	
	public void setFiatCena(double cena)
	{
		this.fiatCena = cena;
	}
	
	public void MbCena(double cena)
	{
		this.mbCena = cena;
	}
	
	public void setInfCena(double cena)
	{
		this.infCena = cena;
	}
	

}
