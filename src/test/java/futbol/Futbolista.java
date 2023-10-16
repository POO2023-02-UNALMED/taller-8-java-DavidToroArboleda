package futbol;

public abstract class Futbolista implements  Comparable <Object> {

	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista() {
		this.nombre = "Maradona";
		this.edad = 30;
		this.posicion = "delantero";
	}
	
	public Futbolista(String nombre, int edad, String posicion) {
		
		this.edad = edad;
		this.nombre = nombre;
		this.posicion = posicion;
		
		
	}
	
	
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() +", y juega de "+ this.getPosicion();
	}
	
	
	
	
	public boolean equals(Futbolista f) {
		if (this == f) {
			return true;
		}
		else {
			return false;
		}
	}

	
	public abstract boolean jugarConLasManos();
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}
	
	
	
	
	
	
	
	
	
}