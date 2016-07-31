
public class AdapterQuadrado implements Figura{
	Quadrado quadrado;
	
	public AdapterQuadrado(Quadrado quadrado){
		this.quadrado=quadrado;
	}
	@Override
	public void perimetro() {
		quadrado.volume();
		System.out.println("Perimetro: "+quadrado.getPerimetro());
		
	}

	@Override
	public void area() {
		quadrado.area();
		System.out.println("Area: "+quadrado.getArea());
		
	}

	@Override
	public void desenha() {
		quadrado.desenhaFigura();
		
	}
	public String toString(){
		return quadrado.toString();
	}

}
