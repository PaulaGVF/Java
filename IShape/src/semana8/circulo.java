package semana8;

public class circulo implements IShape, IShow  {
	float raio;
	public circulo (float raio)
	{
		this.raio=raio;
	}

	@Override
	public void print() {
		System.out.println("Area:"+ this.getArea());
		System.out.println("Perimetro:"+ this.getPerimetro());
		
	}

	@Override
	public double getArea() {		
		return 3.14*(raio*raio);
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*3.14*raio;
	}

}