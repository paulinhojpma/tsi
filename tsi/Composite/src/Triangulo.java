import java.util.List;

public abstract class Triangulo implements Figura{

	protected Reta lado1;
	protected Reta lado2;
	protected Reta lado3;

	protected double area;
	protected double perimetro;
	
	
	



	public void area(){
		//lados.get(0)=new Reta(new Ponto(0,0), new Ponto(6,0));
		//altura=new Reta(new Ponto(3,0), new Ponto(3,6));
		area=(lado1.getTamanho()+lado2.getTamanho()+lado3.getTamanho())/2;
		System.out.println("Area: "+area);
		
	}
	
	public void perimetro(){
		perimetro=lado1.getTamanho()+lado2.getTamanho()+lado3.getTamanho();
		System.out.println("Perimetro: "+perimetro);
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
