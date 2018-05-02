package geometrias;

public class ManejaFiguras {
	public static void main(String[] args){
		Punto a,b,c,e; //y el d no hace falta
		Segmento ab,ac,ae;
		Cuadrado R;
		Hexaedro H;
		Tetraedro Td;
		Triangulo Tr;
		PrismaTr Pr;
		
		//Hexaedro
		
		a=new Punto (2,2,2);
		b=new Punto (2,5,2);
		c=new Punto (2,2,5);
		//d=new Punto ...  NO HACE FALTA, tres puntos ya definen un paralelípedo, 4 un hexaedro.
		e=new Punto (5,2,2);
		
		ac= new Segmento(a,c);
		ab= new Segmento(a,b);
		ae= new Segmento(a,e);
		
		R=new Cuadrado(ab,ac);
		H=new Hexaedro(ae,R);
		
		System.out.println("El segmento es de longitud "+ab.getDistance());
		System.out.println("El segmento 2 es de longitud "+ac.getDistance());
		System.out.println("El segmento 3 es de longitud "+ae.getDistance());
		System.out.println("El area del cuadrado (La base) es de "+R.getArea());
		System.out.println("El volumen que forman los tres segmentos como cubo es de "+H.getVolumen());
		
		//Tetraedro:
		Tr=new Triangulo(ab,ac); 
		Td=new Tetraedro(ab,ac,ae); //Otra forma de definir la figura, sin necesidad de usar un triangulo
		System.out.println("Usando los mismos segmentos");
		System.out.println("El area del triangulo (La base) es de "+Tr.getArea());
		System.out.println("El volumen que forman como un tetraedro es es de "+Td.getVolumen());
		
		//Prisma triangular
		Pr=new PrismaTr(Tr,ae);
		System.out.println("El volumen que forman los tres segmentos siendo un prisma es de "+Pr.getVolumen());
		
		
	}
}