import java.util.List;

public class FiguraComposta implements Figura{
	private List<Figura> figuras;
	
	
	@Override
	public void perimetro() {
		for(Figura f: figuras){
			f.perimetro();
		}
		
	}

	@Override
	public void area() {
		for(Figura f: figuras){
			f.area();
		}
		
	}

	@Override
	public void desenha() {
		for(Figura f: figuras){
			f.desenha();
		}
		
	}
	public void adicionarFigura(Figura f){
		figuras.add(f);
	}
	public void removerFigura(Figura f){
		figuras.remove(f);
	}

}
