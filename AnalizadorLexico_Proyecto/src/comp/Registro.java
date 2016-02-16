package comp;

public class Registro {
	String id,reg;

	public Registro(String id, String reg) {
		super();
		this.id = id;
		this.reg = reg;
	}

	@Override
	public String toString() {
		return "Registro [id=" + id + ", reg=" + reg + "]";
	}
	
	
}
