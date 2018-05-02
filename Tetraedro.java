package geometrias;
//Es obligado que sea un hexaedro con los lados a 90 grados entre ellos.
public class Tetraedro {
	private Segmento s1,s2,s3;
	
	public Tetraedro(Segmento s1, Segmento s2, Segmento s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	public double getVolumen(){
		double volumen;
		volumen=s1.getDistance()*s2.getDistance()*s3.getDistance()*Math.sqrt(2)/12;
		return volumen;
	}



	
	
	
}