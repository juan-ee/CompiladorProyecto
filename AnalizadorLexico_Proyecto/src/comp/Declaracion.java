package comp;

public class Declaracion {
	int tipo;
	String id;
	public Declaracion(int tipo, String id) {
		super();
		this.tipo = tipo;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Declaracion [tipo=" + tipo + ", id=" + id + "]";
	}
	
}
