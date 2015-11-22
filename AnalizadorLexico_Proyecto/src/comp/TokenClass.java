package comp;

public class TokenClass {
	String tipo,token;
	int num_linea,num_column;
	
	public TokenClass(String tipo, String token) {
		super();
		this.tipo = tipo;
		this.token = token;		
		this.num_linea = -1;
	}
	public TokenClass(String tipo, String token, int linea, int column) {
		super();
		this.tipo = tipo;
		this.token = token;		
		this.num_linea = linea;
		this.num_column = column;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getNum_linea() {
		return num_linea;
	}
	public void setNum_linea(int num_linea) {
		this.num_linea = num_linea;
	}
	public int getNum_column() {
		return num_column;
	}
	public void setNum_column(int num_column) {
		this.num_column = num_column;
	}
	
	@Override
	public String toString() {		
		if(num_linea==-1){
			return tipo + "-> " + token ;
		}else{
			return tipo + "-> " + token + " en la linea:" + num_linea+" columna: "+num_column;
		}
		
	}	
	
}
