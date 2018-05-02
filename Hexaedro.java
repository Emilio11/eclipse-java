package geometrias;
//Es obligado que sea un cubo.
public class Hexaedro {
	private Segmento s1;
	private Cuadrado c1;
	
	public Hexaedro(Segmento s1, Cuadrado c1) {
		this.s1 = s1;
		this.c1 = c1;
	}
	
	public double getVolumen(){
		double volumen;
		volumen=s1.getDistance()*c1.getArea();
		return volumen;
	}
	
	
}