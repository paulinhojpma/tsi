
public class TrianguloEscaleno extends Triangulo{

	public TrianguloEscaleno() {
		
		lado1=new Reta(new Ponto(0,0), new Ponto(6,0));
		lado2=new Reta(new Ponto(6,0), new Ponto(4,3));
		lado3=new Reta(new Ponto(4,3), new Ponto(0,0));
	}

	@Override
	public void desenha() {
		area();
		perimetro();
		System.out.println("Um triangulo Escaleno foi desenhado");
		
	}
	
public String toString(){
		
		
		return "Um triangulo Escaleno com area de "+area +"\nE perimetro de "+perimetro;
		
	}

}
