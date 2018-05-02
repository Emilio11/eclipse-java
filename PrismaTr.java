package geometrias;

public class PrismaTr {
	private Triangulo t1;
	private Segmento s1;
	
	public PrismaTr(Triangulo t1, Segmento s1) {
		super();
		this.s1 = s1;
		this.t1= t1;
	}
	
	public double getVolumen(){
		double volumen;
		volumen=s1.getDistance()*t1.getArea();
		return volumen;
	}
	
}
