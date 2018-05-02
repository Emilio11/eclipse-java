package geometrias;
//En realidad es un paralelípedo, pero es por simplificar nombres
public class Cuadrado {
	private Segmento s1;
	private Segmento s2;
	
	public Cuadrado(Segmento s1, Segmento s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public double getArea(){
		double area=s1.getDistance()*s2.getDistance();
		return area;
	}
}