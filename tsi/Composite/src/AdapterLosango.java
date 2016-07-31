
public class AdapterLosango implements Figura{
	Losango  losango;
	
	public AdapterLosango(Losango losango){
		this.losango=losango;
	}
	@Override
	public void perimetro() {
		losango.volume();
		System.out.println("Perimetro: "+losango.getPerimetro());
		
	}

	@Override
	public void area() {
		losango.area();
		System.out.println("Area: "+losango.getArea());
		
	}

	@Override
	public void desenha() {
		losango.desenhaFigura();
		
	}
	public String toString(){
		return losango.toString();
	}
}
