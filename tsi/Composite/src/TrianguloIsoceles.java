
public class TrianguloIsoceles extends Triangulo{

	public TrianguloIsoceles() {
		
		lado1=new Reta(new Ponto(0,0), new Ponto(6,0));
		lado2=new Reta(new Ponto(6,0), new Ponto(4,3));
		lado3=new Reta(new Ponto(4,3), new Ponto(0,0));
	}

	@Override
	public void desenha() {
		area();
		perimetro();
		System.out.println("Um triangulo Isoceles foi desenhado");
		
	}
	
	public String toString(){
		
		
		return "Um triangulo Isoceles com area de "+area +"\nE perimetro de "+perimetro;
		
	}

}
