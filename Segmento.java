package geometrias;

public class Segmento {
	private Punto p1;
	private Punto p2;
	
	public Segmento(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	
	public double getDistance(){
		float dx,dy,dz;
		double distance;
		dx=p1.getX()-p2.getX();
		dy=p1.getY()-p2.getY();
		dz=p1.getZ()-p2.getZ();
		distance=Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2)+Math.pow(dz,2));
		
		return distance;
	}
	
	
}