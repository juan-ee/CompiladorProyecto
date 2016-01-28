package comp;

public class DeclaracionVector {
	int tipo, tamano;
	String id;

	public DeclaracionVector(int tipo, String id, int tamano) {
		super();
		this.tipo = tipo;
		this.tamano = tamano; //necesitamos un tamano
		this.id = id;
	}

	@Override
	public String toString() {
		return "DeclaracionVector [tipo=" + tipo + ", tamano=" + tamano + ", id=" + id + "]";
	}
}
