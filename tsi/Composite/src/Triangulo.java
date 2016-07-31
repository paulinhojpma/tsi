import java.util.List;

public abstract class Triangulo implements Figura{

	private List<Reta> lados;
	private Reta altura;
	private double area;
	private double perimetro;
	
	public void area(){
		//lados.get(0)=new Reta(new Ponto(0,0), new Ponto(6,0));
		//altura=new Reta(new Ponto(3,0), new Ponto(3,6));
		area=(base.getTamanho()*altura.getTamanho())/2;
		
	}
}
