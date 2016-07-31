
public class Reta {
	private Ponto a;
	private Ponto b;
	private double tamanho;
	
	
	public Reta(Ponto a, Ponto b) {
		
		this.a = a;
		this.b = b;
	}
	public Ponto getA() {
		return a;
	}
	public void setA(Ponto a) {
		this.a = a;
	}
	public Ponto getB() {
		return b;
	}
	public void setB(Ponto b) {
		this.b = b;
	}
	
	public void calculaTamanho(){
		tamanho=Math.sqrt(Math.pow( a.getX()-b.getX(), 2) +Math.pow(a.getY()-b.getY(), 2));
	}
	public double getTamanho(){
		this.calculaTamanho();
		return tamanho;
	}
	
	
}
