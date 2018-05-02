package geometrias;
//Obligatorio que sea rectángulo
public class Triangulo {
	private Segmento s1;
	private Segmento s2;
	
	public Triangulo(Segmento s1, Segmento s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public double getArea(){
		double area;
		area=(s1.getDistance()+s2.getDistance())/2;
		return area;
	}
}
