
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		retangulo r1= new retangulo(20.5, 15.2);
		retangulo r2= new retangulo();
		
		r2.clone(r1);
		
		r1.imprimir();
		
		r1.getArea();
		
		r1.getPerimetro();
		
	}

}
