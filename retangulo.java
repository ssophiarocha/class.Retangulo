
public class retangulo {
	
	private double base;
	private double altura;

	
	//sobrecarga de metodos, com o mesmo nome porém diferentes assinaturas;
	public retangulo(double d, double e) {
		this.altura = d;
		this.base = e;
	}
	
	//public double setArea() {
		// TODO Auto-generated method stub
	//	return 0;
	//}

	public retangulo() {
		this.altura= 0;
		this.base= 0;
	}
	//----------------------------------------------------------------------
	
	

	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void clone(retangulo r1) {

		this.altura= r1.getAltura();
		this.base= r1.getBase();
		
	}
	
	public double getArea() {
		return this.base * this.altura;
	}

	
	public void imprimir() {

		System.out.println("A altura é: "+this.altura);
		System.out.println("A base é: "+this.base);
		System.out.println ("A area é: "+ this.getArea());
		System.out.println ("O perimetro é: "+ this.getPerimetro());
		
	}

	public double getPerimetro() {
		return 2*this.base + 2*this.altura;
		
	}

	
	

}
