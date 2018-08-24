package paquete1;

public class Test {

	public static void main(String[] args) {
		System.out.println(Operaciones.SUMA);
		System.out.println(Operaciones.RESTA.name());
		double a = 2;
		double b = 4;
		double res = Operaciones.SUMA.resultado(a,b);
		System.out.println(res); //patron de diseño state
		System.out.println("Hola mundosaurio");

		for(Operaciones ope:Operaciones.values()){
			System.out.println(ope.name());
		}
		
	}

}
