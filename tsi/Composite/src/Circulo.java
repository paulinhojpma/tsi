
public class Circulo implements Figura{
	private double perimetro;
	private double area;
	private Reta raio;
	private static final double PI=3.14;
	@Override
	
	
	public void perimetro() {
		raio=new Reta(new Ponto(1,2), new Ponto(3,2));
		this.perimetro=2*PI*raio.getTamanho();
		System.out.println("Perimetro: "+perimetro);
		
	}

	@Override
	public void area() {
		raio=new Reta(new Ponto(1,2), new Ponto(3,2));
		this.area=PI*Math.pow(raio.getTamanho(), 2);
		System.out.println("Area: "+area);
		
	}

	@Override
	public void desenha() {
		area();
		perimetro();
		System.out.println("Um círculo foi desenhado");
		
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public String toString(){
		return "Um circulo com area de "+area +"\nE perimetro de "+perimetro;
	}

	


}
