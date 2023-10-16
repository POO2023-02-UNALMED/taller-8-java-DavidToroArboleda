package futbol;

public class Portero extends Futbolista {
	
	public short golesRecibidos;
	public byte dorsal;
	

	
	public Portero(String nombre, int edad, short golesRecibidos,byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	public int compareTo(Futbolista f) {
		return Math.abs(this.golesRecibidos- ((Portero)f).golesRecibidos);
	}
	
	public String toString() {
		return super.toString()+" con el dorsal " + this.dorsal + ". Le han marcado "+ this.golesRecibidos;
	}
	
	
}
