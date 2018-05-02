package mascotas;

public class ManejaMascotas {
	
	public static void main(String[] args) {
		Mascota Jazz;
		Jazz=new Mascota("Jazz",3,"perro",'h');
		System.out.println("Mi mascota se llama "+Jazz.getNombre());
		System.out.println("y tiene "+Jazz.getEdad() +" años");
		//pasa un año
		Jazz.setEdad(4);
		System.out.println("Ahora tiene "+Jazz.getEdad());
		System.out.println("por lo tanto nació en el año "+Jazz.getAnioNacimiento(2018));
	}

}
