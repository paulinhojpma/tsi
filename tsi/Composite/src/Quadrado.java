
public class Quadrado {
	private Reta lado1;
	private Reta lado2;
	private Reta lado3;
	private Reta lado4;
	private double area;
	private double perimetro;
	
	public Quadrado() {
		
		
		
		lado1=new Reta(new Ponto(0,0), new Ponto(6,0));
		lado2=new Reta(new Ponto(6,0), new Ponto(6,6));
		lado3=new Reta(new Ponto(6,6), new Ponto(0,6));
		lado4=new Reta(new Ponto(0,6), new Ponto(0,0));
	}

	public void area(){
		area=lado1.getTamanho()*lado2.getTamanho();
		
	}
	public void volume(){
		perimetro=lado1.getTamanho()+lado2.getTamanho()+lado3.getTamanho()+lado4.getTamanho();
	
	}
	public void desenhaFigura(){
		area();
		volume();
		System.out.println("Um quadrado foi desenhado");
	}

	public String toString(){
		return "Um quadrado com area de "+area +"\nE perimetro de "+perimetro;
	}
	
	public Reta getLado1() {
		return lado1;
	}

	public void setLado1(Reta lado1) {
		this.lado1 = lado1;
	}

	public Reta getLado2() {
		return lado2;
	}

	public void setLado2(Reta lado2) {
		this.lado2 = lado2;
	}

	public Reta getLado3() {
		return lado3;
	}

	public void setLado3(Reta lado3) {
		this.lado3 = lado3;
	}

	public Reta getLado4() {
		return lado4;
	}

	public void setLado4(Reta lado4) {
		this.lado4 = lado4;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
}
